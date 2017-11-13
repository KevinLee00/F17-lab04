package edu.ucsb.cs56.drawings.apolisetty.advanced;

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
 * @author Anu Polisetty
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    
    public static void drawPicture1(Graphics2D g2) {
    g2.setColor(Color.BLACK); 
	
	Watch w = new Watch(100, 100, 70, 40);
	Watch w2 = new Watch(300, 300, 100, 20);
	FancyWatch wCool = new FancyWatch(200, 150, 60, 30, 5);

	g2.draw(w);
	g2.draw(w2);
	g2.draw(wCool);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	g2.drawString("A few watches by Anu Polisetty", 20,20);
    
    }
    
  
    public static void drawPicture2(Graphics2D g2) {
	
	Watch bigFace = new Watch(400, 200, 100, 70);
	FancyWatch fancyBigFace = new FancyWatch(200, 200, 100, 70, 10);

	g2.draw(bigFace);
	g2.draw(fancyBigFace);

	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	g2.drawString("Watch Urself by Anu Polisetty", 20,20);
    }
    
   
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Not on my Watch by Anu Polisetty", 20,20);
	
	
	// Draw some watches


	Watch smalllWatch = new FancyWatch(40, 100, 20, 10, 2);
	Watch stubbyWatch = new Watch(0, 200, 50, 50);
	Watch longboi = new FancyWatch(100, 200, 100, 20, 5);


	g2.draw(smalllWatch);
	g2.draw(stubbyWatch);
	g2.draw(longboi);
	
	
	
    }       
}
