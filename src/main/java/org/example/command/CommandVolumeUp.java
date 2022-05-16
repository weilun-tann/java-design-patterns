package org.example.command;

public class CommandVolumeUp implements Command {

    private final Television television;
    private final int amount;

    public CommandVolumeUp(final Television television, final int amount) {
        this.television = television;
        this.amount = amount;
    }

    @Override
    public void execute() {
        this.television.increaseVolume(this.amount);
    }

    @Override
    public void undo() {
        this.television.decreaseVolume(this.amount);

    }

    @Override
    public void redo() {
        this.television.increaseVolume(this.amount);
    }
}
