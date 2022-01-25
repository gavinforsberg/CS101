
public class Inheritance
{

	public static void main(String[] args)
	{
		car a = new car();
		boat b =  new boat();
		plane c = new plane();
		helicopter d = new helicopter();
		Ferrari e = new Ferrari();
		jet f = new jet();
		Porsche g = new Porsche();
		Porsche911 porsche = new Porsche911();
		
//		moveVehicle(a);
//		moveVehicle(b);
//		moveVehicle(c);
//		moveVehicle(d);
//		moveVehicle(e);
		
		printVehicleName(a);
		printVehicleName(b);
		printVehicleName(c);
		printVehicleName(d);
		printVehicleName(e);
		printVehicleName(f);
		printVehicleName(g);
		printVehicleName(porsche);
		
	}
	
	public static void moveVehicle(vehicle v)
	{
		v.move();
		
	}
	
	public static void printVehicleName(vehicle v)
	{
		System.out.println(v.getName());
	}	
	

}
