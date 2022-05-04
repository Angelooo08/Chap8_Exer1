
public class PiggyBank {
	private double total;
	
	public PiggyBank() {
		
		
	}
	
	public void addPenny() {
	
		total += 1;
	}
	
	public void addNickel() {
		
		total += 10;
	
	}
	public void addDime() {
		
		total += 15;
		
	}
	
	public void addQuarter() {
	
		total += 25;
	}

	
	
	public double totalInBank() {
		return total / 100;
		
	}
	
	public void emptyBank() {
		total = 0;
	
	}
	
		
	
}
