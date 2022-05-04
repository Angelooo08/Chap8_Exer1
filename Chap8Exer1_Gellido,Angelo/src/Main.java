

import java.util.*;



public class Main {
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PiggyBank myPiggyBank = new PiggyBank();

		
		int menuChoice = 0;
		

		do {
			System.out.println("[1] Show total in bank.");
			System.out.println("[2] Add a penny.");
			System.out.println("[3] Add a nickel.");
			System.out.println("[4] Add a dime.");
			System.out.println("[5] Add a quarter.");
			System.out.println("[6] Take money out of bank.");
			System.out.println("Enter 0 to quit");
			System.out.println("Enter your Choice: ");
			menuChoice = sc.nextInt();
			
			switch(menuChoice) {
				case 0 ->{
					
					
				
				}
			
				case 1 ->{
					System.out.println("Total amount is: " + myPiggyBank.totalInBank());
					
				
				}
				case 2 ->{
					
				
					 myPiggyBank.addPenny();
					
				
				}
				case 3 ->{
					
					myPiggyBank.addNickel();
				
				}
				case 4 ->{
				myPiggyBank.addDime();
				}
				case 5 ->{
					myPiggyBank.addQuarter();
					
				}
				case 6 ->{
					myPiggyBank.emptyBank();		
				}
				default ->{
					System.out.println("Invalid input!");
				}
			}
				
			
		}while(menuChoice != 0);
		

	}

	
		
			
			
			
			
			
			
			
		
}
