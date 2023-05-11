class ReverseString {
	/**
	 * Method to reverse a string
	 * 
	 * This solution uses only String methods. While a char array was my first idea,
	 * chars have their own module in Exercism with its own Reverse String exercise.
	 */
    static String reverse(String inputString) {        
        // New string for reversed result
        String newString = "";
       
        for(int i = 0; i < inputString.length(); i++) {
        	// Use substring() to isolate one character and add it to the new string
        	newString += inputString.substring(inputString.length()-i-1, inputString.length()-i);
        }
        
        return newString;
       
    }
}
