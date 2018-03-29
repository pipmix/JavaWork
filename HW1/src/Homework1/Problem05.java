package Homework1;

public class Problem05 {
	
	
	public static void Run() {
		
		// output verification
		System.out.println("Problem 5 Substring: ");
		String subStr = new String(GetSubString(5, "newcatdogmix"));
		System.out.println(subStr);
	}
	
	// method returns the substring requested from the orginal string
	public static char[] GetSubString(int strLength, String string) {
		
		// create a new char array the length of the requested substring
		char newString[]  = new char [strLength];
		
		// starting from the 1st place of the substring set each place of the new array to the characted from the orginal string
		for (int i = 0; i < strLength; i++ ) {
			newString[i] = string.charAt(i);
		}
		return newString;
	}

}
