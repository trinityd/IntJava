import java.util.Date;

public class Faculty extends Employee {
	protected String officeHours;
	protected int rank;

	Faculty()
	{
		super();
		this.officeHours = "Office hours not found.";
		this.rank = 0;
	}

	Faculty(String name, String address, String phoneNumber, String email, String office, double salary, String officeHours, int rank) 
	{
		super(name, address, phoneNumber, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public String toString()
	{
		return ("Faculty " + this.name);
	}
}
