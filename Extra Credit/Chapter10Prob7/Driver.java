import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ATM atm = new ATM(10, 100);
		System.out.printf("Enter an id: ");
		int id = scan.nextInt();
		while(true) {
			id = atm.display(id);
		}
	}

}
