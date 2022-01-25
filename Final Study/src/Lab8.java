import java.util.Scanner;

public class Lab8
{

	public static void main(String[] args)
	{
		//Part 1
		Scanner in = new Scanner(System.in);
		int n = 0;
		System.out.println("Input an integer between -13 and 13.");
		
		do
		{
			n = in.nextInt();
			
			
		}while(!(n <= 13 || n >= -13));
		
		
		//Part 2
		System.out.println();
		System.out.println("Enter an integer: ");
		in = new Scanner(System.in);
		int input = in.nextInt();
		int factorial = 1;
		
		if(input == 0)
			System.out.println("0");
		
		if(input <= 13 || input >= 0)
		{
			for(int i = input; i > 0; i--)
			{
				factorial *= i;
			}
			System.out.println("Factorial: " + factorial);
		}
		
		if(n > 13)
			System.out.println("System input too high.");
		
		//Part 3
		System.out.println();
		System.out.println("How long is the desired pattern?");
		
		int length = Math.abs(in.nextInt());
		int counter = 0;
		int shapeIndex = 0;
		
		while(counter<=length)
		{
			shapeIndex=0;
			
			while(shapeIndex<counter)
			{
				System.out.print("*");
				shapeIndex++;
			}
			System.out.print(" ");
			
			counter++;
		}
		
		//Part 4
		System.out.println();
		System.out.println("Enter the size of the equal sides in an isoscelese triangle: ");
		
		int size = Math.abs(in.nextInt());
		
		for(int i = 1; i <= size; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				if(i == size || j == i || j == 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
