// a program to change the script so that first and last name are required and the phone number is optional.
package homework;
import java. util.*;
public class Pnames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using scanner for getting input from user
		Scanner Name = new Scanner(System.in);
		{
			// a statement telling user to input first name
		System.out.println("please enter your first name");
		String Fname = Name.nextLine(); // creation of Fname variable to store the name entered by use
		if (Fname.isEmpty()) // if condition to check if user has either entered the name or not
		{
			System.out.println("Don't leave any fields empty"); // statement informing user to don't leave input space without entering the name
		
		}else
		{
			System.out.println(Fname); // printing the name entered by the use
		
		}
		System.out.println("please enter your second name"); // statement asking user to input his/her name
		String Lname = Name.nextLine(); // creation of Lname variable to store the name entered by user
		if (Lname.isEmpty()) // if condition checking if user left the input space empty
		{
			System.out.println("Don't leave any fields empty"); // statement prompt user to do not leave input space without entering the name
		}else
		{
			System.out.println(Lname); // printing the name entered by the use
		}
		// using if condition to check if user has either leave first name empty or leave second name empty
		if (Fname.isEmpty() | Lname.isEmpty())
		{
			System.exit(0); // using System.exit() function when user not entered first or last name
		}
		System.out.println("please enter your phone number"); // statement asking user to input his/her phone number
		String phone = Name.nextLine(); // creation of phone variable to store the phone number entered by user
		if (phone.isEmpty()) // if condition to check whether user input his/her phone number or not
		{
			System.out.println("thank you for entering your data");// printing the statement thank you for entering your data even if use ain't entered them
		}else
		{	
			System.out.println(phone); // printing the phone entered by the use
			System.out.println("thank you for entering your data");
		}
	}
		Name.close();
}
	}
