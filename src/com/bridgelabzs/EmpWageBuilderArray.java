package com.bridgelabzs;

/**
 * This contains all the variables declaration and initialization and 
 * computing the employee hours and total employee wage
 * @author Sheetal
 * @since 2021-08-12
 */
public class EmpWageBuilderArray {
	 // Instance variables
	 public static final int IS_FULL_TIME = 1;
	 public static final int IS_PART_TIME = 2;

	 private int numOfCompany=0;
	 private CompanyEmpWage[] companyEmpWageArray;
	 
	 public EmpWageBuilderArray() 
	 {
	  companyEmpWageArray=new CompanyEmpWage[5];
	  
	 }
	 
	 public void addCompanyEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) 
	 {
	  companyEmpWageArray[noOfWorkingDays]=new CompanyEmpWage(company, empRatePerHour, noOfWorkingDays, maxHoursPerMonth);
	  numOfCompany++;
	 }
	 
	 private void computeEmpWage()
	 {
	  for(int i=0;i<numOfCompany;i++)
	  {
	   companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
	  }
	 }
    
    
    /**
     * This method conatains the calculation of
     * employee wage and employee hours 
     */
	 public int computeEmpWage(CompanyEmpWage companyEmpWage) {
		  // Variables
		  int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		  // Computation
		  while (totalEmpHrs <= companyEmpWage.MaxHoursPerMonth && totalWorkingDays< companyEmpWage.NoOfWorkingDays){
		   totalWorkingDays++;
		   int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		   switch (empCheck) {
		   case IS_PART_TIME:
		    empHrs = 4;
		    break;
		   case IS_FULL_TIME:
		    empHrs = 8;
		    break;
		   default:
		    empHrs = 0;
		   }
		   totalEmpHrs += empHrs;
		    System.out.println("Day : " + totalWorkingDays + " Emp Hr : " + empHrs);
		  }
		  totalEmpHrs +=empHrs;
		  System.out.println("Day#:"+totalWorkingDays+"Emp hr:"+empHrs);
		  return totalEmpHrs * companyEmpWage.EmpRatePerHour;
		 
		 }
		 
		 public static void main(String[] args) 
		 {
		  
		  EmpWageBuilderArray empWageBuilder=new EmpWageBuilderArray();
		  empWageBuilder.addCompanyEmpWage("Jio", 20, 2,10);
		  empWageBuilder.addCompanyEmpWage("Airtel", 10, 4,20);
		  empWageBuilder.computeEmpWage();
		 }

	}