package Homework1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Problem20 {
	public static void Run() {
		ReadFileExample();
	}
	
	public static void ReadFileExample() {
		
		System.out.println("Problem 20:");
		
		// Variables setup
		String fileName = "Data.txt";
		ArrayList<String> lines = new ArrayList<String>();
		
		// This reads the file and saves each line into an array list
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
            	lines.add(line);
            }
        } catch (IOException e) {
        	e.printStackTrace();
		}
        // Process each line that was read in and format appropriately 
        for(String i : lines) {
        	String cutString [] = i.split(":");
        	System.out.println("Name: " + cutString[0] + " " + cutString[1]);
        	System.out.println("Age: " + cutString[2] + " years");
        	System.out.println("State: " + cutString[3] + " State");
        }   
	}
}
