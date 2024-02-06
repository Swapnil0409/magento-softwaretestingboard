package utils;

public class Matcher {

    /**
     * Private constructor to prevent this class from being instantiated. The class does not need to instantiated
     * as its methods are static.
     */
    private Matcher() {

    }

    /**
     * Method which throws an assertions error and stops the running test.
     * @param message The message which explains what failed.
     */
    public static void fail(String message) {
        if (message == null) {
            throw new AssertionError();
        } else {
            throw new AssertionError(message);
        }
    }
}
