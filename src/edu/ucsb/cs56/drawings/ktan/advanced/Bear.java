package edu.ucsb.cs56.drawings.ktan.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D; 

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/** 
 * A bear head (one large circle, and two smaller ones on the top)
 *
 * 	@author Kindy Tan
 * 	@version for CS56, F17, UCSB
 * 	*/ 

public class Bear extends GeneralPathWrapper implements Shape
{
	public Bear(double x, double y, double R){
		
		final double kappa = 0.5522847498;
		/*
		GeneralPath head = new GeneralPath(); //make the circle for the head
		head.moveTo(x, y-R);
	
		head.curveTo(x+R*kappa, y-R, x+R, y-R*kappa, x+R, y);  //quad 1 
		head.curveTo(x+R, y+R*kappa, x+R*kappa, y+R, x, y+R ); //quad 3
		head.curveTo(x-R*kappa, y+R, x-R, y+R*kappa, x-R, y); //quad 4
		head.curveTo(x-R, y-R*kappa, x-R*kappa, y-R, x, y-R );
*/

		Ellipse2D.Double head = new Ellipse2D.Double(x,y,R,R); 


		//make the ears
		double height = R/2; 
	        double curve = 1/R;	
		Arc2D.Double left = new Arc2D.Double(x+height,y,R/2,R/2,335, 140, Arc2D.OPEN);	

		Arc2D.Double right = new Arc2D.Double(x,y,R/2,R/2, 205, -140, Arc2D.OPEN);	

		GeneralPath whole = this.get(); 
		
		whole.append(head, false); 
		whole.append(left, false);
		whole.append(right, false);
	//	Shape s = ShapeTransforms.translatedCopyOf(whole, x, y);

	//	this.set(new GeneralPath(s));
	}


}

