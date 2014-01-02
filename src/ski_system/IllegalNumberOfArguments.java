package ski_system;

/**
 * This runtime exception is unchecked. It indicates about wrong number of arguments.
 */
public class IllegalNumberOfArguments extends RuntimeException {
    public IllegalNumberOfArguments() {
        super();
    }

    public IllegalNumberOfArguments(String message) {
        super(message);
    }

    public IllegalNumberOfArguments(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalNumberOfArguments(Throwable cause) {
        super(cause);
    }

    protected IllegalNumberOfArguments(String message, Throwable cause,
                               boolean enableSuppression,
                               boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
