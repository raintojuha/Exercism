/**
 * Solution from andreaspw
 * Got stuck and needed help
 * A great learning experience
 * Especially in ternary operator
 */

class MicroBlog {
    public static String truncate(String input) {
    	/**
    	 * If input is longer than 5 characters
    	 * use substring() to shorten it.
    	 * Use offsetByCodePoints (from index 0 to index 5) to get the max length for subtring
    	 */
    	return input.length() < 6 ? input : input.substring(0, input.offsetByCodePoints(0, 5));
    }
}
