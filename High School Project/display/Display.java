package dev.jordan.isugame.display;
/*
 	Handles Displays
 	jFrame Windows
 */

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display 
{
	private JFrame frame;
	private Canvas canvas;		//Canvas allows Drawing Graphics
	
	private String title;
	private int width, height;
	//jFrame Constructor
	public Display(String title, int width, int height)
	{
		this.title = title;
		this.width = width;
		this.height = height;
		createDisplay();	//Accesses createDisplay Method
	}
	private void createDisplay()
	{
		frame = new JFrame(title); 			//Initializes jFrame With Title
		frame.setSize(width, height); 		//Sets jFrame Size
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false); 			//Can't Resize Frame
		frame.setLocationRelativeTo(null); 	//Appears at Center of Screen
//				frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//				frame.setUndecorated(true);
		frame.setVisible(true);
		//Initialize Canvas
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		canvas.setFocusable(false);
		//Add Canvas to jFrame
		frame.add(canvas);
		frame.pack();	//Resizes So you can see Full canvas
	}
	
	public Canvas getCanvas()
	{
		return canvas;
	}
	
	public JFrame getFrame()
	{
		return frame;
	}
}
