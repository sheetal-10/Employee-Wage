package com.bridgelabzs;

/**
 * This program computes employee wage.
 * @author Sheetal
 * @since 2021-08-09
 */
public class EmployeeWage {
			//constatnts
			int IS_FULLTIME_PRESENT = 1;
			int IS_PARTTIME_PRESENT = 2;
			int WAGE_PER_HR = 20;
			int MAX_WORKING_HRS = 100;
			int DAYS_IN_MONTH = 20;
			//variables
			int daily_wage;
			int working_hr = 0;
			int monthly_total_wage = 0;
			int total_working_hr = 0;
			int daily_wage_array[] = new int[20];
	
	
	/** 
	 * This is the main method that
	 * creates object salary and 
	 * call other methods to object.
	 */
	public static void main(String[] args) {
		//creating object
		EmployeeWage salary = new EmployeeWage();
		//calling method to the object
		salary.welcome();
		salary.employeeWage();	
	}
	
	// method for welcome message
	void welcome()
		 {
			 System.out.println("Welcome to empwage computation");

		}
	// method to calculate wages
	void employeeWage() {
		int daily_wage_array[] = new int[20];
		for (int i=0; i<DAYS_IN_MONTH && total_working_hr<MAX_WORKING_HRS; i++) {
			int emp_check = (int)(Math.floor(Math.random() * 10)) % 3;
			switch (emp_check) {
					case 1:
						working_hr = 8;
						break;
					case 2:
						working_hr = 4;
						break;
					default:
						working_hr = 0;
				}
				total_working_hr += working_hr;
				daily_wage_array[i] = working_hr * WAGE_PER_HR;
			}
		for (int j=0; j<DAYS_IN_MONTH; j++) {
				int day = j+1;
				System.out.println("Day " + day + " wage is " + daily_wage_array[j]);
				monthly_total_wage = monthly_total_wage + daily_wage_array[j];
			}
			System.out.println("\nMonthly wage is " + monthly_total_wage);
		}
}