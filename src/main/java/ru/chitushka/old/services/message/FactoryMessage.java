package ru.chitushka.old.services.message;

public class FactoryMessage {
    public static MessageService getInstanceMessageService() {
        return new HelloMessageService();
    }
}
