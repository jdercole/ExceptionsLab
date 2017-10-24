
package lab3;

/**
 *
 * @author Jenna
 */
public class CustomValidationException extends IllegalArgumentException {
    private static String errMsg = "Input doesn't conform to valid format!";

    public CustomValidationException() {
        super(errMsg);
    }

    public CustomValidationException(String s) {
        super(s);
    }

    public CustomValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomValidationException(Throwable cause) {
        super(cause);
    }
    
}
