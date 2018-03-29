package Homework1;



// uses ChildExample.java and SuperClassExample

public class Problem18 {
	
	// interface with the 3 unimplimented functions as request 
	abstract interface SuperClassExample {
		
		public abstract boolean CheckForUpper(String s);
		public abstract String ConvertToUpper(String s);
		public abstract int ConvertStrToInt(String s);

	}
	// class inheriting from the interface and implementing the functions
	static class ChildExample implements SuperClassExample{

		@Override
		public boolean CheckForUpper(String s) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')return true;
			}
			return false;
		}
		// implimentations of the super class
		@Override
		public String ConvertToUpper(String s) {
			return s.toUpperCase();
		}

		@Override
		public int ConvertStrToInt(String s) {
			int num = Integer.parseInt(s);
			return (num += 10);
		}
		
	}
	
	public static void Run() {
		InhertClassExmaple();
	}
	
	public static void InhertClassExmaple() {
		
		ChildExample childExample = new ChildExample();
		// checks to see if uppercase and prints if true
		if (childExample.CheckForUpper("myString"))System.out.println("Uppercase exists");
		else System.out.println("No uppercase exists");
		// converts the string to upp
		System.out.println("convert to upper: " + childExample.ConvertToUpper("myString"));
		// casts to int and adds 10
		System.out.println("convert to int and add 10: " + childExample.ConvertStrToInt("44"));
		
		
	}
}
