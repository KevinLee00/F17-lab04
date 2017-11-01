package edu.ucsb.cs56.drawings.sitaochen.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
/**
   A House
      
   @author Sitao Chen 
   @version for CS56, F17, UCSB
   
*/
public class WatermelonWithSeeds extends Watermelon implements Shape
{
    /**
     * Constructor for objects of class Watermelon
     */
    public WatermelonWithSeeds(double x, double y, double width, double height)
    {
	// construct the basic watermelon shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	
	double w = 0.0155 * width;
	
	Ellipse2D.Double win1 =
	    new Ellipse2D.Double(x+0.6*width, y+0.25*height, w, w);
	Ellipse2D.Double win2 =
	    new Ellipse2D.Double(x+0.45*width, y+0.25*height, w, w);
	Ellipse2D.Double win3 =
	    new Ellipse2D.Double(x+0.25*width, y+0.25*height, w, w);
	

	
        GeneralPath wholeWatermelon = this.get();
        wholeWatermelon.append(win1, false);
        wholeWatermelon.append(win2, false);
        wholeWatermelon.append(win3, false); 
    }    
}
