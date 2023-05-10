import java.lang.*;

public class LogLevels {
    
    public static String message(String logLine) {
    	String msg = logLine.replace("\r", "").replace("\n", ""); // Replace white spaces
    	
    	return msg.split("]: ")[1]; // Use ']: ' as a split point to get message
    }

    public static String logLevel(String logLine) {

    	
        throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
    }

    public static String reformat(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
    }

    public static void main(String[] args) {
    	System.out.println(message("[WARNING]: Invalid operation\n\r"));
    	System.out.println("Hello");
    }
}
