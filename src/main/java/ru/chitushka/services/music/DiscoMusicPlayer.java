package ru.chitushka.services.music;

import ru.chitushka.services.DestroyMethod;
import ru.chitushka.services.InitMethod;

public class DiscoMusicPlayer implements MusicPlayer, InitMethod, DestroyMethod {
    @Override
    public String getMusicType() {
        return "Disco dance";
    }
}
