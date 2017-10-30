
public class Student extends Person {
	protected final String status;
	
	Student()
	{
		super();
		this.status = "Class status not found.";
	}
	
	Student(String name, String address, String phoneNumber, String email, String status) 
	{
		super(name, address, phoneNumber, email);
		this.status = status;
	}
	
	public String toString()
	{
		return ("Student " + this.name);
	}
}
