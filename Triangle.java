import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * class Triangle is a subclass of 
 * class Shape. This class consists 
 * of methods that are utilized to 
 * create a triangle shape. 
 * This class consists of:
 * Accessor and mutator methods
 * Constructor
 * Method to determine the area of the triangle
 * Method to draw the triangle 
 *
 * @author (Sambhavi Pandey)
 * @version (Last modified May 3,2018)
 */
public class Triangle extends Shape
{
    //Declaring instance variables 
    private int base;
    private int height;
    private Color col;

    /**
     * Constructor that takes four int values
     * and one color value. This constructor 
     * calls the superclass constructor(from
     * the Shape class) and also sets the 
     * values of the base, height, and color.
     *
     * @param x
     * @param y
     * @param b
     * @param h
     * @param c
     */
    public Triangle(int x, int y, int b, int h, Color c)
    {
        super(x, y); 
        setBase(b);
        setHeight(h);
        setColor(c);
    }

    /**
     * setBase method takes one parameter
     * of type int. The purpose of this 
     * method is to set the value of the 
     * instance variable (base) to the 
     * value of the parameter. 
     * 
     * @param b
     */
    public void setBase(int b)
    {
        base = b;
    }

    /**
     * getBase method returns an int value.
     * The purpose of this method is to 
     * return the base of the triangle.
     */
    public int getBase()
    {
        return base;
    }
  
    /**
     * setHeight method takes one parameter
     * of type int. The purpose of this 
     * method is to set the value of the
     * instance variable (height) to the 
     * value of parameter h.
     * 
     * @param h
     */
    public void setHeight(int h)
    {
        height = h;
    }
    
    /**
     * getHeight method returns an int value.
     * The purpose of this method is to 
     * return the height of the triangle.
     */
    public int getHeight()
    {
        return height;
    }
    
    /**
     * setColor method takes one parameter
     * of type Color. The purpose of this 
     * method is to set the color of the 
     * triangle. 
     * 
     * @param c
     */
    public void setColor(Color c)
    {
        col = c;
    }

    /**
     * getArea method returns an int value.
     * The purpose of this method is to 
     * return the area of the triangle.
     */
    @Override
    public double getArea()
    {
        return ((1/2) * (base * height));
    }
    
    /**
     * draw method takes an argument corresponding 
     * to the type Graphics. This method is utilized
     * to draw a triangle. 
     *
     * @param g
     */
    @Override
    public void draw(Graphics g) 
    {
        //Type casting into Graphics2D object 
        Graphics2D g2d = (Graphics2D) g;
        //Array for x-values of the hexagon on a coordinate 
        int[] x = {getX(), (getX() + (getBase()/2)), 
                   getX() + getBase()};
        //Array for y-values of the hexagon on a coordinate 
        int[] y = {getY(), (getY() - getBase()), getY()};
        //Sets color of triangle 
        g2d.setColor(col); 
        //Fills triangle (polygon with three sides)
        g2d.fillPolygon(x,y,3); 
    }
}