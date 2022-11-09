package com.dayeight.one;

public class EmployeeWageComp {
	public static void TotalWage(String companyName, int wage_per_hr, int max_working_hrs, int max_working_days) {

		final int part_time =1;
		final int present = 2;
		int working_hr = 0;
		int total_wage = 0;
		
		System.out.println("Details of employee working in "+companyName);
		System.out.println("Wage per hour :"+wage_per_hr);
		System.out.println("Maximum working days :"+max_working_days);
		System.out.println("Maximum working hour :"+max_working_hrs);
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
	
	public static void main(String[] args) {
		TotalWage("Wipro", 50, 230, 25);
		TotalWage("TCS", 45, 100, 15);
		TotalWage("Flipcart", 80, 200, 20);
		TotalWage("Apple", 100, 250, 28);
	}
}


