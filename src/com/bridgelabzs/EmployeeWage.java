package com.bridgelabzs;

/**
 * this program computes employee wage
 * @author Sheetal
 * @since 2021-08-05
 */
public class EmployeeWage {
	
	/** 
	 * this is the main method that
	 * checks for employee attendane
	 * @param args unused
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		//constatnt
		int IS_PRESENT = 1;
		//computation
		int emp_check = (int)(Math.floor(Math.random() * 10)) % 2;
		if( emp_check == IS_PRESENT)
		{
			System.out.println("Employee is present");
		}
		else
			System.out.println("Employee is absent");
	}
}
