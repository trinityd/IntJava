
public class Tax {
	private int filingStatus;
	private int[][] brackets;
	private double[] rates;
	private double taxableIncome;
	
	Tax() {
		filingStatus = 0;
		brackets = new int[4][5];
		rates = new double[6];
		taxableIncome = 50000;
	}
	Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
		this.filingStatus = filingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;
	}
	public int getFilingStatus() {
		return filingStatus;
	}
	public void setFilingStatus(int filingStatus) {
		this.filingStatus = filingStatus;
	}
	public int[][] getBrackets() {
		return brackets;
	}
	public void setBrackets(int[][] brackets) {
		this.brackets = brackets;
	}
	public double[] getRates() {
		return rates;
	}
	public void setRates(double[] rates) {
		this.rates = rates;
	}
	public double getTaxableIncome() {
		return taxableIncome;
	}
	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}
	
	public double getTax() {
		int tax = 0;
		int status = this.filingStatus;
		tax += (brackets[0][0] * rates[0]);
		for(int i = 1; i < brackets[status].length; i++) {
			tax += ((brackets[status][i] - brackets[status][i-1]) * rates[i]);
		}
		tax += ((this.taxableIncome - brackets[status][brackets[status].length-1]) * rates[brackets[status].length]);
		return tax;
	}
}
