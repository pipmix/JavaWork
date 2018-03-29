package Homework1;



public class Problem15 {
	
	// sample functions
	public static void Run() {
		CallInterface(30, 15);
		CallInterface(3, 9);
	}
	
	
	public static void CallInterface(int a, int b) {
		// create a mathstuff class which impliments the interfeace
		MathStuff mathStuff = new MathStuff();
		System.out.println("\nProblem 15 Interface");
		// calls the implimented simple math functions
		System.out.println("Add "+ a + " and " + b + ":   " + mathStuff.Addition(a, b));
		System.out.println("Sub "+ a + " and " + b + ":   " + mathStuff.Subtraction(a, b));
		System.out.println("Mul "+ a + " and " + b + ":   " + mathStuff.Multiplication(a, b));
		System.out.println("Div "+ a + " and " + b + ":   " + mathStuff.Division(a, b));
	}
	
	// a non defined interface which is implmented later
	public interface MathInterface {
		
		public int Addition(int a, int b);
		public int Subtraction(int a, int b);
		public int Multiplication(int a, int b);
		public int Division(int a, int b);

	}
	// inherts from the math interface and imliments the functions
	static public class MathStuff implements MathInterface{
		// simple add sub mul and div functions return result
		@Override 
		public int Addition(int a, int b) {
			return a + b;
		}

		@Override
		public int Subtraction(int a, int b) {
			return a - b;
		}

		@Override
		public int Multiplication(int a, int b) {
			return a * b;
		}

		@Override
		public int Division(int a, int b) {
			if (b == 0)return 0;
			return a / b;
		}
	}
}
