import java.util.Date;

public class Staff extends Employee {
	protected String title;
	
	Staff()
	{
		super();
		this.title = "Title not found.";
	}
	
	Staff(String name, String address, String phoneNumber, String email, String office, double salary, String title) 
	{
		super(name, address, phoneNumber, email, office, salary);
		this.title = title;
	}
	
	public String toString()
	{
		return ("Staff " + this.name);
	}
}
