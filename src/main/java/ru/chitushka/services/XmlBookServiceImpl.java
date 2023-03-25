package ru.chitushka.services;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import ru.chitushka.models.Book;
import ru.chitushka.models.BookImpl;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class XmlBookServiceImpl implements BookService {
    private final static String xmlFileName = "books.xml";
    private List<Book> books = new ArrayList<>();

    public XmlBookServiceImpl() throws ParserConfigurationException, IOException, SAXException {
        //File file = new File(xmlFileName);
        Resource file = new ClassPathResource(xmlFileName);
        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document document = documentBuilder.parse(file.getFile());

        NodeList book = document.getElementsByTagName("book");
        for (var i = 0; i < book.getLength(); i++) {
            var b = book.item(i);
            var child = b.getChildNodes();

            String title = "";
            int year = 0;
            String isdn = "";
            String[] authors = new String[0];
            for (var j = 0; j < child.getLength(); j++) {
                var ch = child.item(j);
                switch (child.item(j).getNodeName()) {
                    case "title":
                        title = ch.getTextContent();
                        break;
                    case "year":
                        year = Integer.parseInt(ch.getTextContent());
                        break;
                    default:
                        break;
                }
            }

            var attr = b.getAttributes();
            for (int j = 0; j < attr.getLength(); j++) {
                if ("isdn".equals(attr.item(j).getNodeName())) {
                    isdn = attr.item(j).getNodeValue();
                }
            }

            books.add(new BookImpl(title, isdn, authors, year));
        }

    }

    @Override
    public Book findByIsdn(String isdn) {
        AtomicReference<Book> result = new AtomicReference<>();

        books.forEach(b -> {
            if (b != null && b.getIsdn().equals(isdn)) {
                result.set(b);
            }
        });


        return result.get();
    }

    @Override
    public List<Book> findAll() {
        return null;
    }
}
