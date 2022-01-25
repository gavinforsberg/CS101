import java.text.DecimalFormat;
import java.util.Scanner;

/*  Gavin Forsberg
* Proj.2
* Change Machine
* Accepts the price for an item and adds 5% tax, accepts amount of payment, and outputs the change 
* due to the customer;		or program will end after input of a negative number, will loop if 
* payment input is not in between guidelines (0<price<500), will loop if payment is not sufficient 
* in paying total. 
*/

public class ChangeMachine
{

	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		
		//Sets decimal formatter to always use "0.00" format
		DecimalFormat monetary = new DecimalFormat ("$##.00");
		double transactionCost;
		double amountDue; 
		double payment;
		double changeRemainder;
		
		//Sets the tax and maximum transaction values to their constants (5% and $500)
		final double TAX = 0.05;
		final double MAX_TRANSACTION = 500;
		
		//Sets the initial value of change back to 0
		int hundred = 0, fifty = 0, twenty = 0, ten = 0, five = 0, dollar = 0, 
				    quarter = 0, dime = 0, nickel = 0, penny = 0;
		
	//Allows for breaks in below code, which allows for program to terminate or for a user to quit
	while(true)
	{
		System.out.println("Cost of transaction (enter 0 or negative to exit; max is $500.00): ");
		transactionCost = in.nextDouble();
		
		//Checks that the transaction amount falls within 0<price<500 regulation
		while(transactionCost > MAX_TRANSACTION)
		{
			System.out.println("Cost of transaction (enter 0 or negative to exit; max is $500.00): ");
			transactionCost = in.nextDouble();
		}
		
		//Adds tax to the initial transactionCost
		amountDue = (transactionCost * TAX) + transactionCost;
		
		if(transactionCost <= 0)
		{
			System.out.println("Done.");
			break;
		}
		
		//Uses decimal format to only output two decimal places
		System.out.println("Amount due (with 5.00% tax): " + monetary.format(amountDue));
		System.out.println("Please enter payment amount: ");
		payment = in.nextDouble();
		
		//Checks if payment is enough to pay amountDue, and requests more money if not
		while(payment < amountDue)
		{
			System.out.println(monetary.format(payment) + " is not sufficient. Input a higher amount: ");
			payment = in.nextDouble();
			break;
		}	
		
		//Checks if the payment amount is the same as amountDue. If so, no change
		if(payment == amountDue)
		{
			System.out.println("Exact change! Amazing!");
			break;
		}
		
		//Checks if change should be returned
		if(payment > amountDue)
		{
			//Finds how much change is due
			changeRemainder = payment - amountDue;
			//Outputs the amount (to two decimal places) of change due
			System.out.println("Change back " + monetary.format(changeRemainder));
			
			//Checks if/how many hundred dollar bills are due
			hundred = (int) changeRemainder / 100;
			//Subtracts the amount of hundreds from the change for remaining change
			changeRemainder = changeRemainder - (hundred * 100);
			
			//Checks if/how many fifty dollar bills are due
			fifty = (int) changeRemainder / 50;
			//Subtracts the amount of fifties from the change for remaining change
			changeRemainder = changeRemainder - (fifty * 50);
			
			//Checks if/how many twenty dollar bills are due
			twenty = (int) changeRemainder / 20;
			//Subtracts the amount of twenties from the change for remaining change
			changeRemainder = changeRemainder - (twenty * 20);
			
			//Checks if/how many ten dollar bills are due
			ten = (int) changeRemainder / 10;
			//Subtracts the amount of tens from the change for remaining change
			changeRemainder = changeRemainder - (ten * 10);
			
			//Checks if/how many five dollar bills are due
			five = (int) changeRemainder / 5;
			//Subtracts the amount of fives from the change for remaining change
			changeRemainder = changeRemainder - (five * 5);
			
			//Checks if/how many dollar bills are due
			dollar = (int) changeRemainder;
			//Subtracts the amount of dollars from the change for remaining change
			changeRemainder = changeRemainder - (dollar);
			
			//Checks if/how many quarters are due
			quarter = (int) (changeRemainder / 0.25);
			//Subtracts the amount of quarters from the change for remaining change
			changeRemainder = changeRemainder - (quarter * 0.25);
			
			//Checks if/how many dimes are due
			dime = (int) (changeRemainder / 0.10);
			//Subtracts the amount of dimes from the change for remaining change
			changeRemainder = changeRemainder - (dime * 0.10);
			
			//Checks if/how many nickels are due
			nickel = (int) (changeRemainder / 0.05);
			//Subtracts the amount of nickels from the change for remaining change
			changeRemainder = changeRemainder - (nickel * 0.05);
			
			//Takes the change remaining and multiplies it by 100 for the amount of pennies due
			penny = (int) Math.round(changeRemainder * 100);
		
		
			String change = "$100: " + hundred + " $50: " + fifty + " $20: " + twenty + " $10: " + ten +
				" $5: " + five + " $1: " + dollar + " $0.25: " + quarter + " $0.10: " + dime + " $0.05: " 
				+ nickel + " $0.01: " + penny;
			
			System.out.println(change);
			System.out.println();
			System.out.println("Done.");
			System.out.println();
			
			
		}
	
	}
	
	}

}