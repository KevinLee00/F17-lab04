package edu.ucsb.cs56.drawings.lawrencekhlim.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a house that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Lawrence Lim
   @version for CS56, F17, UCSB
   
*/
public class Pokeball extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of upper left corner of pokeball
       @param y y coord of uppper left corner of pokeball
       @param radius of the pokeball
    */
    public Pokeball(double x, double y, double radius)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, and radius.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double radiusOfSmallCircle = radius/3.25;
        
        Ellipse2D.Double outerCircle = new Ellipse2D.Double (x, y, radius*2, radius*2);
        
        Ellipse2D.Double innerCircle = new Ellipse2D.Double (x+radius-radiusOfSmallCircle, y+radius-radiusOfSmallCircle, radiusOfSmallCircle*2, radiusOfSmallCircle*2);
        
        
        Line2D.Double leftLine =
            new Line2D.Double (x, y + radius,
                               x + radius-radiusOfSmallCircle, y + radius);
	
        Line2D.Double rightLine =
            new Line2D.Double (x + radius+radiusOfSmallCircle, y + radius,
                               x + 2* radius, y + radius);
	
        // put the pokeball together
	
        GeneralPath pokeball = this.get();
        pokeball.append(outerCircle, false);
        pokeball.append(innerCircle, false);
        pokeball.append(rightLine, false);
        pokeball.append(leftLine, false);
    }
}
