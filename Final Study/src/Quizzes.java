
public class Quizzes
{
		public static void main(String[] args)
		{
//			Car testCar = new Car();
//			Car test = new Car(20);
//			
//			//System.out.println(Car());
//			
//			try()
//			{
//				Car(20);
//			}
//			catch(IllegalArgumentException exc)
//			{
//				exc.printStackTrace();
//			}
		}
	
	
//		for(int i = 4; i >= 0; i--)
//		{
//			System.out.println(4 - i);
//		}

//		public static void main(String[] args)
//		{
//			System.out.println(new Integer (900800) != new Integer (900800));
//		}
	
	//Arrays Lab
	public int findZero(int[] A, int pos)
	{
		for(int i = 0; i < pos; i++)
		{
			if(A[i] == 0)
				return i;
		}
		return -1;
	}
	
	
	//Quiz 5
	public class Car
	{
		private String _make;
		private String _model;
		private double _capacity;
		private boolean _manual;
		
		private Car()
		{
			_make = "Mazda";
			_model = "MX-3";
			_capacity = 10;
			_manual = true;
		}
	
		private Car(String make, String model) throws IllegalArgumentException
		{
			_make = make; 
			_model = model;
		}
		
		private Car(double capacity) throws IllegalArgumentException
		{
			_capacity = capacity;
		}
	}
	
//	
//	public static int max(int a, int b)
//	{
//		
//	}
//	
//	public static boolean even (int number)
//	{
//		
//	}
//	
//	public String Current()
//	{
//		
//	}
//	
//	public Table()
//	{
//		
//	}
	
	public String hannah = "";
	
	public boolean doesHomework()
	{	
		return false;
	}
	
	public String Hannah(String gav)
	{ 
		if(!(hannah.doesHomework()))
			return "What's wrong with you, loser?";
	}
	
	
	
}
