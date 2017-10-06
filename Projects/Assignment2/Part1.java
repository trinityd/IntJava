//Friend Trinity Dickinson
//CIS 36B-61Y
//Professor Singh
//Assignment 1, Part 1
//Due: 10/8/2017

import java.util.Scanner;

public class Part1 {
	public static void main(String[] args) {
		double[] loanInfo = inputInfo();
		processInfo(loanInfo);
		printInfo(loanInfo);
	}

	public static double[] inputInfo() {
		Scanner scan = new Scanner (System.in);
		double[] loanInfo = new double[5];
		System.out.printf("Loan Amount: ");
		loanInfo[0] = scan.nextDouble();
		System.out.printf("Number of Years: ");
		loanInfo[1] = scan.nextDouble();
		System.out.printf("Annual Interest Rate: ");
		loanInfo[2] = scan.nextDouble();
		
		scan.close();
		return loanInfo;
	}
	
	public static void processInfo(double[] loanInfo) {
		double loanAmount = loanInfo[0];
		double numberOfYears = loanInfo[1];
		double monthlyInterestRate = ((loanInfo[2])/1200);
		
		double monthlyPayment = (loanAmount * (monthlyInterestRate/(1-(1/Math.pow(1+monthlyInterestRate, numberOfYears*12)))));
		loanInfo[3] = monthlyPayment;
		double totalPayment = (monthlyPayment * numberOfYears * 12);
		loanInfo[4] = totalPayment;		
	}
	
	public static void printInfo(double[] loanInfo) {
		System.out.printf("%nMonthly Payment: %.2f%n", loanInfo[3]);
		System.out.printf("Total Payment: %.2f%n", loanInfo[4]);
		
		int totalMonths = ((int)(loanInfo[1]))*12;
		double bal = loanInfo[0];
		double interest;
		double principal;
		
		System.out.printf("%n%-12s%-12s%-12s%-12s", "Payment#", "Interest", "Principal", "Balance");
		for(int paymentNum = 1; paymentNum <= totalMonths; paymentNum++) {
			interest = (loanInfo[2]/1200)*bal;
			principal = (loanInfo[3])-interest;
			bal-=principal;
			System.out.printf("%n%-12d%-12.2f%-12.2f%-12.2f", paymentNum, interest, principal, bal);
		}
	}
}