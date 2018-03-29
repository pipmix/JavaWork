package Homework1;

public class Problem04 {

	public static void Run() {
		ComputeFactorial(8);
	}
	
	
	public static void ComputeFactorial(int n) {
		int fact = 1;
		// ignoring 0 this loop will multiple each number up to the inputed number and save it in the varible fact
		for (int i = 0; i < n; i++) {
			if ( i != 0)fact *= i;
		}
		// output verfication
		System.out.println("Problem 4 Factorial: ");
		System.out.println(fact);
	}
}
