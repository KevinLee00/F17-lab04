package edu.ucsb.cs56.drawings.jesmar.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a sock that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Jesmar Castillo
   @version for CS56, F17, UCSB
   
*/
public class Sock extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of top left corner of sock
       @param y y coord of top left corner of sock
       @param width width of the sock
       @param height height of the sock
    */
    public Sock(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double right = 0.75 * height;
	double top = 0.50 * width;
	double frontToe = height - right;
	double topToe = width - top;

        
        Line2D.Double leftSide = 
            new Line2D.Double(x, y,
			    x, y + height);
        
        Line2D.Double topSide = 
            new Line2D.Double (x, y,
                               x + top, y);
	
        Line2D.Double rightSide =
            new Line2D.Double (x + top, y,
                               x + top, y + right);

	Line2D.Double bottomSide =
            new Line2D.Double (x, y + height,
                               x + width, y + height);

	Line2D.Double toeTop =
            new Line2D.Double (x + top, y + right,
                               x + width, y + right);

	Line2D.Double toeFront =
            new Line2D.Double (x + width, y + right,
                               x + width, y + height);
	
        // put the whole sock together
	
        GeneralPath wholeSock = this.get();
        wholeSock.append(leftSide, false);
        wholeSock.append(topSide, false);
        wholeSock.append(rightSide, false);
	wholeSock.append(bottomSide, false);
	wholeSock.append(toeTop, false);
	wholeSock.append(toeFront, false);

    }
}

