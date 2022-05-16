package org.example.builder;

public class Logger {
    private String name;
    private String level;
    private String logFile;

    public Logger(String name, String logLevel, String logFile) {
        this.name = name;
        this.level = logLevel;
        this.logFile = logFile;
    }

    @Override
    public String toString() {
        return "Logger [name=" + name + ", level=" + level + ", logFile=" + logFile + "]";
    }
}
