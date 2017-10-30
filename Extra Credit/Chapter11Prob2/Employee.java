import java.util.Date;

public class Employee extends Person {
	protected String office;
	protected double salary;
	protected Date dateHired;

	Employee()
	{
		super();
		this.office = "Office not found.";
		this.salary = 0;
		this.dateHired = new Date();
	}

	Employee(String name, String address, String phoneNumber, String email, String office, double salary) 
	{
		super(name, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = new Date();
	}

	public String toString()
	{
		return ("Employee " + this.name);
	}
}
