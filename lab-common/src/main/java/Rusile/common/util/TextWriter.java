package Rusile.common.util;



import java.io.PrintStream;

public class TextWriter {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static PrintStream printStream = System.out;

    public static void printInfoMessage(String message) {
        printStream.println(ANSI_BLUE + message + ANSI_RESET);
    }

    public static void printErr(String message) {
        printStream.println(ANSI_RED + message + ANSI_RESET);
    }

    public static void printSuccessfulMessage(String message) {
        printStream.println(ANSI_GREEN + message + ANSI_RESET);
    }
    public static String getGreenText(String text) {
        return ANSI_GREEN + text + ANSI_RESET;
    }

    public static String getRedText(String text) {
        return ANSI_RED + text + ANSI_RESET;
    }


}
