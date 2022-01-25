import java.util.Scanner;

public class ExceptionsDemo
{
	
	public static void main(String[] args)
	{
		//A quotient is c in the following a / b = c
		//Tip! Don't call scanner.reset(); instead reinitialize the scanner object
		//Tip! Need: 1 loop and 1 if
		//Tip! Use 2 try/catch blocks (Division by zero and non integer)
		Scanner in = new Scanner(System.in);
		do
		{
			
		
		try
		{
			System.out.println("Give me two ints: ");
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println("a/b=" + (a/b));
//			System.out.println("What do you want to divide 10 by?");
//			in = new Scanner(System.in);
//			String response = in.next();
//			System.out.println("You fed me: " + response);
//			int convertedToInt = Integer.parseInt(response);
//			int result = 10 / convertedToInt;
//			System.out.println("And 10 divided by that is " + result);
			
		}
		catch(Exception exc)
		{
			System.out.println("Whoops!");
			in = new Scanner (System.in);
//			exc.printStackTrace();
////			String msg = exc.getMessage();
////			System.out.println(msg);
//			System.out.println("Unable to continue!");
//			in = new Scanner (System.in);

		}
		}while(true);
	}
}
