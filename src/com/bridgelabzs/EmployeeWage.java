package com.bridgelabzs;

/**
 * This program computes employee wage.
 * @author Sheetal
 * @since 2021-08-09
 */
public class EmployeeWage {
	/**
	 * This is the main method that
	 * creates object of two companies and 
	 * calls the method from Main class
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation");
		
		//creating object and calling method from Main class
		Main jioCompany = new Main(10, 20, 30, "Jio");
		jioCompany.calcEmpWageFor();
		
		//creating object and calling method from Main class
		Main airtelCompany = new Main(20, 40, 50, "Airtel");
		airtelCompany.calcEmpWageFor();

	}
}