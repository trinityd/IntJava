
public class Person {
	protected String name;
	protected String address;
	protected String phoneNumber;
	protected String email;
	
	Person()
	{
		this.name = "Name not found";
		this.address = "Address not found";
		this.phoneNumber = "Phone number not found";
		this.email = "Email not found";
	}
	
	Person(String name, String address, String phoneNumber, String email)
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public String toString() {
		return ("Person " + this.name);
	}
}
