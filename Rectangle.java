import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * class Rectangle is a subclass of class 
 * Shape.This class consists of methods 
 * that are utilized to create a rectangle
 * shape. This class consists of:
 * Accessor methods
 * Mutator methods
 * Constructor
 * Method to determine the area of a rectangle 
 * Method to draw a rectangle 
 *
 * @author (Sambhavi Pandey)
 * @version (Last modified May 3,2018)
 */
public class Rectangle extends Shape
{
    //Declaring instance variables 
    private int width;
    private int length;
    private Color col;
    
    /**
     * Constructor that takes four int values
     * and one value of type Color. 
     * This constructor calls the 
     * superclass constructor(from Shape class)
     * and also sets the width, length, and color. 
     *
     * @param x
     * @param y
     * @param width
     * @param length
     * @param color
     */
    public Rectangle(int x, int y, int width, int length, Color color) 
    {
        super(x, y); 
        setWidth(width);
        setLength(length);
        setColor(color);
    }

    /**
     * setColor method takes one parameter 
     * of type Color. The purpose of this 
     * method is to set the color of the 
     * rectangle.
     * 
     * @param c
     */
    public void setColor(Color c)
    {
        col = c;
    }

    /**
     * setLength method takes one parameter 
     * of type int. The purpose of this 
     * method is to set the length of the 
     * rectangle. 
     * 
     * @param l
     */
    public void setLength(int l)
    {
        length = l;
    }
    
    /**
     * setWidth method takes one parameter 
     * of type int. The purpose of this 
     * method is to set the width of the 
     * rectangle. 
     * 
     * @param w
     */
    public void setWidth(int w)
    {
        width = w;
    }

    /**
     * getLength method returns a value of type 
     * int. The purpose of this method 
     * is to the return the length of the 
     * rectangle. 
     */
    public int getLength()
    {
        return length;
    }

    /**
     * getWidth methods a value of type 
     * int. The purpose of this method 
     * is to return the width of the 
     * rectangle.
     */
    public int getWidth()
    {
        return width;
    }

    /**
     * getArea method returns a double value.
     * The purpose of this method is to 
     * calculate the area of the rectangle. 
     */
    @Override
    public double getArea()
    { 
        return length * width;
    }
    
    /**
     * draw method takes an argument corresponding 
     * to the type Graphics. This method is utilized
     * to draw a rectangle.
     *
     * @param g
     */
    @Override
    public void draw(Graphics g) 
    {
        //Type casting into Graphics2D object 
        Graphics2D g2d = (Graphics2D) g;
        //Sets color of rectangle 
        g2d.setColor(col); 
        //Fills Rectangle 
        g2d.fillRect(getX(), getY(), getWidth(), getLength());
    }
}