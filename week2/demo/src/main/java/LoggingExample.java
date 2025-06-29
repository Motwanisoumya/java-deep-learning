import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    // 1. Grab a logger for this class
    private static final Logger logger =
        LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        // 2. Log at different levels
        logger.error("This is an ERROR message");
        logger.warn("This is a WARNING message");
        logger.info("This is just INFO (won’t show if root level > info)");
        logger.debug("This is DEBUG (won’t show if root level > debug)");
    }
}
