package com.dayeight.one;

public class EmployeeWageComp {
	

		static final int part_time =1;
		static final int present = 2;
		
		final String Company_Name;
		final int wage_per_hr;
		final int max_working_hrs;
		final int max_working_days;
		int totalwage;
		
		EmployeeWageComp(String companyName, int wageperhr, int maxworkinghrs, int maxworkingdays)
		{
			Company_Name = companyName;
			wage_per_hr = wageperhr;
			max_working_hrs = maxworkinghrs;
			max_working_days = maxworkingdays;
			totalwage = 0;
		}
		
		int generateempCheck()
		{
			return (int) (Math.random() * 10) % 3;
		}
		int getworking_hr(int empCheck)
		{	
		switch (empCheck)
		{
		case present:
			return 8;
		case part_time:
			return 6;
			
		default:
			return 0;
		}
		}
		
		void calculateTotalWage()
		{
			
		System.out.println("Total Wage Calculation of "+Company_Name+" employee");
		System.out.println();
		System.out.printf("%4s   %4s    %4s   %4s\n", "Day","workinghrs","wage","total working hrs");

		int working_hr;
		for (int day = 1, totalworkinghrs = 0; day <= max_working_days && totalworkinghrs < max_working_hrs; day++, totalworkinghrs += working_hr)
		{
			int empCheck = generateempCheck();
			working_hr = getworking_hr(empCheck);
			
			int wage = working_hr*wage_per_hr;
			totalwage = totalwage +wage;
			System.out.printf("%4s   %4s    %7s   %4s\n", day,working_hr,wage,totalworkinghrs+working_hr);
		}
		}

		public String toString()
		{
		System.out.println("Details of employee working in "+Company_Name);
		System.out.println("Wage per hour :"+wage_per_hr);
		System.out.println("Maximum working days :"+max_working_days);
		System.out.println("Maximum working hour :"+max_working_hrs);
		System.out.printf("%4s   %4s    %4s   %4s\n", "Day","workinghrs","wage","total working hrs");
		return "Total wage for a month of  "+Company_Name + "employee is " +totalwage+ "\n";
		}
	
	public static void main(String[] args) {
		EmployeeWageComp wipro = new EmployeeWageComp("Wipro", 50, 230, 25);
		EmployeeWageComp tcs = new EmployeeWageComp("TCS", 45, 100, 15);
		EmployeeWageComp flipcart = new EmployeeWageComp("Flipcart", 80, 200, 20);
		EmployeeWageComp apple = new EmployeeWageComp("Apple", 100, 250, 28);
	
	wipro.calculateTotalWage();
	System.out.println(wipro);
	
	tcs.calculateTotalWage();
	System.out.println(tcs);
	
	flipcart.calculateTotalWage();
	System.out.println(flipcart);
	
	apple.calculateTotalWage();
	System.out.println(apple);
	
	}
}


