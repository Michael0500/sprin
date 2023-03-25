package ru.chitushka.services.music;

public class ClassicalMusicPlayer implements MusicPlayer {
    @Override
    public String getMusicType() {
        return "Classic music";
    }
}
