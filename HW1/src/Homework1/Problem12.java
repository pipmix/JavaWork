package Homework1;

import java.util.ArrayList;

public class Problem12 {
	
	public static void Run() {
		EvenArrayPrint(100);
	}
	
	public static void EvenArrayPrint(int num) {
		// create list  of ints to hold the even numbers		
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		// insert up to the argument number into the list
		for (int i = 1; i <= num; i++) {
			numberList.add(new Integer(i));
			
		}
		//cycle through the list and if a number is even print out the number
		System.out.println("Problem 11: Even numbers");
		for (int i : numberList) {
			if (i % 2 == 0) System.out.println(i);
		}
	}
}
