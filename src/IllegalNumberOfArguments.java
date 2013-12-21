/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 18.12.13
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
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
