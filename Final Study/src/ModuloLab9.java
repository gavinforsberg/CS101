import java.util.Scanner;

public class ModuloLab9
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input an integer: ");
		
		String input = in.nextLine();
		int zero = 0;
		int even = 0;
		int odd = 0;
		
		for(int i = 0; i < input.length(); i++)
		{
			int j = Integer.parseInt(String.valueOf(input.charAt(i)));
			
			if(j == 0)
			{
				zero++;
			}
			else if(j % 2 == 0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		
		System.out.println("Zeros: " + zero + "\nEven: " + even + "\nOdd: " + odd);
		
	}

}
