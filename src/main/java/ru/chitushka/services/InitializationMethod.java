package ru.chitushka.services;

import jakarta.annotation.PostConstruct;

public interface InitializationMethod {
    @PostConstruct
    default void initMethod() {
        System.out.println("Call initMethod");
    }
}
