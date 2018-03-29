package Homework1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Problem07 {
	public static void Run() {
		
		EmployeeAddAndSort();
	}
	
	

	static class Employee {
		
		String name = "";
		String department = "";
		int age = 0;
		
		Employee() {
		}
		
	    public String toString(){
	    	return ("Name: " + this.name + " Department: " + this.department + " Age: " + this.age);
	    }
		
		Employee(String n, String d, int a){
			this.name = n;
			this.department = d;
			this.age = a;
		}
		
	
	}
	// this function inherts from comparator 
	static class SortByName implements Comparator<Employee>{
		// simple compare to see which comes first alphabeticly
	    public int compare(Employee a, Employee b){
	    	return a.name.compareTo(b.name);
	    }
	}
	// this function compares the deparments alphabeticlly and returns the lowest letter value
	static class SortByDepartment implements Comparator<Employee>{
	
	    public int compare(Employee a, Employee b){
	    	return a.department.compareTo(b.department);
	    }
	}
	// another inherted compartor function this one returns the lowest age
	static class SortByAge implements Comparator<Employee>
	{
	    public int compare(Employee a, Employee b){
	    	return a.age - b.age;
		}
	}

	
	// employee class is location in Employee.java
	
	public static void EmployeeAddAndSort() {
		
		// create a list of blank employess and adds the 2 employes as requested in the homework sheet
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("Roger", "Shipping", 45));
		employeeList.add(new Employee("Caleb", "Accounting", 25));
		
		// calls the inherited comparator and sorts by checking the employee list
		System.out.println("\nSorted by Name: ");
		Collections.sort(employeeList, new SortByName());
        for (int i=0; i < employeeList.size(); i++) {
        	System.out.println(employeeList.get(i));
        }
        // cycles the employee list and compares by department
		System.out.println("\nSorted by Department: ");
		Collections.sort(employeeList, new SortByDepartment());
        for (int i=0; i < employeeList.size(); i++) {
        	System.out.println(employeeList.get(i));
        }
        // cycles the employee list and compares by age
		System.out.println("\nSorted by Age: ");
		Collections.sort(employeeList, new SortByAge());
        for (int i=0; i < employeeList.size(); i++) {
        	System.out.println(employeeList.get(i));
        }
	}
	
	
}


