package GUI;


import java.awt.Color;
import java.awt.Component;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GUI_controller {
	static GUI_controller controller;
	public GUI_controller()
	{
	JFrame frame = new JFrame();
	Box Mainbox = Box.createVerticalBox();
	Box box1 = Box.createHorizontalBox();
	Box box2 = Box.createHorizontalBox();
	JApplet applet = new JApplet();
	
	
	JButton login = new JButton("Login");
	JButton signUp = new JButton("Sign Up");
	JLabel picture = new JLabel(new ImageIcon("H:\\SkippableTV_15.8\\smoother logo.png" ));
	
	box1.add(picture);
	box2.add(Box.createHorizontalStrut(0));
	box2.add(login);
	box2.add(Box.createHorizontalStrut(100));
	box2.add(signUp);
	
	Mainbox.add(box1);
	Mainbox.add(box2);
	
	applet.add(Mainbox);
	
	frame.add(applet);
	frame.pack();
	frame.setVisible(true);
	frame.setLocation(200, 50);
	frame.setSize(1000, 800);
	
	
	
	
	}
	
	
	
	
	public static void main(String[] args) //the main method
	{
		controller = new GUI_controller();
	}


}
