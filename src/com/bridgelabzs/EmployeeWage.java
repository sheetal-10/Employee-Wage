package com.bridgelabzs;

/**
 * this program computes employee wage
 * @author Sheetal
 * @since 2021-08-05
 */
public class EmployeeWage {
	
	/** 
	 * this is the main method that
	 * checks for employee attendane and
	 * calculate wages for a month
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		//constatnts
		int IS_FULLTIME_PRESENT = 1;
		int IS_PARTTIME_PRESENT = 2;
		int WAGE_PER_HR = 20;
		//variables
		int daily_wage;
		int working_hr = 0;
		int monthly_total_wage = 0;
		int days_in_month=20;
		int daily_wage_array[] = new int[20];
		//computation
		for (int i=0; i<days_in_month; i++) {
		int emp_check = (int)(Math.floor(Math.random() * 10)) % 2;
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
		daily_wage_array[i] = working_hr * WAGE_PER_HR;
	}
		for (int j=0; j<days_in_month; j++) {
			int day = j+1;
			System.out.println("Day " + day + " wage is " + daily_wage_array[j]);
			monthly_total_wage = monthly_total_wage + daily_wage_array[j];
		}
		System.out.println("\nMonthly wage is " + monthly_total_wage);
	}
}
