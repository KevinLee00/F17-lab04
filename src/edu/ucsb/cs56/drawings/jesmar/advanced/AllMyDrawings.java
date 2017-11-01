package edu.ucsb.cs56.drawings.jesmar.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Jesmar Castillo
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few socks 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Sock s1 = new Sock(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(s1);
	
	// Make a black sock that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape s2 = ShapeTransforms.scaledCopyOfLL(s1,0.5,0.5);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	g2.setColor(Color.BLACK); g2.draw(s2);
	
	// Here's a sock that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	s2 = ShapeTransforms.scaledCopyOfLL(s2,4,4);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(s2); 
	
	// Draw two socks with stripes
	
	StripedSock ss1 = new StripedSock(50,350,40,75);
	StripedSock ss2 = new StripedSock(150,25,150,200);
	
	g2.draw(ss1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(ss2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few socks by Jesmar Castillo", 20,20);
    }
    
    
	
	
	
	
	
	
	
    /** Draw a picture with a few Socks and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some coffee cups.
	
	CoffeeCup large = new CoffeeCup(100,50,225,150);
	CoffeeCup smallCC = new CoffeeCup(20,50,40,30);
	CoffeeCup tallSkinny = new CoffeeCup(20,150,20,40);
	CoffeeCup shortFat = new CoffeeCup(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Sock s1 = new Sock(100,250, 75, 100);
	g2.setColor(Color.CYAN); g2.draw(s1);
	
	// Make a black Sock that's half the size, 
	// and moved over 150 pixels in x direction
	Shape s2 = ShapeTransforms.scaledCopyOfLL(s1,0.5,0.5);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	g2.setColor(Color.BLACK); g2.draw(s2);
	
	// Here's a Sock that's 6x as big (2x the original)
	// and moved over 150 more pixels to right.
	s2 = ShapeTransforms.scaledCopyOfLL(s2,6,6);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(s2); 
	
	// Draw two Socks with Stripes
	
	StripedSock ss1 = new StripedSock(150,375,40,75);
	StripedSock ss2 = new StripedSock(350,325,100,200);
	
	g2.draw(ss1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second Sock 180 degrees around its center.
	Shape ss3 = ShapeTransforms.rotatedCopyOf(ss2, Math.PI/2.0);
	
	g2.draw(ss3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Coffee Cups and a few Socks by Jesmar Castillo", 20,20);
    }
    
	
	
	
	
	
	
	
    /** Draw a different picture with a few Socks
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Socks by Jesmar Castillo", 20,20);
	
	
	// Draw some socks
	for(int i = 1; i < 10; i++){
		StripedSock ss1 = new StripedSock(i*50, 50, 50, 100);
		g2.setColor(Color.RED);     g2.draw(ss1);
		StripedSock ss2 = new StripedSock(50, i*100, 50, 100);
		Shape ss3 = ShapeTransforms.rotatedCopyOf(ss2, Math.PI/4.0);
		g2.draw(ss3);
	}
    }
}

