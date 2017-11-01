package edu.ucsb.cs56.drawings.lawrencekhlim.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

/**
   A Masterball
      
   @author Lawrence Lim
   @version for CS56, F17, UCSB
   
*/
public class Masterball extends Pokeball implements Shape
{
    /**
     * Constructor for objects of class Masterball
     */
    public Masterball(double x, double y, double radius)
    {
        // construct the basic house shell
        super(x,y,radius);
	
        // get the GeneralPath that we are going to append stuff to
        GeneralPath gp = this.get();
        
        double letterHeight = radius/5;
        double letterWidth = radius/3.5;
        
        double letterTopX = x + radius;
        double letterTopY = y + radius/3.25;
        
        Line2D.Double middleLeftLine = new Line2D.Double (letterTopX, letterTopY + letterHeight, letterTopX-letterWidth/4, letterTopY);
        Line2D.Double middleRightLine = new Line2D.Double (letterTopX, letterTopY + letterHeight, letterTopX+letterWidth/4, letterTopY);
        Line2D.Double leftMostLine = new Line2D.Double (letterTopX-letterWidth/4, letterTopY, letterTopX-letterWidth/2, letterTopY + letterHeight);
        Line2D.Double rightMostLine = new Line2D.Double (letterTopX+letterWidth/4, letterTopY, letterTopX+letterWidth/2, letterTopY + letterHeight);

        
        //double topArcY = y + radius/6;
        //double bottomArcY = y + radius/2;
        //double leftTopArcX = x + radius * Math.sin ( Math.atan ( (topArcY-y)/radius ));
        //double leftBottomArcX = x + radius * Math.sin ( Math.atan ( (bottomArcY-y)/radius ));
        
        //Arc2D.Double leftArc = new Arc2D.Double (leftBottomArcX, topArcY, leftTopArcX-leftBottomArcX, bottomArcY-topArcY, 1.5 * Math.PI, 0, Arc2D.CHORD );
        
        //Ellipse2D.Double leftArc = new Ellipse2D.Double (leftBottomArcX, topArcY, leftTopArcX-leftBottomArcX, bottomArcY-topArcY);
        
        GeneralPath masterball = this.get();
        masterball.append(middleLeftLine, false);
        masterball.append(middleRightLine, false);
        masterball.append(leftMostLine, false);
        masterball.append(rightMostLine, false);
        //masterball.append(leftArc, false);
    }    
}
