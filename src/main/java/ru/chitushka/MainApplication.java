package ru.chitushka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.chitushka.models.Book;
import ru.chitushka.services.BookService;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

        Book simpleBook = bookService.findByIsdn("ISDN-200");

        System.out.println(simpleBook);
    }
}
