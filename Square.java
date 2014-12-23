//Sean Staz
//CSci 112
//Java II

public class Square extends Shape
{
	private double height;
	private double width;
	
	public Square(double h, double w)
	{
		height = h;
		width = w;
		setArea(height * width);
	}
}
