package Homework1;

public class Problem02 {
	
	public static void Run() {
		Fib(25);
	}
	
	public static void Fib(int num) {
		
		int numN1 = 0;
		int numN2 = 0;
		int curNum = 0;

		System.out.println("Problem 2 Fib: ");
		
		// starting from zero the loop runs the number of intended output numbers
		for (int i = 0; i < num; i++) {
			// special case for the first 2 numbers
			if (i == 0) numN2 = 0;
			else if (i == 1) numN1 = 1;
			// this simply adds the 2 previous numbers into a 3rd number and then repeats the loop
			else {
				curNum = numN1 + numN2;
				// output the the current number then sets the n-1 and n-2
				System.out.println(curNum);
				numN2 = numN1;
				numN1 = curNum;
			}
		}
	}

}
