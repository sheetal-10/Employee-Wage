package com.bridgelabzs;

/**
 * This program computes employee wage.
 * @author Sheetal
 * @since 2021-08-13
 */
public class CompanyEmpWage {
	
	public final String Company;
	 public final int EmpRatePerHour;
	 public final int NoOfWorkingDays;
	 public int MaxHoursPerMonth;
	 public int TotalEmpWage;
	 
	 public CompanyEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) 
	 {
	  this.Company = company;
	  this.EmpRatePerHour = empRatePerHour;
	  this.NoOfWorkingDays = noOfWorkingDays;
	  this.MaxHoursPerMonth = maxHoursPerMonth;
	 }
	 
	 public void setTotalEmpWage(int totalEmpWage) {
	  this.TotalEmpWage = totalEmpWage;
	 }

	 @Override
	 public String toString() {
	  return "Total Emp Wage for the compan " +Company+"is:"+TotalEmpWage;
	 }
}