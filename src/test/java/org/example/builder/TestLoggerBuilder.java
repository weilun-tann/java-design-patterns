package org.example.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestLoggerBuilder {
    @Test
    void shouldBuildLogger() {
        Logger logger = new LoggerBuilder()
                .setName("debugLogger")
                .setLevel("debug")
                .setLogFile("log.txt")
                .build();

        assertEquals("Logger [name=debugLogger, level=debug, logFile=log.txt]", logger.toString());
    }
}
