
public class AreaOfCircle {

	final double PI = 3.14f;
	public void displayArea(double r)
	{
		double A = PI * r * r;

		System.out.println("Area of the circle is :" +String.format("%.2f",A));
	}

	
	public static void main(String[] args)
	{
	
		AreaOfCircle obj = new AreaOfCircle();
		obj.displayArea(5);
		
	}
}
