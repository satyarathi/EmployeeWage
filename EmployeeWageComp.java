package com.dayeight.one;

public class EmployeeWageComp {
	public static void main(String[] args) {

		int part_time =1;
		int present = 2;
		int wage_per_hr = 20;
		int working_hr = 0;

		int empCheck = (int)(Math.random() * 10) % 3;
		if(empCheck == present) {
			System.out.println("Employee is present");
			working_hr = 8;
		}
		else if (empCheck == part_time) {
			System.out.println("Employee is working Parttime");
			working_hr = 6;
		}
		else {
			System.out.println("Employee is Absent" );

		}
		int wage = working_hr*wage_per_hr;
		System.out.println("Daily wage of Employee is " +wage);
	}
}


