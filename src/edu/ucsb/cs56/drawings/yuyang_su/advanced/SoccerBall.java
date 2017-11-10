package edu.ucsb.cs56.drawings.yuyang_su.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Line2D;

public class SoccerBall extends Ball implements Shape
{
    
    public SoccerBall(double x, double y, double width, double height)
    {
	super(x,y,width,height);
	final double pi = 3.14159265359;
	double radiusWidth = width/2;
	double radiusHeight = height/2;
	//double centerToSide = radius * .125;
	double xLeft =  x - width*.111 + radiusWidth;
	double xRight = x + width*.111 + radiusWidth;
	double yStart = y - height*.111 + radiusHeight; 
	double yEnd = y + height*.111 + radiusHeight;
	
	double xRemainderLeft =xLeft-width/2+ width*.111*Math.sqrt(2);
	double yRemainderLeft =yStart - height*.111;
	double xRemainderRight = xRight + width/2 - width*.111*Math.sqrt(2);	
	double yRemainderBotLeft = yEnd + height*.111; 
	double xRemainderBotLeft = xRight + width/2 - width*.111*Math.sqrt(2);
	double xRemainderBotRight = xLeft - width/2 +  width*.111*Math.sqrt(2);
	
	double topRoof = y -  height*.222 + radiusWidth;
	double bottomRoof = y + height*.222+ radiusWidth;
	
	Line2D.Double leftHex = new Line2D.Double(xLeft,yStart,xLeft,yEnd);
	Line2D.Double rightHex = new Line2D.Double(xRight,yStart,xRight,yEnd);	
	Line2D.Double leftTopSegment = new Line2D.Double(xLeft,yStart,xRemainderLeft,yRemainderLeft);
	Line2D.Double rightTopSegment = new Line2D.Double(xRight,yStart,xRemainderRight,yRemainderLeft);
	Line2D.Double botRightSegment = new Line2D.Double(xLeft,yEnd,xRemainderBotRight,yRemainderBotLeft);
	Line2D.Double botLeftSegment = new Line2D.Double(xRight,yEnd,xRemainderBotLeft, yRemainderBotLeft);
	Line2D.Double topRoofSegRight = new Line2D.Double(xRight,yStart, x+ width/2,topRoof);
	Line2D.Double topRoofSegLeft = new Line2D.Double(xLeft,yStart, x + width/2, topRoof);
	Line2D.Double botRoofSegRight = new Line2D.Double(xRight,yEnd,x + width/2, bottomRoof);
	Line2D.Double botRoofSegLeft = new Line2D.Double(xLeft,yEnd, x+width/2, bottomRoof);
	Line2D.Double middleSegTop = new Line2D.Double(x+width/2, topRoof, x+width/2, y );
	Line2D.Double middleSegBot = new Line2D.Double(x+width/2, bottomRoof, x+width/2, y+height );
	
	GeneralPath soccerBall = this.get();
	soccerBall.append(leftHex,false);
	soccerBall.append(rightHex,false);
	soccerBall.append(leftTopSegment,false);
	soccerBall.append(rightTopSegment,false);
	soccerBall.append(botLeftSegment,false);
	soccerBall.append(botRightSegment,false);
	soccerBall.append(topRoofSegRight,false);
	soccerBall.append(topRoofSegLeft,false);
	soccerBall.append(botRoofSegRight,false);
	soccerBall.append(botRoofSegLeft,false);
	soccerBall.append(middleSegTop,false);
	soccerBall.append(middleSegBot,false);
    }    
}
