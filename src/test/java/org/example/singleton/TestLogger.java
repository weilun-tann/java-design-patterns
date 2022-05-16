package org.example.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestLogger {

    @Test
    void shouldReturnIdenticalLoggerObject() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        assertEquals(logger1, logger2);
    }
}
