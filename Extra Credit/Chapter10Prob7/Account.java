import java.util.*;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	Account()
	{
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	Account(int id, double balance)
	{
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}
	
	public int getID()
	{
		return this.id;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public double getAnnualInterestRate()
	{
		return this.annualInterestRate;
	}
	
	public double getMonthlyInterestRate()
	{
		return (this.annualInterestRate)/12;
	}
	
	public double getMonthlyInterest()
	{
		return (this.getMonthlyInterestRate())*balance;
	}
	
	public Date getDateCreated()
	{
		return this.dateCreated;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
}
