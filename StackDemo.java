import java.util.*;
class StackDemo
{
	int top;
	double stack[];
	public StackDemo(int size)
	{
		top=-1;
		stack=new double[size];
	}
	void insert(double el)
	{
		stack[++top]=el;
	}
	double remove()
	{
		return stack[top--];
	}
	boolean isfull()
	{
		return (top==stack.length-1);
	}
	boolean isempty()
	{
		return (top==-1);
	}

	public static void main(String[] args)
	{
		StackDemo s=new StackDemo(5);
		
		Scanner n=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("\n\n1.Insertion\n2.Deletiion\n3.Checking full\n4.Checking empty\n5.Display");	
			System.out.println("\n Enter your choice:");
			int x=n.nextInt();
			switch(x)
			{
			case 1:	if(s.top>3)
				{
					System.out.println("----::You cann't enter more::----");
					break;
				}
				else
				{
					System.out.println("Enter the element you want to insert:");
					int y=n.nextInt();
					s.insert(y);
				}
				break;
			case 2:	if(s.top<0)
				{
					System.out.println("----::You cann't delete more::----");
					break;
				}
				else
					System.out.println("Deleted element is stack["+s.top+"]="+s.remove());
				break;
			case 3:	if(s.isfull())
					System.out.println("\n----The stack is full----\n");
				else
					System.out.println("\n----The stack is not full----\n");
				break;
			case 4:	if(s.isempty())
						System.out.println("----The stack is empty----");
				else
					System.out.println("----The stack is not empty----");
				break;
			case 5:	System.out.println("The elements are:");
				for(int i=0;i<=s.top;i++)
				System.out.println("\nstack["+i+"]="+s.stack[i]);
			default:break;
			}
		}		
	}		
				
}		

