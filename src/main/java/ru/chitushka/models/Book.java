package ru.chitushka.models;

public interface Book {
    String getIsdn();
    String getTitle();
    int getYear();
    String[] getAuthors();
}
