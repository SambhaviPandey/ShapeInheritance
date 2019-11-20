import java.awt.*;
/* Class Shape is the parent class of many subclasses 
 * such as class Triangle, Hexagon, AngelHalo, 
 * Rectangle, and Spray.
 *
 * By Rob Nash
 * 
 * Modified by Sambhavi Pandey
 * @version(Last modified May 3,2018)
 * 
 * This is the superclass in a hierarchy of shapes
 * that you have to construct.
 * The superclass in our inheritance hierarchy
 * all "common" features, functions and data should go here
 * for example, all shapes in Java2D have a x, y that 
 * declares their position and many of the shapes exposed have
 * a width and a height (but not all, so we didn't 
 * put width and height here) note that this class is mostly empty, 
 * as there is no algorithm generic enough to guess an arbitrary 
 * shape's area (future subclasses must override getArea() 
 * to provide something reasonable). also, the draw method is 
 * empty too, as we don't know what shape to draw here! 
 * (again, our subclasses will need to replace this method 
 * with one that actually draws things)
 */
class Shape extends Object 
{
    //Written by Rob Nash
    //Declaring instance variables 
    private int x = 0;
    private int y = 0;

    /**
     * No-argument constructor. 
     */
    public Shape()
    {
    }
    
    /**
     * Constructor that initializes and sets the
     * instance variable values to the parameter
     * values. 
     * 
     * Written by Rob Nash
     *
     * @param a 
     * @param b
     */
    public Shape( int a, int b )
    {
        x = a;
        y = b;
    }

    /**
     * getArea method returns a double value.
     * The purpose of this method is to 
     * calculate the area of a shape.
     * 
     * Written by Rob Nash
     */
    public double getArea()
    { 
        return -1;
    }

    /**
     * draw method takes an argument corresponding 
     * to the type Graphics. This method is utilized
     * to draw a shape.
     *
     * Written by Rob Nash
     * 
     * @param g
     */
    public void draw(Graphics g)
    {
        
    }

    /**
     * getX is a method that takes no arguments
     * and returns a value of type int. 
     * 
     * Written by Rob Nash
     */
    public int getX() 
    { 
        return x; 
    }

    /**
     * getY is a method that takes no arguments
     * and returns a value of type int. 
     * 
     * Written by Rob Nash
     */
    public int getY() 
    { 
        return y; 
    }

    /**
     * setX is a void method that takes 
     * an int argument. The purpose of this 
     * method is to set the value of the
     * instance variable (x) to the parameter 
     * value.
     *
     * @param x
     */
    public void setX(int x)
    {
        this.x = x;
    }

    /**
     * setY is a void method that takes 
     * an int argument. The purpose of this 
     * method is to set the value of the
     * instance variable (y) to the parameter 
     * value.
     *
     * @param y
     */
    public void setY(int y)
    {
        this.y = y;
    }
}