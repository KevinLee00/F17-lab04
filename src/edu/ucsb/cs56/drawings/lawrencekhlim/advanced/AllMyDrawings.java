package edu.ucsb.cs56.drawings.lawrencekhlim.advanced;

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
 * @author Phill Conrad
 * @author Lawrence Lim
 * @version for UCSB CS56, F17
 */

public class AllMyDrawings
{
    /** Draw a picture with a few Masterballs
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
        Masterball h1 = new Masterball(30,50,50);
        g2.setColor(Color.CYAN); g2.draw(h1);
	
        // Make a black house that's half the size,
        // and moved over 150 pixels in x direction
	
        Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
        h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
        g2.setColor(Color.BLACK); g2.draw(h2);
	
        // Here's a house that's 4x as big (2x the original)
        // and moved over 200 more pixels to right and 100 pixels down.
        h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
        h2 = ShapeTransforms.translatedCopyOf(h2,200,100);
	
        // We'll draw this with a thicker stroke
        Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	
        // for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
        // #002FA7 is "International Klein Blue" according to Wikipedia
        // In HTML we use #, but in Java (and C/C++) its 0x
	
        Stroke orig=g2.getStroke();
        g2.setStroke(thick);
        g2.setColor(new Color(0x002FA7));
        g2.draw(h2);
	
        // Draw two houses with Windows
	
        Masterball hw1 = new Masterball(50,200,40);
        Masterball hw2 = new Masterball(200,150,100);
	
        g2.draw(hw1);
        g2.setColor(new Color(0x8F00FF)); g2.draw(hw2);
	
        // @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
        g2.setStroke(orig);
        g2.setColor(Color.BLACK);
        g2.drawString("Masterballs by Lawrence Lim", 20,20);
    }
    
    
    /** Draw a picture with a few Pokeballs and Masterballs
     */
    public static void drawPicture2(Graphics2D g2) {
	

        Pokeball large = new Pokeball(120,50,100);
        Pokeball smallCC = new Pokeball(20,50,40);
        Masterball tallSkinny = new Masterball(20,250,50);
        Masterball shortFat = new Masterball(200,260,80);
	
        g2.setColor(Color.RED);     g2.draw(large);
        g2.setColor(Color.GREEN);   g2.draw(smallCC);
        g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
        g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
        Masterball hw2 = new Masterball(350,100,100);

        Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);
	
        g2.setColor(Color.RED);     g2.draw(hw3);
        
        Shape poke2 = ShapeTransforms.rotatedCopyOf (smallCC, Math.PI/-3.0);
        poke2 = ShapeTransforms.translatedCopyOf(poke2,400,310);
        
        g2.setColor(Color.BLACK);   g2.draw (poke2);
	
        // @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
        g2.setColor(Color.BLACK);
        g2.drawString("A bunch of Pokeballs and Masterballs by Lawrence Lim", 20,20);
    }
    
    /** Draw a different picture with a few Pokeballs
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
        // label the drawing
	
        g2.drawString("A bunch of Pokeballs by Lawrence Lim", 20,20);
	
	
        // Draw some coffee cups.
	
        Pokeball large = new Pokeball(100,50,150);
        Pokeball small = new Pokeball(20,50,40);
	
        g2.setColor(Color.RED);     g2.draw(large);
        g2.setColor(Color.GREEN);   g2.draw(small);
	
    }       
}
