//Friend Trinity Dickinson
//CIS 36B-61Y
//Professor Singh
//Assignment 2, Part 1
//Due: 10/20/2017

public class PersonalInfo {
	private String name;
	private String address;
	private int age;
	private String num;

	public PersonalInfo()
	{
		this.name = "Name not found";
		this.address = "Address not found";
		this.age = 0;
		this.num = "Phone number not found";
	}
	
	public PersonalInfo(String name, String address, int age, String num)
	{
		this.name = name;
		this.address = address;
		this.age = age;
		this.num = num;
	}
	
	public void printInfo()
	{
		System.out.printf("%nName: %s%n", this.name);
		System.out.printf("Address: %s%n", this.address);
		System.out.printf("Age: %d%n", this.age);
		System.out.printf("Phone Number: %s%n%n", this.num);
	}
	
	public String getName()
	{
		return this.name;
	}

	public String getAddress()
	{
		return this.address;
	}

	public int getAge()
	{
		return this.age;
	}

	public String getNum()
	{
		return this.num;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public void setNum(String num)
	{
		this.num = num;
	}
}