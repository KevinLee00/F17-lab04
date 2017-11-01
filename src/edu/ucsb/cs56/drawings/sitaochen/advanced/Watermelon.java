package edu.ucsb.cs56.drawings.sitaochen.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes
import java.awt.geom.Arc2D;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A Watermelon (wrapper around a General Path, implements Shape)

   This provides an example of how you can start with the coordinates
   of a hard coded object, and end up with an object that can be
   drawn anywhere, with any width or height.   
      
   @author Sitao Chen
   @version for CS56, W16, UCSB
   
*/
public class Watermelon extends GeneralPathWrapper implements Shape
{   
    /**
     * Constructor for objects of class Watermelon
     */
    public Watermelon(double x, double y, double width, double height)
    {
	
        // Specify the upper left corner, and the 
        //  width and height of the original points used to 
        //  plot the *hard-coded* watermelon
       
        Shape watermelon = new Arc2D.Double(x, y, width, height*0.75, 0.0, 180.0, Arc2D.PIE);
        
               
        // now we put the whole thing together ino a single path.
       
        GeneralPath wholeWatermelon = this.get();
        wholeWatermelon.append(watermelon, false);
                
        // translate to the origin by subtracting the original upper left x and y
        // then translate to (x,y) by adding x and y
        
        //Shape s = ShapeTransforms.translatedCopyOf(wholeWatermelon, -ORIG_ULX + x, -ORIG_ULY + y);
 
	// scale to correct height and width
        //s =  ShapeTransforms.scaledCopyOf(s,
	//				  width/ORIG_WIDTH,
	//				  height/ORIG_HEIGHT) ;
	 
	// Use the GeneralPath constructor that takes a shape and returns
	// it as a general path to set our instance variable cup
        
	//this.set(new GeneralPath(s));
        
    }

}
