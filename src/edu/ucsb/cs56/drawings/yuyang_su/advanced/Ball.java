package edu.ucsb.cs56.drawings.yuyang_su.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

public class Ball extends GeneralPathWrapper implements Shape
{   
    public Ball(double x, double y, double width, double height)
    {
	Ellipse2D.Double emptyCircle = new Ellipse2D.Double(x,y,width,height);
	GeneralPath soccerBall = this.get();
	soccerBall.append(emptyCircle,false);
    }

}
