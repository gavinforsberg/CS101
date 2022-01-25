import java.util.Random;

public class Arrays1
{
	public static void main(String[] args)
	{
		int[] hello = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		
		System.out.println("Minimum: " + findMin(hello));
		System.out.println("Maximum: " + findMax(hello));
		System.out.println("Mean: " + findMean(hello));
		
		System.out.println();
		
		int[] array2 = new int[10];
		System.out.println( java.util.Arrays.toString( array2 ) ) ;
		
		populate( array2 ) ;
		System.out.println( java.util.Arrays.toString( array2 ) ) ;
	}	
	

	public static int findMin(int[] hello)
	{
		int min = hello[0]; 
		
		for(int i = 0; i < hello.length; i++)
		{
			if(hello[i] < min)
				min = hello[i];
		}
		return min;	
	}
	
	public static int findMax(int[] hello)
	{
		int max = hello[0]; 
		
		for(int i = 0; i < hello.length; i++)
		{
			if(hello[i] > max)
				max = hello[i];
		}
		return max;	
	}
	
	public static int findMean(int[] hello)
	{
		int mean = 0;
		
		for(int i: hello)
		{
			mean += i;
		}
		return mean / hello.length;
	}
	
	public static void populate(int[] hello)
	{
		Random rng = new Random();
		
		for(int i = 0; i < hello.length; i++)
		{
			hello[i] = rng.nextInt(101);
		}
	}
}
