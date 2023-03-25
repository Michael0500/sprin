package ru.chitushka.services.music;

import ru.chitushka.services.InitializationMethod;

public class DiscoMusicPlayer implements MusicPlayer, InitializationMethod {
    @Override
    public String getMusicType() {
        return "Disco dance";
    }
}
