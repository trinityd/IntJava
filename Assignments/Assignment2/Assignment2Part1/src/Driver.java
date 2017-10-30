//Friend Trinity Dickinson
//CIS 36B-61Y
//Professor Singh
//Assignment 2, Part 1
//Due: 10/20/2017

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PersonalInfo info1 = new PersonalInfo();
		PersonalInfo info2 = new PersonalInfo();
		PersonalInfo info3 = new PersonalInfo();
		
		readData(info1, scan);
		readData(info2, scan);
		readData(info3, scan);
		
		scan.close();
	}
	
	public static void readData(PersonalInfo p, Scanner scan) {
		System.out.println("Please enter a name: ");
		String name = scan.nextLine();
		p.setName(name);
		System.out.println("Please enter an address: ");
		String address = scan.nextLine();
		p.setAddress(address);
		System.out.println("Please enter an age: ");
		int age = scan.nextInt();
		scan.nextLine();
		p.setAge(age);
		System.out.println("Please enter a phone number: ");
		String num = scan.nextLine();
		p.setNum(num);
		p.printInfo();
	}
}