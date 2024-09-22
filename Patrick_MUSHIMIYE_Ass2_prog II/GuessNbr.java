// A program that generates random number between 0 and 30 and asks the user to guess what the number
package guessnbr;
import java.util.*;

public class GuessNbr {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int trials = 5; // assigning integer 5 to variable name trials as 
		int count = 0; // Initialising count variable name to zero as the starting point for counting trials
		Random rand = new Random();// creation of rand object from random package helps to generate the random number between 0 and 30
		int random_number = rand.nextInt(0, 30); // creation of random_variable to hold generalised number used nextInt() method
		Scanner obj = new Scanner(System.in); // Using Scanner for Getting Input from User
		{
			for (count = 0; count < trials; count++) // using for loop to iterate 5 trials
			{
				System.out.println("enter the number between 0 and 30"); // printing statement prompt user to input number between 0 and 30
				int guessed_number = obj.nextInt();// using nextInt method to pull the guessed number from the keyboard and store it to guessed variable name
			// if condition check whether user guessed_number which is greater, less or equal than the random variable
				if (guessed_number > random_number)
				{
					System.out.println("too high, try again");
					}
				else if (guessed_number < random_number)
				{
					System.out.println("too low, try again");
				}
				else if (guessed_number == random_number)
				{				
					System.out.println("matching\n");
					System.out.println("found after " + count + " trials");
					break;// using break statement once user get guessed number matched with random_varible
					}
				}
			if (count == trials) // if condition to check if count is equal to trials
			{ 
				System.out.println("you're allowed to try only 5 trials"); // statement informing user is allowed to try on 5 times
				System.out.println("the random value is:" + random_number); // statement informing user the random_variable after all trials
				}
			}obj.close();
	}

}

