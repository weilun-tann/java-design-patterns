package org.example.builder;

public class LoggerBuilder {
    private String name;
    private String level;
    private String logFile;

    public LoggerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public LoggerBuilder setLevel(String level) {
        this.level = level;
        return this;
    }

    public LoggerBuilder setLogFile(String logFile) {
        this.logFile = logFile;
        return this;
    }

    public Logger build() {
        return new Logger(name, level, logFile);
    }
}
