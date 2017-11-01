package edu.ucsb.cs56.drawings.matthewmitchell.advanced;

import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a pole that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Matthew Mitchell
   @version for CS56, F17, UCSB
   
*/
public class Pole extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of pole
       @param y y coord of lower left corner of pole
       @param width width of the pole
       @param height of pole
    */
    public Pole(double x, double y, double width, double height)
    {
	// Simple pole creator
	
	Rectangle2D.Double pole = 
		new Rectangle2D.Double(x, y, width, height);

	GeneralPath wholePole = this.get();
	wholePole.append(pole,false);

    }
}
