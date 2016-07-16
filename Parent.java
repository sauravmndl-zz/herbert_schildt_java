class Child extends Thread
{
	public void run()
	{
          
		try {
			for(int i=5;i>0;i--)
			{
			System.out.println("Child:"+i);
			Thread.sleep(500);
			}
		      }
		catch(InterruptedException e)
		{
			System.out.println("Interrupted child");
		}
			System.out.println("Exiting child");
	}
}
class Parent
{
	public static void main(String args[])
	{
	new Child().start();
	try{
			for(int i=5;i>0;i--)
		{
			System.out.println("Parent:"+i);
			Thread.sleep(1000);
		}
	}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted Parent");
		}
			System.out.println("Exiting Parent");
	}
}
	
	