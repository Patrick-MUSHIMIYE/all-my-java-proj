package random_nbr;
import java.util.*;
public class WholeNbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program prompt use to input a whole number and output reverse of it");
		int Reverse= 0; // variable initialisation of Reverse variable, reverse variable hold the reversed number after 
		Scanner number = new Scanner(System.in);
		{
			System.out.println("enter the value of whole number to be reversed:");
			int Number = number.nextInt();
			while (Number != 0) // loop the number to be reversed by diving number by 10 till number equal to zero
			{
				int remainder = Number%10; // remainder variable name hold the remainder value after modulation of input number by 10
				Reverse = Reverse*10+remainder;  // Reverse variable hold reversed number
				Number = Number/10; // Variable name called Number hold the quotient after division of number
			}
				System.out.println("the reversed number is:" + Reverse);
		}
		number.close();
	}}
	
