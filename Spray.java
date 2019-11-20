import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
/*
 * Class Spray
 * 
 * Not exactly the most obvious choice, 
 * and this has no getArea() implementation!
 * 
 * Author: Rob Nash
 * Modified by Sambhavi Pandey 
 * @version(Last modified May 3,2018)
 */

class Spray extends Shape 
{
    //Written by Rob Nash
    //Declaring instance variables 
    private final int RADIUS = 20;
    private final int DENSITY = 10;
    
    /**
     * Constructor that takes two int values
     * and calls the superclass constructor.
     *
     * @param a
     * @param b
     * 
     * Written by Rob Nash
     */
    public Spray( int a, int b )
    {
        super(a, b); 	
    }

    /**
     * draw method takes an argument corresponding 
     * to the type Graphics. This method is utilized
     * to draw a shape.
     *
     * Written by Rob Nash
     * @param g
     */
    public void draw(Graphics g) 
    {
        //Type casting into Graphics2D object
        Graphics2D g2d = (Graphics2D) g;
        //Declaring variables 
        final int x = getX();
        final int y = getY();
        //Setting color/paint of objects 
        g2d.setColor(Color.GREEN );
        g2d.setPaint(new GradientPaint( x, y, Color.GREEN, x
                     + RADIUS/4, y + RADIUS/4, Color.BLACK, true));
        //Declaring variables 
        int xOffset = 0;
        int yOffset = 0;
        //To draw
        for( int i = 0; i < DENSITY; i++) 
        {
            xOffset = (int) (Math.random()*RADIUS);
            yOffset = (int) (Math.random()*RADIUS);
            g2d.draw(new Ellipse2D.Double( x + xOffset,
                      y + yOffset, x + xOffset+3, y + yOffset+3) );
        }
    }
}