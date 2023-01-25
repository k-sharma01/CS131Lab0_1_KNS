/**
 * This class demonstrates use of the Square and Circle classes
 * 
 * @author Kirin Sharma
 * @version 1.0
 * Spring/2023
 */

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Initializes a square with side length of 2 and prints its area
		Square mySquare = new Square(2);
		System.out.println("Square Area: " + mySquare.area());
		
		// Initializes a circle with a radius of 1 and prints its area
		Circle myCircle = new Circle(1);
		System.out.println("Circle Area: " + myCircle.area());
		
	} // end main

} // end class
