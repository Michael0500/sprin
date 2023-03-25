package ru.chitushka.old.services;

import jakarta.annotation.PreDestroy;

public interface DestroyMethod {
    @PreDestroy
    default void destroyMethod() {
        System.out.println("Destroy bean");
    }
}
