import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DrawCircleApplet  extends JApplet
{
	
	/*
	public static void main(String[] args) 
	{
		
		JPanel controlPanel = new JPanel();
		
		JLabel xLabel = new JLabel("xCenter = ");
		JLabel yLabel = new JLabel("yCenter = ");
		JLabel radiusLabel = new JLabel("radius = ");
		
		controlPanel.add(xLabel);
		controlPanel.add(xCenter);
		controlPanel.add(yLabel);
		controlPanel.add(yCenter);
		controlPanel.add(radiusLabel);
		controlPanel.add(radius);
		
		JFrame controlFrame = new JFrame();
		
		controlFrame.add(controlPanel);
		controlFrame.pack();
		controlFrame.setVisible(true);
		controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFrame circleFrame = new JFrame();
		circleFrame.setSize(500, 500);
		circleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		circleFrame.setVisible(true);
		
	}
	*/
	
	public DrawCircleApplet()
	{
		
		JButton drawButton = new JButton("draw");
		
		JPanel controlPanel = new JPanel();
		
		JLabel xLabel = new JLabel("xCenter = ");
		JLabel yLabel = new JLabel("yCenter = ");
		JLabel radiusLabel = new JLabel("radius = ");
		
		controlPanel.add(xLabel);
		controlPanel.add(xCenter);
		controlPanel.add(yLabel);
		controlPanel.add(yCenter);
		controlPanel.add(radiusLabel);
		controlPanel.add(radius);
		controlPanel.add(drawButton);
		
		JFrame frame = new JFrame();
		
		frame.add(controlPanel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		class DrawButtonListener implements ActionListener
		{
			
			public void actionPerformed(ActionEvent event)
			{
				double x = Double.parseDouble(xCenter.getText());
				double y = Double.parseDouble(yCenter.getText());
				double r = Double.parseDouble(radius.getText());
				
				circle = new Ellipse2D.Double(x-r, y-r, r*2, r*2);
				//circle = new Ellipse2D(x-r, y-r, r*2, r*2);
				repaint();
				
			}
			
		}
		
		ActionListener listener = new DrawButtonListener();
		drawButton.addActionListener(listener);
		
	}
	
	public void paint(Graphics g)
	{
		
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.draw(circle);
		
	}
	
	private Ellipse2D.Double circle;
	
	final static JTextField xCenter = new JTextField(5);
	final static JTextField yCenter = new JTextField(5);
	final static JTextField radius = new JTextField(5);
	
}

