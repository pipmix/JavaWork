package Homework1;

public class Problem06 {
	
	public static void Run() {
		IsNumberEven(11);
	}


	
	public static void IsNumberEven(int n) {
		
		System.out.println("\nProblem 6: is number even");
		// simple mod operator returns even if the number is dividable by 2
		if ((n % 2) == 0) System.out.println(n + " is Even");
		// output verfication
		else System.out.println(n + " is Odd");
	}
}
