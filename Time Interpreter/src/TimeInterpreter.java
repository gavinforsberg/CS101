import java.util.Scanner;

/*
 * Gavin Forsberg
 * Proj1
 * Time Interpreter
 * Takes an inputed time, states total seconds, and simplifies it to days:hours:minutes:seconds
 */

public class TimeInterpreter
{
	
	public static void main(String[] args)
	{
		
		int hours, minutes, seconds;
		//Days are set to 0 because the user will not input days
		int days = 0;
		//secondsRemaining holds the number of seconds after it is simplified from the number of days, hours, and minutes
		int secondsRemaining;
		
		//*\\ means any number of printable characters, followed by a colon, 
		//followed by any number of characters. Thus, : delimits instead of white space
		Scanner in = new Scanner (System.in);
		in.useDelimiter("\\s*:\\s*");
		System.out.println("Enter the time in the form <Hours : minutes : seconds>: ");
		
		
		hours = in.nextInt();
		minutes = in.nextInt();
		seconds = in.nextInt();
		
		//When totalSecods is found it will be a constant, while seconds is used to find simplified time  
		final int totalSeconds;
		final int hours_per_day = 24;
		final int minutes_per_hour = 60;
		final int seconds_per_minute = 60;
		
		//Finds the total number of seconds by breaking down the hours and minutes, adding them to seconds
		totalSeconds = ((hours*minutes_per_hour)*seconds_per_minute) + (minutes * seconds_per_minute) + seconds;
		
		//Finds the number of days by dividing the total seconds by seconds of total days
		days = totalSeconds / hours_per_day / minutes_per_hour / seconds_per_minute;
		 
		//Finds the remaining seconds after subtracting the seconds of total days
		secondsRemaining = totalSeconds - (days * hours_per_day * minutes_per_hour * seconds_per_minute);
		
		//Finds the number of hours by dividing the remaining seconds by seconds of total hours
		hours = secondsRemaining / minutes_per_hour / seconds_per_minute;
		
		//Finds the remaining seconds after subtracting the seconds of total hours
		secondsRemaining = secondsRemaining - (hours * minutes_per_hour * seconds_per_minute);
		
		//Finds the number of minutes by dividing the remaining seconds by seconds of total minutes
		minutes = secondsRemaining / seconds_per_minute;
		
		//Finds the remaining seconds after subtracting the seconds of total minutes
		secondsRemaining = secondsRemaining - (minutes * seconds_per_minute);
	
		//Sets the seconds equal to the remaining seconds
		seconds = secondsRemaining;
		
		//If statement will execute and simplify if there is -1 or 1+ days inputed
		if(days != 0)
		{
			//If days is not equal to 0 and hours are less than 0, changes hours to positive
			if(hours < 0) 
			{
				hours = hours * -1; 
			}
			//If days is not equal to 0 and minutes are less than 0, changes minutes to positive
			if(minutes < 0)
			{
				minutes = minutes * -1;
			}
			//If days is not equal to 0 and seconds are less than 0, changes seconds to positive 
			//and condenses hours to minutes and seconds
			if(seconds < 0)
			{
				seconds = seconds * -1;
			}
			
			System.out.println("The time consists of " + totalSeconds + " seconds.");
			//Prints the simplified time in days:hours:minutes:seconds: 
			System.out.println("Simplified time: " + days + ":" + hours + ":" + minutes + ":" + seconds + ":" );
		}
		
		//If statement will execute if days are 0 and hours are not 0
		if((hours < 0 && days == 0) || (days == 0 && hours != 0))
		{
			//If hours is not equal to 0 and minutes are less than 0, changes minutes to positive
			if(minutes < 0)
			{
				minutes = minutes * -1;
			}
			//If hours is not equal to 0 and seconds are less than 0, condenses to positive minutes to seconds
			if(seconds < 0)
			{
				seconds = seconds * -1;
			}
			
			System.out.println("The time consists of " + totalSeconds + " seconds.");
			//Prints the simplified time in hours:minutes:seconds:
			System.out.println("Simplified time: " + hours + ":" + minutes + ":" + seconds + ":" );
		}
		
		//If statement will execute if hours are 0 and minutes are not 0
		if((minutes < 0 && hours == 0) || (hours == 0 && minutes != 0))
		{
			//If minutes are not equal to 0 and seconds are less than 0, condenses to positive seconds
			if(seconds < 0)
			{
				seconds = seconds * -1;
			}
			
			System.out.println("The time consists of " + totalSeconds + " seconds.");
			//Prints the simplified time in minutes:seconds:
			System.out.println("Simplified time: " + minutes + ":" + seconds + ":" );
		}
		
		//If statement will execute if minutes, hours, and days are all equal to 0
		if(minutes == 0 && hours == 0 && days == 0)
		{
			System.out.println("The time consists of " + totalSeconds + " seconds.");
			//Prints the output in seconds
			System.out.println("Simplified time: " + seconds + ":");
		}
	}
}
