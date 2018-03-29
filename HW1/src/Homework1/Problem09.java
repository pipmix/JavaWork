package Homework1;

import java.util.ArrayList;

public class Problem09 {
	
	public static void Run() {
		PrimeList();
	}
	
	public static void PrimeList() {
		
		// create a empty list to hold integers
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		// add the numbers 1 - 100 in the empty list
		for (int i = 1; i <= 100; i++) {
			numberList.add(new Integer(i));
			
		}
		
		// for each number call the IsPrime function to determine is prime and if so then print out the numbers
		for (int i : numberList) {
			if (IsPrime(i)) System.out.println(i);
		}
		
		
	}
	// This function returns true if a number is prime
	public static boolean IsPrime(int number) {
		// starting with 2 divide the number by increment up to the half the number. if 0
		// the number is divisible by another number and thus not prime. 
		for (int i = 2; i <= (number / 2); i++) {
			if (number % i == 0) return false;
		}
		return true;
	}
	

}
