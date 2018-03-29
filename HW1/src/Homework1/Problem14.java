package Homework1;

import java.time.LocalDateTime;

public class Problem14 {
	
	public static void Run() {
		SwitchCases(1);
		SwitchCases(2);
		SwitchCases(3);
	}
	
	public static void SwitchCases(int i) {
		//simple swtich statement with 3 cases
		switch (i) {
		case 1:
			System.out.println("Case 1");
			// uses math lib to get square root of some number
			System.out.println("Square root of 55 is " + Math.sqrt(55));
			break;
		case 2:
			System.out.println("Case 2");
			// use java lib to get get current date and then print
			LocalDateTime now = LocalDateTime.now();
			System.out.println("Current Date is: " + now);
			break;
		case 3:
			// uses space delimiter to split the string and cycles through each string array
			System.out.println("Case 3");
			String stringToCut = "I am learning Core Java";
			String cutString [] = stringToCut.split(" ");
			for (String j : cutString) System.out.println(j);
			break;
		default:
			System.out.println("Default Case");
		}
	}
}
