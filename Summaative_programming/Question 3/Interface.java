package nterface;

// creation of interface arithmetic
interface arthmetic
{
	// Initialise attributes
	int a = 10;
	int b = 20;
	int sum = a + b;
	int subtraction = a - b;

	// creation of interface addition
interface addition
{
	// abstract/interface method display_value
	public void display_value();
	
	// creation of interface subtraction
interface subtraction
{
	// abstract/interface method get_value
   public void get_value();
}

//A class that implements the interfaces addition and subtraction.
class Computation implements addition, subtraction
{
	// Implementing the capabilities of interface.
	
   public void display_value()
   {
       System.out.println("the sum of two numbers is " + sum);
   }
   public void get_value()
   {
       System.out.println("subtraction of two numbers is " + subtraction);
   }
   // Driver codes
class Interface {
	 public static void main(String args[]){
		 Computation obj = new Computation(); // abstraction object
		 obj.display_value(); // access display_value using interface object name
		 obj.get_value(); // access get_value using interface object name
   }
}
}
}}

