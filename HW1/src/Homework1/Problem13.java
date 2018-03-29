package Homework1;

public class Problem13 {
	
	public static void Run() {
		PrintTriangle();
	}
	
	
	public static void PrintTriangle() {
		int count = 0;
		boolean num = false;
		
		// outter loop prints out each row
		for (int i = 0; i < 4; i++) {
			System.out.print("\n");
			// inner loop prints out each number, incrementing a character per row
			for (int j = 0; j <= i; j++ )
				//print out 0
				if (num == false) {
					System.out.print(0 + " ");
					// alternate between 0 and 1
					num = !num;
				}
				// print out 1
				else if (num == true) {
					System.out.print(1 + " ");
					num = !num;
				}
		}
	}
}
