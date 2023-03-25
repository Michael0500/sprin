package ru.chitushka.old.services.message;

public class HelloMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Hello world!";
    }
}
