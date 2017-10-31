package edu.ucsb.cs56.drawings.danielshu.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Ellipse2D;

/**
   A Sherrif's Star is a Star enclosed in a pentagon with circles at each point
      
   @author Daniel Shu
   @version for CS56, F17, UCSB
   
*/
public class SheriffStar extends Star implements Shape
{
    /**
     * Constructor for objects of class SheriffStar
       @param x x coord of top of SheriffStar
       @param y y coord of top of SheriffStar
       @param width width of the SheriffStar
       @param height height of the SheriffStar
     */
    public SheriffStar(double x, double y, double width, double height)
    {
	super(x,y,width,height);

	//Draw the outer pentagon
	GeneralPath outerPentagon = new GeneralPath();
	
	double point3X = x + width/2;
	double point3Y = y + height;

	double point5X = x - width/2;
	double point5Y = y + height/3;

	double point2X = x + width/2;
	double point2Y = y + height/3;

	double point4X = x - width/2;
	double point4Y = y + height;

	outerPentagon.moveTo(x,y);
	outerPentagon.lineTo(point2X, point2Y);
	outerPentagon.lineTo(point3X, point3Y);
	outerPentagon.lineTo(point4X, point4Y);
	outerPentagon.lineTo(point5X, point5Y);
	outerPentagon.lineTo(x,y);

	//Calculate the radius the circles at each starpoint
	double r = circleRadius(width, height);

	Ellipse2D.Double circle1 = new Ellipse2D.Double(x-r, y - 2*r, 2*r, 2*r);
	Ellipse2D.Double circle2 = new Ellipse2D.Double(point2X,point2Y - r, 2*r, 2*r);
	Ellipse2D.Double circle3 = new Ellipse2D.Double(point3X,point3Y - r, 2*r, 2*r);
	Ellipse2D.Double circle4 = new Ellipse2D.Double(point4X-2*r,point4Y-r, 2*r, 2*r);
	Ellipse2D.Double circle5 = new Ellipse2D.Double(point5X-2*r,point5Y-r, 2*r, 2*r);

	//Combine the pentagon and circles to the star
	GeneralPath wholeStar = this.get();
	wholeStar.append(outerPentagon,false);
	wholeStar.append(circle1,false);
	wholeStar.append(circle2,false);
	wholeStar.append(circle3,false);
	wholeStar.append(circle4,false);
	wholeStar.append(circle5,false);
    }

    /**
       Calculates the radius of the circle at the end of each SheriffStar based on if the width or the height is smaller.
       @param width width of SheriffStar
       @param height height of SheriffStar
    **/
    private double circleRadius(double width, double height){
	if(width < height){
	    return width/6;
	}
	else{
	    return height/6;
	}
    }
    
}
