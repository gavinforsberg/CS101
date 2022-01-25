import java.util.Scanner;

public class MidTerm
{

	public static void main(String[] args)
	{
//		//#3
//		Scanner in = new Scanner ( System.in );
//		
//		int input = in.nextInt();
//		int min = input;
//		int max = input;
//		
//		while(input>0)
//		{
//			
//			if(input < min)
//			{
//				min = input;
//			}
//			if(input > max)
//			{
//				max = input;
//			}
//			
//			input = in.nextInt();
//		}
//		System.out.println("The max number is:\t" + max);
//		System.out.println("The min number is:\t" + min);
//		
		
//		//#4
//		Scanner in = new Scanner ( System.in );
//		
//		String str = in.nextLine();
//		int e = 0;
//		
//		for(int index = 0; index < str.length(); index++)
//		{
//			if(str.charAt(index) == 'e')
//			{
//				e++;
//			}
//		
//		}
//		
//		System.out.println(e);
		
//		//5
//		Scanner in = new Scanner (System.in);
//		
//		String original = in.nextLine();
//		String reversed = " ";
//		
//		for (int index = original.length() -1; index >=0; index--)
//		{
//			reversed += original.charAt(index);
//		}
//		System.out.println(reversed);
	
//		//6
//		Scanner in = new Scanner (System.in);
//		
//		long power = 1;
//		long b = 0;
//		long exp = 0;
//		
//		for(int count = 0; count < exp; count++)
//		{
//			power *= b;
//		}
//		System.out.println(power);

//		//#10
//		Scanner in = new Scanner (System.in);
//		
//		double input;
//		
//		do
//		{
//			input = in.nextDouble();
//		}
//		while(!(input > 10 || input < 0));

//		//#11
//		String pattern = " ";
//		
//		for(int i = 1; i <= 20; i++)
//		{
//			pattern += (i % 10);
//			
//		}
//		
//		System.out.println(pattern);
		
		//12
		String pattern = " ";
		
		for(int i = 0; i< 3; i++)
		{
			for(int e = 2; e <= 10; e += 2)
			{
				pattern += e % 10; 
			}
			pattern += " ";
			
			for(int o = 1; o <=9; o += 2)
			{
				pattern += o % 10;
			}
			pattern += " ";
		}
		System.out.println(pattern);
		
		int sum = 0; 
		
		for(int i = -100; i <= -20; i++)
		{
			sum += i;
		}
		System.out.println(sum);
		
		
	}
}		
