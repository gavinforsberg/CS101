
public class Brennan
{
	private String _music;
	private int _numberOfEyes;
	private double _gunCircumference;
	
	public Brennan()
	{
		_music = "Irish Folk" ;
		_numberOfEyes = 3;
		_gunCircumference = 25.0;
	}
	
	public Brennan(String music)
	{
		_music = music;
		_numberOfEyes = 3;
		_gunCircumference = 25.0;
		
	}
	
	public String toString()
	{
		return "Our Brennan is listening to " + _music + " and has " + _numberOfEyes + " eyes." + "Also, he/she has " 
		+ _gunCircumference + "\" round guns!" ;
	}
}
