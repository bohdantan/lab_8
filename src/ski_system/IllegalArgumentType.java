package ski_system;

/**
 * This runtime exception is unchecked. It indicates about wrong type of argument.
 */
public class IllegalArgumentType extends RuntimeException {
    public IllegalArgumentType() {
        super();
    }

    public IllegalArgumentType(String message) {
        super(message);
    }

    public IllegalArgumentType(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalArgumentType(Throwable cause) {
        super(cause);
    }

    protected IllegalArgumentType(String message, Throwable cause,
                                  boolean enableSuppression,
                                  boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
