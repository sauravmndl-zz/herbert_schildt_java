class A{
	int a;
	int b;
	A(int x,int y)
	{
		a=x;
		b=y;
	}
	
	int sum()
	{
		
		return a+b;
	}
	
	void display()
	{
		int res=sum();
		System.out.println("\nThe sum is:"+res);
	}
}

class Nesting{
	public static void main(String args[])
	{
		A a1=new A(10,20);
		a1.display();
		System.out.println("\ncnsdkskdjsk"+2+7);
	}
}
