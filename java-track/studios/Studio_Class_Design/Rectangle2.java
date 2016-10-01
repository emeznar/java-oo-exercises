package Studio_Class_Design;

public class Rectangle2 {
	//Fields: //length - int, width - int, area - int, perimeter - int
	private int length;
	private int width;
	private int area;
	private int perimeter;
	
	// Behaviors:
	//Create a rectangle
	public Rectangle2(int length, int width)
	{
		this.length = length;
		this.width = width;
		this.area = area;
		this.perimeter = perimeter;
		
	}
	
	public int getlength()
	{
		return this.length;
	}
	
	public int getwidth()
	{
		return this.width;
	}
	
	public int getarea()
	{
		this.area = length * width;
		return this.area;
	}	
	
	public int getperimeter()
	{
		this.perimeter = 2*(length + width);
		return this.perimeter;
	}	
	
	public static void main(String args[])
	{
		Rectangle2 myRectangle2 = new Rectangle2(12, 14);
		System.out.println(myRectangle2.getlength());
		System.out.println(myRectangle2.getwidth());
		System.out.println(myRectangle2.getarea());
		System.out.println(myRectangle2.getperimeter());
	}
}

	


