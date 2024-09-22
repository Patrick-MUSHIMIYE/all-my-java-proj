package assignment;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printing out the statement informing users to calculate their BMI
		System.out.println("calculate your BMI index");
		{
			String first_name = "Patrick"; // assigning the name Patrick to first_name variable name with string data type
			String second_name = "Patchu"; // assigning the name Patchu to second_name variable name with string data type
			double Height = 2.9584; // initializing the variable name called height with double data type  to 2.9584
			int Weight = 67; // assigning 67 to Weight variable name with integer data type
			double BMI = Weight/Height; // assigning the fraction of weight and height to BMI variable
			/* printing out one statement using System.out.print by concatenating all variable names and also 
			 * depict the results for BMI index in kg/squared meter provided    */
			System.out.print(first_name + " ");
			System.out.print(second_name +" ");
			System.out.print("has" + " ");
			System.out.print(BMI + " ");
			System.out.print("kg/squared meter" + " of BMI" );		
		}
	}

}
