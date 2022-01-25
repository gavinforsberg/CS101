
public class car extends vehicle
{
	public car() //Car constructor
	{
		super("Car"); //Base class (vehicle) constructor 
	}
	
	public car(String name)
	{
		super (name);
	}
	
	public void move() //Override base class's move
	{
		System.out.println("Vroom! Vroom!");
	}
	
}
