package assignment;

import java.util.*;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a java program to find the perimeter and surface area of rectangle
		System.out.println("A project to find the perimeter and surface area of rectangle");
		System.out.println(" ");
		System.out.println("FINDING THE AREA AND PERIMETER OF RECTANGLE USING SHORT datatype.");
        // Using Scanner for Getting Input from User
		Scanner Object = new Scanner(System.in);
		{
			// statement asking user to input length and width of rectangle with short data type
			System.out.println("enter the length of rectangle");
			// using nextShort method to pull the input number from the keyboard and store it to length variable
			short length = Object.nextShort();
			System.out.println("enter the width of rectangle");
			// using nextShort method to pull the input number from the keyboard and store it to width variable
			short width = Object.nextShort();
			/*printing the perimeter of rectangle by summing length and width and multiplying them by 2, and also
			 * printing the surface area of rectangle by multiplying length and width */
			System.out.println("the perimeter of rectangle using short datatype is:"+ (length+width)*2);
			System.out.println("the surface area of rectangle using short datatype is:"+ length*width);
		}
		System.out.println(" ");
		System.out.println("FINDING THE AREA AND PERIMETER OF RECTANGLE USING INT datatype.");
		{
			// statement asking user to input length and width of rectangle with integer data type
			System.out.println("enter the length of rectangle");
			// using nextInt method to pull the input number from the keyboard and store it to l variable
			int l = Object.nextInt();
			System.out.println("enter the width of rectangle");
			// using nextInt method to pull the input short number from the keyboard and store it to w variable
			int w = Object.nextInt();
			/*printing the perimeter of rectangle by summing l and w and multiplying them by 2, and also
			 * printing the surface area of rectangle by multiplying l and w */
			System.out.println("the perimeter of rectangle using int datatype is:"+ (l+w)*2);
			System.out.println("the surface area of rectangle using int datatype is:"+ l*w);
		}
		System.out.println(" ");
		System.out.println("FINDIG THE AREA AND PERIMETER OF RECTANGLE USING LONG datatype.");
		{
			// statement asking user to input length and width of rectangle with long integer data type
			System.out.println("enter the length of rectangle");
			// using nextLong method to pull the input number from the keyboard and store it to a variable
			long a = Object.nextLong();
			System.out.println("enter the width of rectangle");
			// using nextLong method to pull the input number from the keyboard and store it to b variable
			long b = Object.nextLong();
			/*printing the perimeter of rectangle by summing a and b and multiplying them by 2, and also
			 * printing the surface area of rectangle by multiplying a and a */
			System.out.println("the perimeter of rectangle using long datatype is:"+ (a+b)*2);
			System.out.println("the surface area of rectangle using long datatype is:"+ a*b);
		}
		System.out.println(" ");
		System.out.println("FINDING THE AREA AND PERIMETER OF RECTANGLE USING DOUBLE datatype.");
		{
			// statement asking user to input length and width of rectangle with Double data type
			System.out.println("enter the length of rectangle");
			// using nextDouble method to pull the input number from the keyboard and store it to x variable
			double x = Object.nextDouble();
			System.out.println("enter the width of rectangle");
			// using nextDouble method to pull the input number from the keyboard and store it to y variable
			double y = Object.nextDouble();
			/*printing the perimeter of rectangle by summing l and w and multiplying them by 2, and also
			 * printing the surface area of rectangle by multiplying x and y */
			System.out.println("the perimeter of rectangle using double datatype is:"+ (x+y)*2);
			System.out.println("the surface area of rectangle using double datatype is:"+ x*y);
		}
		// closing scanner
		Object.close();
	}
}	


