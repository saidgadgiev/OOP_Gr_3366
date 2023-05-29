import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
    private static final Logger LOGGER = Logger.getLogger(MyLogger.class.getName());
    private static FileHandler fileHandler;

    static {
        try {
            fileHandler = new FileHandler("logs.txt", true);
            fileHandler.setLevel(Level.ALL);
            Formatter formatter = new SimpleFormatter() {
                @Override
                public String format(LogRecord record) {
                    return "[" + record.getLevel() + "] " + record.getMessage() + "\n";
                }
            };
            fileHandler.setFormatter(formatter);
            LOGGER.addHandler(fileHandler);
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "An exception occurred", e);
        }
    }

    public static void info(String message) {
        LOGGER.info(message);
    }

    public static void warning(String message) {
        LOGGER.warning(message);
    }

    public static void error(String message, Throwable throwable) {
        LOGGER.log(Level.SEVERE, message, throwable);
    }

    public static void close() {
        fileHandler.close();
    }
//    Использование логгеров

}
