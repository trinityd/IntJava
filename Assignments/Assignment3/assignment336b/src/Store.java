
public class Store {
	private float salesbyweek[][];
	private float totalsalesforweek[];
	private float avgsalesforweek[];
	private float totalsalesforallweeks;
	private float averageweeklysales;
	private int weekwithhighestsaleamt;
	private int weekwithlowestsaleamt;
	
	
	Store() {
		salesbyweek = new float[5][7];
	}

	// getter and setters
	// setsaleforweekdayintersection(int week, int day, float sale)
	public void setsaleforweekdayintersection(int week, int day, float sale) {
		salesbyweek[week][day] = sale;
	}
	
	public float [] getsalesforentireweek(int week)
	{
		return salesbyweek[week];
	}
	
	public float getsaleforweekdayintersection(int week, int day)
	{
		return salesbyweek[week][day];
	}
	
	public void printdata() 
	{
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				System.out.print(salesbyweek[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	// businessmethod
	// a. totalsalesforweek
	public float totalsalesforweek(int week)
	{
		float total = 0.0f;
		for (int i = 0; i < 7; i++)
		{
			total += getsaleforweekdayintersection(week, i);
		}
		return total;
	}
	
	// b. avgsalesforweek
	public float avgsalesforweek(int week)
	{
		return totalsalesforweek(week)/7.0f;
	}
	
	// c. totalsalesforallweeks
	public float totalsalesforallweeks()
	{
		float total = 0.0f;
		for (int i = 0; i < 5; i++)
		{
			total += totalsalesforweek(i);
		}
		return total;
	}
	
	// d. averageweeklysales
	public float averageweeklysales()
	{
		return totalsalesforallweeks()/5.0f;
	}
	
	// e. weekwithhighestsaleamt
	public int weekwithhighestsaleamt()
	{
		float highestSale = totalsalesforweek(0);
		int week = 0;
		for (int i = 1; i < 5; i++)
		{
			if (totalsalesforweek(i) > highestSale) week = i;
		}
		return week;
	}
	
	// f. weekwithlowestsaleamt
	public int weekwithlowestsaleamt()
	{
		float lowestSale = totalsalesforweek(0);
		int week = 0;
		for (int i = 1; i < 5; i++)
		{
			if (totalsalesforweek(i) < lowestSale) week = i;
		}
		return week;
	}
	
	// analyzeresults //call a through f
	public void analyzeresults()
	{
		float[] tsfw = new float[5];
		float[] asfw = new float[5];
		for (int i = 0; i < 5; i++)
		{
			tsfw[i] = totalsalesforweek(i);
		}
		for (int i = 0; i < 5; i++)
		{
			asfw[i] = avgsalesforweek(i);
		}
		this.totalsalesforweek = tsfw;
		this.avgsalesforweek = asfw;
		this.totalsalesforallweeks = totalsalesforallweeks();
		this.averageweeklysales = averageweeklysales();
		this.weekwithhighestsaleamt = weekwithhighestsaleamt();
		this.weekwithlowestsaleamt = weekwithlowestsaleamt();
	}
	
	// print()
	public void print()
	{
		System.out.printf("Total Sales for Each Week:\n");
		for (int i = 0; i < 5; i++)
		{
			System.out.printf("\tWeek %d: %.2f\n", i+1, this.totalsalesforweek[i]);
		}
		
		System.out.printf("Average Daily Sales for Each Week:\n");
		for (int i = 0; i < 5; i++)
		{
			System.out.printf("\tWeek %d: %.2f\n", i+1, this.avgsalesforweek[i]);
		}
		
		System.out.printf("Total Sales for All Weeks:\n\t%.2f\n", this.totalsalesforallweeks);
		
		System.out.printf("Average Weekly Sales:\n\t%.2f\n", this.averageweeklysales);

		System.out.printf("Week w/ Highest Amount in Sales:\n\t%d\n", this.weekwithhighestsaleamt+1);
		System.out.printf("Week w/ Lowest Amount in Sales:\n\t%d\n", this.weekwithlowestsaleamt+1);

	}
}