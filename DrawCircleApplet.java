
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JTextField;

public class DrawCircleApplet 
{
	
	public static void main(String[] args) 
	{
		
		
		
	}
	
	public DrawCircleApplet()
	{
		
		JButton button = new JButton("draw");
		
		class DrawButtonListener implements ActionListener
		{
			
			public void actionPerformed(ActionEvent event)
			{
				
				
				
			}
			
			
			
		}
		
		ActionListener listener = new ButtonListener();
		button.addActionListener(listener);
	}
	
	public void paint(Graphics g)
	{
		
		
		
	}
	
	Ellipse2D circle;
	
	JTextField xCenter = new JTextField();
	JTextField yCenter = new JTextField();
	JTextField radius = new JTextField();
	
}
