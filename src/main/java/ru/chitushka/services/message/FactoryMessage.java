package ru.chitushka.services.message;

public class FactoryMessage {
    public static MessageService getInstanceMessageService() {
        return new HelloMessageService();
    }
}
