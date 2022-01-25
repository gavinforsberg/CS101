import java.util.Random;
import java.util.Scanner;

public class Lab4
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter first and last name: ");
		
		String first = in.nextLine();
		String last = in.nextLine();
		
		Random rng = new Random();
		int j = 10 + rng.nextInt(90);
		
		first.toLowerCase();
		last.toLowerCase();
				
		String last2 = last.substring(0, 5);
		
		char fname = first.charAt(0);
		
		System.out.println(fname + last2 + j);
		
		in = new Scanner(System.in);
		Random random = new Random();
		
		int a = random.nextInt(8);
		int b = random.nextInt(8);
		int c = random.nextInt(8);
		int d = 101 + random.nextInt(789);
		int e = 1000 + random.nextInt(9000);
		
		System.out.println("(" + a + b + c + ")-" + d + "-" + e);
	}
}