//Friend Trinity Dickinson
//CIS 36B-61Y
//Professor Singh
//Assignment 2, Part 1
//Due: 10/20/2017

import java.util.Scanner;

public class Assignment2Part1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PersonalInfo info1 = new PersonalInfo();
		PersonalInfo info2 = new PersonalInfo();
		PersonalInfo info3 = new PersonalInfo();
		
		System.out.println("Please enter a name: ");
		String name = scan.nextLine();
		info1.setName(name);
		System.out.println("Please enter an address: ");
		String address = scan.nextLine();
		info1.setAddress(address);
		System.out.println("Please enter an age: ");
		int age = scan.nextInt();
		scan.nextLine();
		info1.setAge(age);
		System.out.println("Please enter a phone number: ");
		String num = scan.nextLine();
		info1.setNum(num);
		info1.printInfo();
		
		System.out.println("Please enter a name: ");
		name = scan.nextLine();
		info2.setName(name);
		System.out.println("Please enter an address: ");
		address = scan.nextLine();
		info2.setAddress(address);
		System.out.println("Please enter an age: ");
		age = scan.nextInt();
		scan.nextLine();
		info2.setAge(age);
		System.out.println("Please enter a phone number: ");
		num = scan.nextLine();
		info2.setNum(num);
		info2.printInfo();
		
		System.out.println("Please enter a name: ");
		name = scan.nextLine();
		info3.setName(name);
		System.out.println("Please enter an address: ");
		address = scan.nextLine();
		info3.setAddress(address);
		System.out.println("Please enter an age: ");
		age = scan.nextInt();
		scan.nextLine();
		info3.setAge(age);
		System.out.println("Please enter a phone number: ");
		num = scan.nextLine();
		info3.setNum(num);
		info3.printInfo();
		scan.close();
	}
}