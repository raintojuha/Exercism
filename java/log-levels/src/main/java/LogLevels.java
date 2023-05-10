import java.lang.*;

public class LogLevels {
    
    public static String message(String logLine) {
    	
    	return logLine.replace("\r", "").replace("\n", "");
    }

    public static String logLevel(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
    }

    public static String reformat(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
    }

    public static void main(String[] args) {
    	System.out.println(message("Hello\n\r"));
    	System.out.println("Hello");
    }
}
