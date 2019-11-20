import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * class AngelHalo is a subclass of the Shape class.
 * This class contains methods that are utilized 
 * to make a shape similar to an angel halo. 
 * This class consists of:
 * Constructors
 * Method to determine the area of the halo
 * Method to draw the halo
 * Accessor and Mutator methods
 *
 * @author (Sambhavi Pandey)
 * @version (Last modified May 3,2018)
 */
public class AngelHalo extends Shape
{
    //Declaring instance variables 
    private int radius;
    private Color color1 = Color.YELLOW;
    private Color color2 = Color.WHITE;

    /**
     * Constructor that takes three int values.
     * This constructor calls the superclass constructor
     * (which is in the Shape class) and also sets
     * the value of the radius.
     * 
     * @param x
     * @param y
     * @param r
     */
    public AngelHalo(int x, int y, int r)
    {
        super(x, y);
        this.setRadius(r);
    }

    /**
     * Constructor that takes three int values and
     * two values of type Color. This constructor calls 
     * the superclass constructor and also sets the 
     * value of the radius. This constructor
     * also puts the values of the instance variables color1 
     * and color2 equal to the values of the parameter.
     *
     * @param x
     * @param y
     * @param r
     * @param col1
     * @param col2
     */
    public AngelHalo(int x, int y, int r, Color col1, Color col2)
    {
        super(x, y);
        setRadius(r);
        color1 = col1;
        color2 = col2;
    }

    /**
     * setRadius methods is a void method that 
     * takes a value of type int. The purpose 
     * of this method is to set the instance variable
     * value (radius) to the parameter value.
     *
     * @param r
     */
    public void setRadius(int r)
    {
        radius = r;
    }
    
    /**
     * getRadius method returns a value of type 
     * int. The purpose of this method 
     * is to return the radius of the halo.
     */
    public int getRadius()
    {
        return radius;
    }
    
    /**
     * getArea method returns a double value.
     * The purpose of this method is to 
     * calculate the area of the angel halo.
     */
    @Override
    public double getArea()
    {
        return (Math.PI * ((radius * radius) - (radius/2 * radius/2)));
    }

    /**
     * draw method takes an argument corresponding 
     * to the type Graphics. This method is utilized
     * to draw the angel halo.
     *
     * @param g
     */
    @Override
    public void draw (Graphics g)
    {
        //Sets color of the outside of the halo
        g.setColor(color1);
        //Fills the outside of the halo 
        g.fillOval(getX(), getY(), radius, radius);
        
        //Sets color for the inside of the halo
        g.setColor(color2);
        //Fills the inside of the halo 
        g.fillOval((int) (getX() + 7.0), (int) (getY() + 7.0), 
                   radius/2, radius/2);
    }
}