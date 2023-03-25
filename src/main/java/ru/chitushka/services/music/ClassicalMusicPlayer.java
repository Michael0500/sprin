package ru.chitushka.services.music;

import jakarta.annotation.PostConstruct;
import ru.chitushka.services.InitializationMethod;

public class ClassicalMusicPlayer implements MusicPlayer, InitializationMethod {
    @Override
    public String getMusicType() {
        return "Classic music";
    }
}
