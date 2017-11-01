package edu.ucsb.cs56.drawings.ktan.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D; 


/**
   A Bear Face 
      
   @author Kindy Tan  
   @version for CS56, F17 , UCSB
   
*/
public class BearFace extends Bear implements Shape
{
	public BearFace(double x, double y, double R)
	{	
		//Construct bear head 
		super(x,y,R); 

		GeneralPath gp = this.get();

		//make the eyes 
		
		double eyeR = 0.1*R; 
		Ellipse2D.Double leye = new Ellipse2D.Double(x+0.25*R,y+0.25*R,eyeR,eyeR);
		
		Ellipse2D.Double reye = new Ellipse2D.Double(x+0.65*R,y+0.25*R,eyeR,eyeR);
		
		// make the mouth 
		double mouthR = 0.4*R; 
		Ellipse2D.Double mouth = new Ellipse2D.Double(x+0.3*R, y+0.55*R, mouthR, mouthR);
		Arc2D.Double crack = new Arc2D.Double(x+0.35*R, y+0.75*R, 0.3*R, 0.1*R, 180, 180, Arc2D.OPEN);
		//make the nose
		
		Ellipse2D.Double nose = new Ellipse2D.Double(x+0.4*R, y+0.6*R, 0.2*R, 0.2*R); 
			
		GeneralPath Face = this.get(); 
		Face.append(leye, false); 
		Face.append(reye, false); 
		Face.append(mouth, false); 
		Face.append(crack, false);
		Face.append(nose, false);
	
	}
}
