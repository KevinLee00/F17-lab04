package edu.ucsb.cs56.drawings.matthewmitchell.advanced;

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
 * @author Matthew Mitchell
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture with poles and tetherball poles
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Pole p1 = new Pole(100,250,15,120);
	g2.setColor(new Color(255,255,000)); g2.draw(p1);
	
	// Make a pink pole that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	g2.setColor(new Color(255,051,153)); g2.draw(p2);
	
	// Here's a pole that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	p2 = ShapeTransforms.scaledCopyOfLL(p2,4,4);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(102,102,204)); 
	g2.draw(p2); 
	
	// Draw two poles for tetherball
	
	TetherballPole tp1 = new TetherballPole(50,50,10,90);
	TetherballPole tp2 = new TetherballPole(200,50,12,100);
	
	g2.draw(tp1);
	g2.setColor(new Color(0,255,0)); g2.draw(tp2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Some tetherball poles by Matthew Mitchell", 20,20);
    }
    
    
    /** Draw a picture with a tetherball poles(including a rotated one)
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some tetherball poles.
	
	TetherballPole largeTp = new TetherballPole(100,200,20,140);
	TetherballPole smallTp = new TetherballPole(20,50,5,40);
	TetherballPole tallSkinny = new TetherballPole(20,170,10,100);
	TetherballPole shortFat = new TetherballPole(100,65,30, 60);
	

	g2.setColor(Color.RED);     g2.draw(largeTp);
	g2.setColor(Color.GREEN);   g2.draw(smallTp);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	TetherballPole tp1 = new TetherballPole(300,40,25,150);
	g2.setColor(Color.CYAN);

	// Rotate the second tetherball pole 45 degrees around its center.
	Shape tp2 = ShapeTransforms.rotatedCopyOf(tp1, Math.PI/4.0);
	g2.draw(tp2);

	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of tetherball poles by Matthew Mitchell", 20,20);
    }
    
    /** Draw a different picture with poles and a tetherball pole
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of poles and a tetherball pole by Matthew Mitchell", 20,20);
	
	
	// Draw some poles
	
	Pole tall = new Pole(100, 200, 15, 190);
	Pole small = new Pole(200, 30, 15, 50);
	TetherballPole tbpole = new TetherballPole(300, 50, 20, 100);
	
	g2.setColor(Color.RED);     g2.draw(tall);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.ORANGE);  g2.draw(tbpole);
	
    }       
}
