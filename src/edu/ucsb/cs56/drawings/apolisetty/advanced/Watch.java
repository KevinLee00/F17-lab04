package edu.ucsb.cs56.drawings.apolisetty.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a watch that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Anu Polisetty
   @version for CS56, W16, UCSB
   
*/
public class Watch extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of the upper left corner of watch face
       @param y y coord of upper left corner of watch face
       @param strapLength length of the strap
       @param faceRadius length of the face
    */
    public Watch(double x, double y, double strapLength, double faceRadius)
    {
	
       double strapWidth = faceRadius/2; //width of the strap
       double xStrap = x+ faceRadius/4; //where the x posiiton of the strap should start 
        
        // Make the watch face
        
        Ellipse2D.Double watchFace = 
            new Ellipse2D.Double(x, y , faceRadius, faceRadius);
	
        //make the top and bottom strap : width of the straps is the size of half of the face and centered
        
        Rectangle2D.Double topStrap = 
            new Rectangle2D.Double (x+(faceRadius/4), y-strapLength,
                               strapWidth, strapLength);

        Rectangle2D.Double bottomStrap = 
            new Rectangle2D.Double (x+(faceRadius/4), y+faceRadius,
                               strapWidth, strapLength );
	
    
	
        // put the whole watch together
	
        GeneralPath wholeWatch = this.get();
        wholeWatch.append(watchFace, false);
        wholeWatch.append(topStrap, false);
        wholeWatch.append(bottomStrap, false);    
    }
}
