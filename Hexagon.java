import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * class Hexagon is a subclass of the Shape class.
 * This class contains methods that are utilized to
 * create a hexagon shape. This class consists of:
 * Accessor methods
 * Mutator methods
 * Constructor
 * A method to determine the area of the hexagon 
 * A method to draw the hexagon 
 *
 * @author (Sambhavi Pandey)
 * @version (Last modified on May 3,2018)
 */
public class Hexagon extends Shape
{
    //Declaring instance variables
    private int sideLength;
    private Color col;

    /**
     * Constructor that takes three int values and a Color
     * value.This constructor calls the superclass constructor
     * (which is in the Shape class) and also sets
     * the value of the side length and the color. 
     * 
     * @param x
     * @param y
     * @param sl
     * @param c
     */
    public Hexagon(int x, int y, int sl, Color c)
    {
        super(x, y); 
        setSideLength(sl);
        setColor(c);
    }

    /**
     * setSideLength methods is a void method that 
     * takes a value of type int. The purpose 
     * of this method is to set the instance variable
     * value (sideLength) to the parameter value.
     *
     * @param sl
     */
    public void setSideLength(int sl)
    {
        sideLength = sl;
    }

    /**
     * getSideLength method returns a value of type 
     * int. The purpose of this method 
     * is to return the side length of the hexagon.
     */
    public int getSideLength()
    {
        return sideLength;
    }

    /**
     * setColor method takes a value 
     * of type Color. The purpose of this 
     * method is to set the color of the 
     * hexagon. This is done by putting the 
     * instance variable (col) equal to the 
     * value of the parameter.
     * 
     * @param c
     */
    public void setColor(Color c)
    {
        col = c;
    }

    /**
     * getArea method returns a double value.
     * The purpose of this method is to 
     * determine the area of the hexagon.
     */
    @Override
    public double getArea()
    {
        return ((((3) * (Math.sqrt(3)))/2) * (sideLength*sideLength));
    }

    /**
     * draw method takes an argument corresponding 
     * to the type Graphics. This method is utilized
     * to draw a hexagon.
     *
     * @param g
     */
    @Override
    public void draw(Graphics g) 
    {
        //Type casting into Graphics2D object
        Graphics2D g2d = (Graphics2D) g;
        //Array for x-values of the hexagon on coordinate 
        int[] x = {getX(), getX() + getSideLength(),
                   getX() + getSideLength() + (getSideLength()/2),
                   getX() + getSideLength(), getX(),
                   getX() - (getSideLength()/2)};
        //Array for y-values of the hexagon on coordinate
        int[] y = {getY(), getY(),getY() + getSideLength(),
                   getY() + (2 * getSideLength()),
                   getY() + (2 * getSideLength()),
                   getY() + getSideLength()};
        //Sets color of hexagon
        g2d.setColor(col); 
        //Fills hexagon (polygon with six sides)
        g2d.fillPolygon(x, y, 6); 
    }
}