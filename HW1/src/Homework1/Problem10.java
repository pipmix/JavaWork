package Homework1;

public class Problem10 {

	public static void Run() {
		// output verification
		System.out.println("\nProblem 10 Ternery: ");
		System.out.println(TernaryCompare(55,19) + " is min");
	}
	
	// if a is less than b function returns a otherwise function returns b
	public static int TernaryCompare(int a, int b) {
		return (a < b) ? a : b;
	}
}
