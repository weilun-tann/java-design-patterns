package org.example.command;

public class Television {
    private int volume = 0;

    public Television(int initialVolume) {
        this.volume = initialVolume;
    }

    public void increaseVolume(int amount) {
        this.volume += amount;
    }

    public void decreaseVolume(int amount) {
        this.volume -= amount;
    }

    public int getVolume() {
        return this.volume;
    }
}