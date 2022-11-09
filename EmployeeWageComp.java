package com.dayeight.one;

public class EmployeeWageComp {
	public static void main(String[] args) {

		final int part_time =1;
		final int present = 2;
		int wage_per_hr = 20;
		int working_hr = 0;
		int working_days = 20;
		int total_wage = 0;

		for (int day = 1; day <= working_days;day++)
		{
			int empCheck = (int)(Math.random() * 10) % 3;
			switch (empCheck)
			{
			case present:
				System.out.println("Employee is present full time");
				working_hr = 8;
				break;
			case part_time:
				System.out.println("Employee is working Part time");
				working_hr = 6;
				break;

			default:
				System.out.println("Employee is Absent" );
			}
			int wage = working_hr*wage_per_hr;
			System.out.println("days :" +day+ ", wage : " +wage);
			total_wage = total_wage +wage;
		}
		System.out.println("Total wage for a month :" +total_wage);
	}
}


