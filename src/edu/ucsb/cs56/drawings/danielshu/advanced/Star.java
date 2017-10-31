package edu.ucsb.cs56.drawings.danielshu.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;


/**
   A vector drawing of Star that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Daniel Shu
   @version for CS56, F17, UCSB
   
*/

public class Star extends GeneralPathWrapper implements Shape{
    /**
       Constructor
       
       @param x x coord of top of star
       @param y y coord of top of star
       @param width width of the star
       @param height height of the star
    */
    public Star(double x, double y, double width, double height)
    {
	GeneralPath star = this.get();

	//Set coordinates of the 5 points
	//The coordinates of point1 is x,y
	
	double point2X = x + width/2;
	double point2Y = y + height;

	double point3X = x - width/2;
	double point3Y = y + height/3;

	double point4X = x + width/2;
	double point4Y = y + height/3;

	double point5X = x - width/2;
	double point5Y = y + height;

	star.moveTo(x,y);
	star.lineTo(point2X, point2Y);
	star.lineTo(point3X, point3Y);
	star.lineTo(point4X, point4Y);
	star.lineTo(point5X, point5Y);
	star.lineTo(x,y);
	


    }



}
