/**
 * Solution from andreaspw
 * Got stuck and needed help
 * A great learning experience
 * Especially in ternary operator
 */

class MicroBlog {
    public static String truncate(String input) {
    	return input.length() < 6 ? input : input.substring(0, input.offsetByCodePoints(0, 5));
    }
}
