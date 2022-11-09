package com.dayeight.one;

public class EmployeeWageComp {
	public static void main(String[] args) {
		
	System.out.println("Welcome to the Employee Wage Computation Programm");
//attandance
		int present = 1;
				
		int empCheck = (int)(Math.random() * 10) % 2;
		if(empCheck == present)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is Absent" );

	}
}


