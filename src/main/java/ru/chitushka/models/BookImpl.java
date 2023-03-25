package ru.chitushka.models;

import java.util.Arrays;

public class BookImpl implements Book {
    private String title;
    private String isdn;
    private String[] authors;
    private int year;

    @Override
    public String toString() {
        return "BookImpl{" +
                "title='" + title + '\'' +
                ", isdn='" + isdn + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", year=" + year +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsdn() {
        return isdn;
    }

    public void setIsdn(String isdn) {
        this.isdn = isdn;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public BookImpl(String title, String isdn, String[] authors, int year) {
        this.title = title;
        this.isdn = isdn;
        this.authors = authors;
        this.year = year;
    }

    public BookImpl() {
    }
}
