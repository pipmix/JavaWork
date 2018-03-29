package Homework1;

import java.util.ArrayList;

public class Problem19 {
	
	public static void Run() {
		ArrayListMath(10);
	}
	
	public static void ArrayListMath(int num) {
		
		//variable setup
		int evenNums = 0;
		int oddNums = 0;
		
		// create a empty list to hold ints
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		// add the numbers 1 - 10 to the list
		for (int i = 1; i <= 10; i++) {
			numberList.add(new Integer(i));
		}
		// cycle through the list and check if even or odd if so add to the corresponding variable
		for (int j : numberList) {
			if (j % 2 == 0) {
				evenNums += j;
			}
			else {
				oddNums += j;
			}
		}
		// cycle through the list and check if a number is prime, if so remove is called and it removes it from the list
		for (int k = 0; k < numberList.size(); k++){
			if ( IsPrime(k))numberList.remove(k);
		}
		
		//out put verification
		System.out.println("Even numbers add to " + evenNums);
		System.out.println("Odd numbers add to " + oddNums);
		System.out.println("List with no primes:");
		// print whats left of the list after the primes are removes
		for (int l : numberList) {
			System.out.println(l);
		}
		
	}
	
	//check to see if number is a prime and returns true if so
	public static boolean IsPrime(int number) {
		
		for (int i = 2; i <= (number / 2); i++) {
			if (number % i == 0) return false;
		}
		return true;
	}
}
