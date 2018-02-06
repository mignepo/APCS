//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);


		Shape shape1 = new Shape(100,100,100,100, Color.BLUE);
		shape1.draw(window);

		Shape shape4 = new Shape(125,125,50,50, Color.RED);
		shape4.draw(window);
		
		Shape shape2 = new Shape(400,200,200,200, Color.GREEN);
		shape2.draw(window);
		
		Shape shape3 = new Shape(450,250,100,100, Color.YELLOW);
		shape3.draw(window);
		
		
		//instantiate a Shape
		//tell your shape to draw

		//instantiate a Shape
		//tell your shape to draw

		//instantiate a Shape
		//tell your shape to draw
	}
}