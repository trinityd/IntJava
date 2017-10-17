
public class Franchise {
	private Store stores[];
	
	public Franchise(int num) {
			stores = new Store[num];
	}

	public Store getStores(int i) {
		return stores[i];
	}

	public void setStores(Store stores, int i) {
		this.stores[i] = stores;
	}
	public int numberofstores()
	{
		return stores.length;
	}
	
	// Print every store using Store's print() method
	public void print() 
	{
		for (int i = 0; i < this.numberofstores(); i++)
		{
			System.out.printf("Store #%d:\n", i+1);
			Store s = this.getStores(i);
			s.analyzeresults();
			s.print();
			System.out.println();
		}
	}
}
