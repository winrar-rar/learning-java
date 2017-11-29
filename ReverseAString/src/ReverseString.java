
/**
 * Simple program that can reverse a String.
 * @author Christian Andersson
 *
 */
public class ReverseString {
	public static void main(String[] args) {
		String str = "Hoppla";
		
		System.out.println(reverse(str));
	}

	/**
	 * Reverses a String: "Hoppla" -> "alppoH" 
	 * @param str - the old String.
	 * @return - the new String that is reversed.
	 */
	private static String reverse(String str) {
		int length = str.length(); //gets the length of the String.
		
		//Uses StringBuilder because StringBuilder (as well as StringBuffer) is mutable 
		//meaning it can change its values. String is immutable, if you try to alter its value, 
		//another object is created.
		//
		//Declares the StringBuilder outside the loop instead of inside it,
		//because otherwise it would be declared each time it is looped and clog up the memory.
		StringBuilder newStr = new StringBuilder(length);
		
		//loop that goes through the length of the String. Starts at the end of the old String and ends where it start.
		for(int i = (length-1); i >= 0; i--) {
			newStr.append(str.charAt(i)); //append the current character to newStr.
		}
		
		return newStr.toString(); // returns newStr.
	}
}
