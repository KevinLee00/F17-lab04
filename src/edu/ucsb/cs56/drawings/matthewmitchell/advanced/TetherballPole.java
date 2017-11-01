package edu.ucsb.cs56.drawings.matthewmitchell.advanced;

import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D; 
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;



/**
   A TetherBall Pole
      
   @author Matthew Mitchell 
   @version for CS56, F17, UCSB
   
*/
public class TetherballPole extends Pole implements Shape
{
/** Constructor
 	Creates a pole with the constructor from superclass Pole
	then uses geometric forumlas to create and  attach a rope and a ball
	*/
    public TetherballPole(double x, double y, double width, double height)
    {
        // construct the basic house shell
        super(x,y,width,height);

        // get the GeneralPath that we are going to append stuff to
        GeneralPath gp = this.get();
	
	// create the rope that is attached to the pole
	Line2D.Double rope = 
		new Line2D.Double(x + width, y, x + 5 * width, y + 0.75 * height);

	// create the tetherball that attached to the rope
	// and the extra rope in order to fully reach the ball
	
	Line2D.Double xtraRope =
		new Line2D.Double(x + 5 * width, y + 0.75 * height,
			x + 5 * width + (Math.sqrt(2) / 2)*((Math.sqrt(0.02) * height) - 0.1 * height),
			y + 0.75 * height + (Math.sqrt(2) / 2)*((Math.sqrt(0.02) * height) - 0.1 * height));

	Ellipse2D.Double ball = new Ellipse2D.Double
		(x + 5 * width, y + 0.75 * height, 0.2 * height, 0.2 * height);

	gp.append(rope, false);
	gp.append(xtraRope, false);
	gp.append(ball, false);
    }
}
