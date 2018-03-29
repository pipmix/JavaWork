package Homework1;

import java.util.Scanner;

public class Problem17 {
	
	public static void Run() {
		GetInterest();
	}
	// problem 17
	public static void GetInterest() {
		// setup variables for the scanner to read in
		float interest = 0.0f;
		String input = "";
		float principal = 0.0f;
		float rate = 0.0f;
		float time = 0.0f;
		System.out.println("Enter principal, rate, and time, press enter after each entry");
		// create a scanner
		Scanner scanner = new Scanner(System.in);
		// read in input 3 times and convert to float, each entry should be seperated by enter
		input = scanner.nextLine();
		principal = Float.parseFloat(input);
		input = scanner.nextLine();
		rate = Float.parseFloat(input);
		input = scanner.nextLine();
		time = Float.parseFloat(input);
		scanner.close();
		// simple interest formula
		interest = principal * rate* time;
		// output verification
		System.out.println(interest);
	}
}
