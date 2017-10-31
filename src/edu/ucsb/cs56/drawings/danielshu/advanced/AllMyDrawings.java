package edu.ucsb.cs56.drawings.danielshu.advanced;

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
 * @author Daniel Shu
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few Stars and SheriffStars
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
        Star s1 = new Star(500,350,650,500);
	g2.setColor(Color.RED); g2.draw(s1);

	Star s2 = new Star(100,100,100,100);
	g2.setColor(Color.BLACK); g2.draw(s2);
	
	Shape s3 = ShapeTransforms.scaledCopyOfLL(s1,0.25,0.75);
	s3 = ShapeTransforms.translatedCopyOf(s3,-100,50);
	s3 = ShapeTransforms.rotatedCopyOf(s3, Math.PI/3);
	g2.setColor(new Color(0xA52A2A)); g2.draw(s3);

	Shape s4 = ShapeTransforms.translatedCopyOf(s1,-100,-100);
	s4 = ShapeTransforms.rotatedCopyOf(s4, Math.PI/2);
	
        SheriffStar ss1 = new SheriffStar(400, 30, 75, 100);
	s3 = ShapeTransforms.scaledCopyOfLL(ss1,4,4);
	s3 = ShapeTransforms.translatedCopyOf(s3,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(ss1); 
        

        SheriffStar ss2 = new SheriffStar(50,350,40,75);
	SheriffStar ss3 = new SheriffStar(200,350,200,100);
	
	g2.draw(ss2);

	Shape s5 = ShapeTransforms.translatedCopyOf(ss3, 100, -150);
	s5 = ShapeTransforms.rotatedCopyOf(s5,Math.PI/4);
	g2.setColor(new Color(0x8F00FF)); g2.draw(s5);
	
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Stars by Daniel Shu", 20,20);
    }
    
    
    /** Draw a picture with a few more Star and SheriffStar objects
     */
    public static void drawPicture2(Graphics2D g2) {

	Star s1 = new Star(25,50,20,200);
	Star s2 = new Star(400,300, 175, 600);
	SheriffStar ss1 = new SheriffStar(100,100,50,50);
	SheriffStar ss2 = new SheriffStar(700,500,300,300);
	
	
	g2.setColor(new Color(0xff6600));     g2.draw(s1);
	g2.setColor(new Color(0xff00ff));     g2.draw(s2);
	g2.setColor(new Color(0x00cc66));     g2.draw(ss1);
	g2.setColor(new Color(0x009933));     g2.draw(ss2);
	
	SheriffStar ss3 = new SheriffStar(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(ss3);
	
	Shape s3 = ShapeTransforms.scaledCopyOfLL(ss3,0.5,0.5);
	s3 = ShapeTransforms.translatedCopyOf(s3,50,200);
	s3 = ShapeTransforms.rotatedCopyOf(s3, Math.PI/6);
	g2.setColor(Color.BLACK); g2.draw(s3);

	
	s3 = ShapeTransforms.scaledCopyOfLL(s3,5,4);
	s3 = ShapeTransforms.translatedCopyOf(s3,300,-100);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x0000cc)); 
	g2.draw(s3); 
	
	
        SheriffStar ss4 = new SheriffStar(200,350,200,100);
	
	g2.draw(ss4);
	g2.setColor(new Color(0xFF0066)); 
	
	Shape s4 = ShapeTransforms.rotatedCopyOf(s1, Math.PI/4.0);
	s4 = ShapeTransforms.scaledCopyOfLL(s4,2,3);
	s4 = ShapeTransforms.translatedCopyOf(s4,300,200);
	
	g2.draw(s4);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Stars and SheriffStars by Daniel Shu", 20,20);
    }
    
    /** Draw a different picture with a stars and sheriff stars
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Stars and SheriffStars by Daniel Shu", 20,20);
	
	
	
        Star s1 = new Star(300,50,500,800);
	Star s2 = new Star(20,50,40,30);
	Shape s3 = ShapeTransforms.rotatedCopyOf(s1, Math.PI/2);
	s3 = ShapeTransforms.scaledCopyOfLL(s3, 0.5,0.25);
	s3 = ShapeTransforms.translatedCopyOf(s3, 600, 100);
	
	g2.setColor(new Color(0x663300));     g2.draw(s1);
	g2.setColor(Color.GREEN);             g2.draw(s2);
	g2.setColor(new Color(0xff3300));     g2.draw(s3);

	SheriffStar ss1 = new SheriffStar(700, 100, 150,150);
	g2.setColor(new Color(0x000ff));      g2.draw(ss1);

	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

	SheriffStar ss2 = new SheriffStar(700, 300, 200, 300);
	Shape s4 = ShapeTransforms.rotatedCopyOf(ss2, Math.PI/10);
	g2.setStroke(thick);
	g2.setColor(Color.RED);
	g2.draw(s4);

	Shape s5 = ShapeTransforms.scaledCopyOfLL(s2,4,4);
	s5 = ShapeTransforms.translatedCopyOf(s5,100,100);
	g2.setColor(new Color(0x33cc33));     g2.draw(s5);

	SheriffStar ss3 = new SheriffStar(300,850,100,75);
	Shape s6 = ShapeTransforms.scaledCopyOfLL(ss3,4,0.75);
	g2.setColor(new Color(0xff00cc));     g2.draw(s6);
    }       
}
