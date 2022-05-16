package org.example.singleton;

/**
 * Singleton Design Pattern
 */
public class Logger implements Cloneable {
    // A private static instance of the class, marked as volatile to avoid L1 cached copies from being out of sync
    private static Logger logger = null;

    // private static Logger logger = new Logger(); // eager initialization

    /**
     * Private constructor to avoid client applications to use constructor
     */
    private Logger() {
    }

    /**
     * A synchronized method to avoid multiple threads accessing the method at
     * the same time
     */
    public static synchronized Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    /**
     * Logs the message to the console
     */
    public void log(String message) {
        System.out.println(message);
    }

    /**
     * Overrides the clone method to prevent cloning of the singleton instance
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
