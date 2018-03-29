package Homework1;

import java.util.ArrayList;

public class Problem08 {
	
	public static void Run() {
		Palindromes();
	}
	
	public static void Palindromes() {
		
		// create a new array list and add the names in the problem
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> palList = new ArrayList<String>();
		nameList.add(new String("karan"));
		nameList.add(new String("madam"));
		nameList.add(new String("tom"));
		nameList.add(new String("civic"));
		nameList.add(new String("radar"));
		nameList.add(new String("jimmy"));
		nameList.add(new String("kayak"));
		nameList.add(new String("john"));
		nameList.add(new String("refer"));
		nameList.add(new String("billy"));
		nameList.add(new String("did"));
		// calls the function to check palidrome  on each name in the arraylist
		for (String i : nameList) {
			if (IsPalindrome(i)) {
				palList.add(i);
			}
		}
		// output validation prints each correct palidrome
		System.out.println("\nProblem 8: Palidrome List: ");
		for (String i : palList) {
			System.out.println(i);
		}
		
		
		
	}
	
	public static boolean IsPalindrome(String s) {
		int stringLength = s.length() - 1;
		int curChar = 0;
		// to check if a palidrome the this loop compares the first and last character then iterates 1 each way  
		while(true) {
			if (s.charAt(curChar++) == s.charAt(stringLength--)) {
				// breaks if character does not match 
				if (curChar > stringLength) break;	
			}
			else return false;
		}
		return true;
	}
}
