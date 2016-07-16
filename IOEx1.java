import java.io.*;
public class IOEx1
{
	public static void main(String args[])
	{
		System.out.println("Enter the text:");
		echo(System.in);
	}
	public static void echo(InputStream istream)
	{
		int c=0;
		try{
			int i;
			while((i==System.in.read())!=-1)
			{
				System.out.println((char)i);
				c++;
		    	}
		}
		catch(Exception e)
		{
			System.err.println(e);		
		}
		System.out.println("The number echoes="+c);
	}
}