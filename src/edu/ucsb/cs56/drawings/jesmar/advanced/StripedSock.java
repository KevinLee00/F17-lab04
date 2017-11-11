package edu.ucsb.cs56.drawings.jesmar.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**
   A Sock
      
   @author Jesmar Castillo
   @version for CS56, F17, UCSB
   
*/
public class StripedSock extends Sock implements Shape
{
    /**
       Constructor

       @param x x coord of top left corner of sock
       @param y y coord of top left corner of sock
       @param width width of the sock
       @param height height of the sock
     */
    public StripedSock(double x, double y, double width, double height)
    {
	// construct the basic sock shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	double h = 0.10 * height;
	double stripeTop = y + 0.05 * height;
	double stripeHT = 0.15 * height;
	
	double w = 0.10 * width;
	double winTop = y + 0.5 * height;
	double winHt =  0.25 * height;
	
	Rectangle2D.Double stripe1 =
		new Rectangle2D.Double(x, stripeTop, 0.5 * width, stripeHT);
	Rectangle2D.Double stripe2 =
		new Rectangle2D.Double(x, stripeTop + 2.0 * h, 0.5 * width, stripeHT);
	Rectangle2D.Double stripe3 =
		new Rectangle2D.Double(x, stripeTop + 4.0 * h, 0.5 * width, stripeHT);
	
	// add the stripes to the sock
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholeSock = this.get();
        wholeSock.append(stripe1, false);
        wholeSock.append(stripe2, false);
        wholeSock.append(stripe3, false); 
    }    
}

