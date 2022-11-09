package com.dayeight.one;

public class EmployeeWageComp {
	public static void main(String[] args) {

		final int part_time =1;
		final int present = 2;
		int wage_per_hr = 20;
		int working_hr = 0;
		int total_wage = 0;
		int max_working_days = 20;
		int max_working_hrs = 100;


		System.out.printf("%4s   %4s    %4s   %4s\n", "Day","workinghrs","wage","total working hrs");

		for (int day = 1, totalworkinghrs = 0; day <= max_working_days && totalworkinghrs < max_working_hrs; day++, totalworkinghrs += working_hr)
		{
			int empCheck = (int)(Math.random() * 10) % 3;
			switch (empCheck)
			{
			case present:
				working_hr = 8;
				break;
			case part_time:
				working_hr = 6;
				break;

			default:
				working_hr = 0;
				break;
			}
			int wage = working_hr*wage_per_hr;

			total_wage = total_wage +wage;
			System.out.printf("%4s   %4s    %7s   %4s\n", day,working_hr,wage,totalworkinghrs+working_hr);
		}
		System.out.println("Total wage for a month :" +total_wage);
	}
}


