import java.awt.*;
import java.applet.*;
public class Simple extends Applet
{
	public void paint(Graphics g)
	{
		/*g.drawRect(100,100,100,50);
		g.setColor(Color.green);
		g.drawOval(100,300,100,300);
		g.setColor(Color.yellow);
		g.fillOval(250,300,100,300);*/
		g.drawLine(200,500,200,100);
		g.setColor(Color.orange);
		g.fillRect(200,100,150,25);
		g.setColor(Color.white);
		g.fillRect(200,125,150,25);
		g.setColor(Color.green);
		g.fillRect(200,150,150,25);
}

}