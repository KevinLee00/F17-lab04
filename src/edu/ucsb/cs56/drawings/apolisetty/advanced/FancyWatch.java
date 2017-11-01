package edu.ucsb.cs56.drawings.apolisetty.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

/**
   A House
      
   @author Anu Polisetty	 
   @version for CS56, W16, UCSB
   
*/
public class FancyWatch extends Watch implements Shape
{
    /**
     * Constructor for objects of class Fancy Watch
      @param x x coord of the upper left corner of watch face
       @param y y coord of upper left corner of watch face
       @param strapLength length of the strap
       @param faceRadius length of the face
       @param hWidth width of the holder strap
     */
    public FancyWatch(double x, double y, double strapLength, double faceRadius, double hWidth)
    {
	// construct the basic watch shell
	super(x,y,strapLength,faceRadius);
	double centerPositionX = x+faceRadius/2-1; // center of the watch, x coord
	double latchLevel = y -strapLength - 20;  // where the latch always is
	double xStrap = x+faceRadius/4; //where the strap always starts x coord
	

	//add the thing to put your watch strap in
	Rectangle2D.Double holder = new Rectangle2D.Double(xStrap, y -strapLength + strapLength/8, faceRadius/2, hWidth);
	
	//add the latch thing on the watch
	Rectangle2D.Double latch = new Rectangle2D.Double(xStrap, latchLevel , faceRadius/2, 20);
	Rectangle2D.Double latcher = new Rectangle2D.Double(centerPositionX, latchLevel , 2, 20);

	//add the holes that you put the latch in
	Ellipse2D.Double hole1 = new Ellipse2D.Double(centerPositionX, y + faceRadius + strapLength - strapLength/10 , 2, 2);
	Ellipse2D.Double hole2 = new Ellipse2D.Double(centerPositionX, y + faceRadius + strapLength - strapLength/5 , 2, 2);
	Ellipse2D.Double hole3 = new Ellipse2D.Double(centerPositionX, y + faceRadius + strapLength - 3*strapLength/10 , 2, 2);

	
		//add everything to fancy watch
        GeneralPath wholeWatch = this.get();
        wholeWatch.append(holder, false);
        wholeWatch.append(latch, false);
        wholeWatch.append(latcher, false); 
        wholeWatch.append(hole1, false); 
        wholeWatch.append(hole2, false); 
        wholeWatch.append(hole3, false); 
    }    
}
