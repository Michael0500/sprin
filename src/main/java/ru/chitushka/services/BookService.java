package ru.chitushka.services;

import ru.chitushka.models.Book;

import java.util.List;

public interface BookService {
    Book findByIsdn(String isdn);
    List<Book> findAll();
}
