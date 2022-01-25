import java.io.IOException;
import java.util.Scanner;

public class ExceptionsDemo2
{

	public static void main(String[] args) throws IOException
	{
		a(3);
	}
	
	public static void a(int x) throws IOException
	{
		b(5);
	}
	
	public static void b(int x) throws IOException
	{
		if(x % 2 == 0)
			throw new IOException();
		
	}
}