class A
{
	int x,y;
	A(int i,int j)
	{
		x=i;
		y=j;
	}
	void calculate(A a)
	{
		a.x+=10;
		a.y-=10;
	}
}
class Callbyref
{
	public static void main(String[] args)
	{
		A ob=new A(10,45);
		System.out.println("The value of x and y   "+ob.x+"  "+ob.y);
		ob.calculate(ob);
		System.out.println("The value of x and y   "+ob.x+"  "+ob.y);
	}
}