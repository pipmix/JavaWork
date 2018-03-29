package Homework1;

public class Problem16 {
	
	public static void Run(String[] args) {
		CountArgsLength(args);
	}
	
	// this function requires the programs args be passed from main
	private static void CountArgsLength(String[] args) {
		int count = 1;
		// simply display the length of each string passed from the command line
		for (String s : args) {
			System.out.println("Arg " + count++ + " length is " + s.length());
		}
		
	}
}
