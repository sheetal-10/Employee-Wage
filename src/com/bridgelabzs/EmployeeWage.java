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
	 * calculate wage
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		//constatnts
		int IS_FULLTIME_PRESENT = 1;
		int WAGE_PER_HR = 20;
		//variables
		int daily_wage;
		int working_hr;
		//computation
		int emp_check = (int)(Math.floor(Math.random() * 10)) % 2;
		if( emp_check == IS_FULLTIME_PRESENT)
		{
			System.out.println("Employee is present");
			working_hr = 8;
		}
		else
		{
			System.out.println("Employee is absent");
			working_hr = 0;
	        }  
		daily_wage = working_hr * WAGE_PER_HR;
		System.out.println("Employee daily wage is " + daily_wage);
	}
}
