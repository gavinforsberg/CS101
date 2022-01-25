
public class RecursionDemo
{	//Recursion is a method that calls itself
	//SEE SECTION 5.9 IN THE BOOK FOR MORE...

	public static void main(String[] args)
	{	
		int result = factorialNoRecursion();
		System.out.println(result);
	}
	
//	public static int factorial4(int alwaysA4)
//	{
//		return alwaysA4 * factorial3(3);
//	}
//	
//	public static int factorial3(int alwaysA3)
//	{
//		return alwaysA3 * factorial2(2);
//	}
//	
//	public static int factorial2(int alwaysA2)
//	{
//		return alwaysA2 * factorial1();
//	}
//	
//	public static int factorial1()
//	{
//		return 1;
//	}
	
	public static int factorialNoRecursion(int of)
	{
		int accumulator = 1;
		for(int i = 1; i <= of; i++)
		{
			accumulator = accumulator * i;
		}
		return accumulator;
	}
}


//	public static int factorial(int of)
//	{
//		//1.) always must have a base case that does not recurse 
//		if( of > 1)
//		{
//			return of * factorial( of - 1);
//		}
//		else
//		{
//			return 1;
//		}
//	}	
	
	

