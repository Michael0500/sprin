package ru.chitushka.services.music;

import ru.chitushka.services.InitializationMethod;

public class RockMusicPlayer implements MusicPlayer, InitializationMethod {
    @Override
    public String getMusicType() {
        return "Rock music!!!!";
    }
}
