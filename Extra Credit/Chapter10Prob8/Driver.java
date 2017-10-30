
public class Driver {

	public static void main(String[] args) {
		int[][] brackets2001 = {{27050, 65550, 136750, 297350}, {45000, 109250, 166500, 297350}, {22600, 54625, 83250, 148675}, {36250, 93650, 151650, 297350}};
		double[] rates2001 = {.15, .275, .305, .355, .391};
		System.out.println("Single Filers 2001: ");
		Tax single2001;
		double tax;
		for (int i = 50000; i <= 60000; i+=1000) {
			single2001 = new Tax(0, brackets2001, rates2001, i);
			tax = single2001.getTax();
			System.out.printf("\tTaxable Income of $%d: $%f\n", i, tax);
		}
		
		int[][] brackets2009 = {{8350,33950,82250,171550,372950}, {16700,67900,137050,20885,372950}, {8350,33950,68525,104425,186475}, {11950,45500,117450,190200,372950}};
		double[] rates2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
		System.out.printf("\nSingle Filers 2009: \n");
		Tax single2009;
		for (int i = 50000; i <= 60000; i+=1000) {
			single2009 = new Tax(0, brackets2009, rates2009, i);
			tax = single2009.getTax();
			System.out.printf("\tTaxable Income of $%d: $%f\n", i, tax);
		}
	}
}
