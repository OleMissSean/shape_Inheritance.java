//Sean Staz
//CSci 112
//Java II

public class Rectangle extends Shape
{
	private double height;
	private double width;
	
	public Rectangle(double h, double w)
	{
		height = h;
		width = w;
		setArea(height * width);
	}
}
