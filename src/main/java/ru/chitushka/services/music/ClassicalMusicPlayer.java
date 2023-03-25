package ru.chitushka.services.music;

import jakarta.annotation.PreDestroy;
import ru.chitushka.services.DestroyMethod;
import ru.chitushka.services.InitMethod;

public class ClassicalMusicPlayer implements MusicPlayer, InitMethod, DestroyMethod {
    @Override
    public String getMusicType() {
        return "Classic music";
    }
}
