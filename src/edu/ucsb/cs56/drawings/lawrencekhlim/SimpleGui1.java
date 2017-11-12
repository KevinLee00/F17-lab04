package edu.ucsb.cs56.drawings.lawrencekhlim;

import javax.swing.*;

/** SimpleGui1 comes from Head First Java 2nd Edition p. 355.
    It illustrates a simple GUI with a Button that doesn't do anything yet.
    
    @author Head First Java, 2nd Edition p. 355
    @author P. Conrad (who only typed it in and added the Javadoc comments)
    @author TODO: Add additional author here
    @version CS56, Spring 2013, UCSB
*/

public class SimpleGui1 {
    
    /** main method to fire up a JFrame on the screen
	@param args not used
    */
    
    public static void main (String[] args) {
        JFrame frame = new JFrame() ;
	
        JButton button = new JButton("Click me darn it! Click me harder!") ;
	
        java.awt.Color myColor = new java.awt.Color(123,234,012);   // R, G, B values.
        button.setBackground(myColor);
        button.setOpaque(true);
        
        button.addActionListener ( (p1) -> button.setBackground (new java.awt.Color ((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255))));
        
        frame. setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE) ;
        frame. getContentPane() . add(button) ;
        frame. setSize(300,300) ;
        frame. setVisible(true) ;
        
        
        //java.awt.Color buttonColor = new java.awt.Color (001,23,35);
        //button.setBackground (buttonColor);
    }
}
