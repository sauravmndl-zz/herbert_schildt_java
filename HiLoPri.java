class Clicker implements Runnable{
	long click=0;
	Thread t;
	String name;
	private volatile boolean running=true;
	public Clicker(String s,int p)
	{
		name=s;
		t=new Thread(this);
		t.setPriority(p);
	}
	public void run()
	{
		try{
			for(int i=1;i<=5;i++)
			{
			System.out.println(name+":"+i);
			Thread.sleep(1000);
			}
				}
			catch(InterruptedException e){}
		while(running)
		{	
			click++;
		}
	}
	public void stop()
	{
		running=false;
	}
	public void start()
	{
		t.start();
	}
}
class HiLoPri{
	public static void main(String[]args){
	Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
	Clicker hi=new Clicker("One",Thread.NORM_PRIORITY+2);
	Clicker lo=new Clicker("Two",Thread.NORM_PRIORITY-2);
	lo.start();
	hi.start();
	try{
	Thread.sleep(10000);
	}catch(InterruptedException e){
	System.out.println("Main thread interrupted");
	}
	lo.stop();
	hi.stop();
	try{
	hi.t.join();
	lo.t.join();
	}catch(InterruptedException e){}
	System.out.println(lo.click+"  "+hi.click);
}
}