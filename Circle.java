/**
 * This class represents a square and can calculate its area
 * 
 * @author Kirin Sharma
 * @version 1.0
 * Spring/2023
 */

public class Circle {
	
	private double radius; // holds the value of the length of the radius
	
	/**
	 * Constructs a circle with a radius of 0
	 */
	public Circle()
	{
		radius = 0;
	} // end constructor
	
	/**
	 * Constructs a circle with a radius length specified by argument
	 * @param radiusLength the value of which to initialize radius to
	 */
	public Circle(double radiusLength)
	{
		radius = radiusLength;
	} // end constructor
	
	/**
	 * Gets the current value of radius
	 * @return the current value of radius
	 */
	public double getRadius()
	{
		return radius;
	} // end getRadius
	
	/**
	 * Updates the value of radius
	 * @param radiusLength the value to update radius to
	 */
	public void setRadius(double radiusLength)
	{
		radius = radiusLength;
	} // end setRadius
	
	/**
	 * Calculates the area of the circle
	 * @return the area of the circle
	 */
	public double area()
	{
		return (Math.PI * (radius * radius));
	} // end area
	
} // end class
