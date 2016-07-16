class Room
{
	float length;
	float breadth;
	Room(float x,float y)
	{
		length=x;
		breadth=y;
	}
	Room(float x)
	{
		length=breadth=x;
	}
	float area()
	{
		return(length*breadth);
	}
}
class Rect
{
	public static void main(String[]args)
	{
		Room r1=new Room(25.0f,15.0f);
		Room r2=new Room(20.0f);
		System.out.println("R1="+r1.area()+"\n"+"R2="+r2.area());
	}
}