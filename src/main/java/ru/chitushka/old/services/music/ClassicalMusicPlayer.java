package ru.chitushka.old.services.music;

import ru.chitushka.old.services.InitMethod;
import ru.chitushka.old.services.DestroyMethod;

public class ClassicalMusicPlayer implements MusicPlayer, InitMethod, DestroyMethod {
    @Override
    public String getMusicType() {
        return "Classic music";
    }
}
