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
   @version for CS56, F17, UCSB
   
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
        
               

       
        GeneralPath wholeWatermelon = this.get();
        wholeWatermelon.append(watermelon, false);
                
        
        
    }

}
