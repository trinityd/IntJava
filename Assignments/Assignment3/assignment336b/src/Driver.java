
public class Driver {

	public static void main(String[] args) {
		FileIO a1 = new FileIO("src/salesdat.txt");
		Franchise f = a1.readData();
		f.print();
	}

}
