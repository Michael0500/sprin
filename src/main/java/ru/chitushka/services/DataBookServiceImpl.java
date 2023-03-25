package ru.chitushka.services;

import ru.chitushka.models.Book;
import ru.chitushka.models.BookImpl;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class DataBookServiceImpl implements BookService {
    private final static List<Book> books = List.of(
            new BookImpl("Simple book 0", "ISDN-000", new String[]{"Chehov"}, 1990),
            new BookImpl("Simple book 1", "ISDN-100", new String[]{"Dostoevsky"}, 1991),
            new BookImpl("Simple book 2", "ISDN-200", new String[]{"Chehov", "Nekrasov"}, 1992),
            new BookImpl("Simple book 3", "ISDN-300", new String[]{"Marshak", "Leonid"}, 1993)
    );

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
