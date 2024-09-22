package inheritance;

// creation of parent class called shape
public class Shape {
	// attribute initialisation
	int L = 3, W = 4, S = 4;
	int AREA = L*W;
	int VOLUME = S*S*S;
	
	//class method display
public void display() {
	System.out.println("Display the Area and Volume of Regular Polygons"); // method display () display  the Area and Volume of Regular Polygons
}
}
// creation of child class called rectangle inherit to parent class shape
class Rectangle extends Shape
{
	// class method called area
	public void area()
	{
		System.out.println("Area of rectangle is " + AREA); // method area () display the area of rectangle
		}
}
//creation of child class called cube inherit to parent class rectangle
class Cube extends Rectangle
{
	// class method called volume
	public void volume() {
		System.out.println("volume of cube is " + VOLUME); // method volume () display the volume of rectangle

	}
	// calling class inside main()
	public static void main(String[] args) {
		// creating class object with last child class to access all inherited classes
		Cube object = new Cube();
		object.display(); // accessing display method value
		object.area(); // accessing area method value
		object.volume(); // accessing volume method value


	}

}
