//Sean Staz
//CSci 112
//Java II

public class Driver 
{

	public static void main (String [] args)
	{
		
		Square square = new Square(6.6, 6.6);
		
		Rectangle rect = new Rectangle(5.0, 3.9);
		
		System.out.println("The area of the square is: " + square.getArea());
		System.out.println("The area of the rectangle is: " + rect.getArea());
	}
}
