
public class vehicle
{
	private String _name;

	public vehicle(String name)
	{
		_name = name;
	}
	
	public String getName()
	{
		return _name;
	}
	
	public void move()
	{
		System.out.println("Look at me! I'm a vehicle! I'm moving!");
	}
}
