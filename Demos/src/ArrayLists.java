
/*	1.) The deck is already constructed with the right 52 cars via the provided constructor 
 * 	2.) The deck array should never change size, but rather use the currentTop variable 
 * 			already defined to track the virtual "top" of the deck
 * 	3.) The DeckException class can be used only once in deal() as so: throw new DeckException { "No more cards in deck!" ) ;
 * 		In order to only need to do that once, make sure that deal (int numCards) calls deal() numCards times.
 * 	4.) Note how the toString() method says to list the cards *remaining* in the deck. A for loop that doesn't 
 * 		start explicitly at 0 or Arrays.copyOfRange( deck, ..., ..., ) are the two best approaches to choose from. 
*/	



import java.util.ArrayList;

public class ArrayLists
{

	public static void main(String[] args)
	{
		ArrayList<String> is = new ArrayList<String>();
		is.add("Brennan");
		is.add("Skyler");
		is.add("Christianna");
		is.add("Gregory");
		
		ArrayList<String> is2 = new ArrayList<String>();
		is2.addAll(is);
		
		System.out.println();
		for(String s : is)
		System.out.println(s);
		
//		System.out.println();
//		for(String s : is2)
//		System.out.println(s);
		
		System.out.println();
		for(int i = 0; i < is.size(); i++)
		{
			String s = is.get(i);
			System.out.println(s);
		}
		
		is.set(0, "Brennan is a cool student.");
		
		System.out.println();
		for(String s : is)
		System.out.println(s);
		
		is.remove(3);
		
		System.out.println();
		for(String s : is)
		System.out.println(s);
		
//		is2.clear();
//		
//		System.out.println();
//		for(String s : is2)
//		System.out.println(s);
	}

}
