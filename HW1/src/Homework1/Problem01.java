package Homework1;

public class Problem01 {
	
	
	public static void Run() {
		
		int p1arr [] =  {1,0,5,6,3,2,3,7,9,8,4};
		BubbleSort(p1arr);
		
	}
	
	public static void BubbleSort(int[] a) {
		
		// Get length of array and setup variables
		int arrLength = a.length;
		boolean hasSwapped = true;
		int temp = 0;
		
		// Go through the array and compare the 2nd number to the first
		while(hasSwapped) {
			hasSwapped = false;
			for (int i = 0; i < arrLength - 1; i++) {
				if (a[i] > a[i+1]) {
					// This runs when the 2nd number is higher than the 1st and sets the swap flag
					// so that the loop with be iterated again
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					hasSwapped= true;
				}
			}
		}
		
		// Print out for verification
		System.out.println("Problem 1 Bubblesort: ");
		for (int i : a) {
			System.out.println(i);
		}
	}

}
