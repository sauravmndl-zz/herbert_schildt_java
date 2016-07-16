class A
{
	int calculate(int a,int b)
	{
		int c=a*b;
		return c;
	}
	float	calculate(float a,int b)
	{
		return a-b;
	}
	double calculate(int a,float b)
	{
		return a+b;
	}
}
class Overloading
{
	public static void main(String args[])
	{
		A r=new A();
		System.out.println("The result is:"+r.calculate(10.5f,20));
		System.out.println("The result is:"+r.calculate(10,20));
		System.out.println("The result is:"+r.calculate(10,20.5f));
	}
}


		