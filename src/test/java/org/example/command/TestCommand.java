package org.example.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestCommand {
    @Test
    void shouldIncreaseVolume() {
        Television television = new Television(25);
        Command command = new CommandVolumeUp(television, 5);
        command.execute();
        assertEquals(30, television.getVolume());

        command.undo();
        assertEquals(25, television.getVolume());

        command.redo();
        assertEquals(30, television.getVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Television television = new Television(25);
        Command command = new CommandVolumeDown(television, 5);
        command.execute();
        assertEquals(20, television.getVolume());

        command.undo();
        assertEquals(25, television.getVolume());

        command.redo();
        assertEquals(20, television.getVolume());
    }
}
