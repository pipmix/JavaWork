package Homework1;

public class Problem03 {
	
	public static void Run() {
		StringReverse("newcatdog");
	}
	
	
	public static void StringReverse(String s) {

		// create a empty string the same length as the original string
		char newString[]  = new char [s.length()];
		int count = 0;
		
		// loops though each place in the new string array and plays the opposite place of the original string
		for (int i = 0; i < s.length(); i++) {
			newString[i] = s.charAt(s.length() - 1 - i);
			
		}
		
		// output verification
		System.out.println("\nProblem 3 reverse string");
		System.out.println(newString);
		System.out.println("\n");
		
		
	}

}
