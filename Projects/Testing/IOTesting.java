import java.io.*;
import java.util.*;

public class IOTesting {
	public static void main (String[] args) {

		Scanner scan = new Scanner (System.in);
		ArrayList<String> nameList = new ArrayList <String>();
		System.out.println("Please enter the amount of names.");
		int amt = Integer.valueOf(scan.nextLine());
		
		for (int i = 0; i < amt; i++) {
			System.out.println("Please enter a name.");
			String name = scan.nextLine();
			nameList.add(name);
		}
		scan.close();
		for (int i = 0; i < nameList.size(); i++)
		{
			System.out.printf("Hello, %s!%n", nameList.get(i));
		}
	}
}