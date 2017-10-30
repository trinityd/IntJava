import java.io.*;
import java.util.*;

public class ATM {
	ArrayList<Account> accounts;
	
	ATM() {
		accounts = new ArrayList<Account>(1);
		Account a = new Account();
		accounts.add(a);
	}
	
	ATM(int numberOfAccounts, int startingBal) {
		accounts = new ArrayList<Account>(10);
		for (int i = 0; i < numberOfAccounts; i++) {
			Account a = new Account(i, startingBal);
			accounts.add(a);
		}
	}
	
	public void addAccount(Account a) {
		accounts.add(a);
	}
	
	public void clearAccounts() {
		accounts.clear();
	}
	
	public int display(int accountID) {
		Scanner scan = new Scanner(System.in);
		double amt;
		while(true) {
			System.out.printf("\nMain Menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\nEnter a choice: ");
			int choice = scan.nextInt();
			switch(choice) {
				case 1 :
					System.out.printf("The balance is %.2f\n", (accounts.get(accountID)).getBalance());
					break;
					
				case 2 :
					System.out.printf("Enter an amount to withdraw: ");
					amt = scan.nextDouble();
					accounts.get(accountID).withdraw(amt);
					break;
				
				case 3 :
					System.out.printf("Enter an amount to deposit: ");
					amt = scan.nextDouble();
					accounts.get(accountID).deposit(amt);
					break;
				
				case 4 :
					System.out.printf("\nEnter an id: ");
					int id = scan.nextInt();
					return id;
			}
		}
	}
}
