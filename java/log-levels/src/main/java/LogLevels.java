import java.lang.*;

public class LogLevels {
    
	
	/**
	 * Get message from the logline
	 * Remove whitespaces
	 * Return message string
	 */
    public static String message(String logLine) {
    	
    	// Remove character escaping
    	String msg = logLine.replace("\r", "") // carriage return
    						.replace("\n", "") // new line
    						.replace("\t", ""); // tabulator
    	
    	// Use ']: ' as a split point to sepaprate message
    	msg = msg.split("]: ")[1];
    	
    	// While the first character is a white space
    	while(msg.charAt(0) == 32) {
    		// Create a new string ignoring that whitespace
    		msg = msg.substring(1, msg.length());
    	}
    	
    	// While the last character is a white space
    	while(msg.charAt(msg.length() - 1) == 32) {
    		// Create a new string ignoring that whitespace
    		msg = msg.substring(0, msg.length() - 2);
    	}
    	
    	return msg; 
    }

    /**
     * Look for [LEVEL] in the logline
     * Return plain string with error level
     */
    public static String logLevel(String logLine) {
    	
    	if (logLine.contains("[INFO]")) {
    		return "info";
    	} else if (logLine.contains("[WARNING]")) {
    		return "warning";
    	} else if (logLine.contains("[ERROR]")) {
    		return "error";
    	} else {
    		return "unknown error type";
    	}
    }

    
    /**
     * Return reformatted error message
     */
    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
