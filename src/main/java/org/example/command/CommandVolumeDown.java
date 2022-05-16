package org.example.command;

public class CommandVolumeDown implements Command {

    private final Television television;
    private final int amount;

    public CommandVolumeDown(final Television television, final int amount) {
        this.television = television;
        this.amount = amount;
    }

    @Override
    public void execute() {
        this.television.decreaseVolume(this.amount);
    }

    @Override
    public void undo() {
        this.television.increaseVolume(this.amount);

    }

    @Override
    public void redo() {
        this.television.decreaseVolume(this.amount);
    }
}
