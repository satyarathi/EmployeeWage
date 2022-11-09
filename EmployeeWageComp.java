package com.dayeight.one;

public class EmployeeWageComp {
	public static void main(String[] args) {


		int present = 1;
		int wage_per_hr = 20;
		int working_hr = 0;

		int empCheck = (int)(Math.random() * 10) % 2;
		if(empCheck == present) {
			System.out.println("Employee is present");
			working_hr = 8;
		}
		else {
			System.out.println("Employee is Absent" );

		}
		int wage = working_hr*wage_per_hr;
		System.out.println("Daily wage of Employee is " +wage);
	}
}


