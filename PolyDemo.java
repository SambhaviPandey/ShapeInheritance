import java.util.*;
import javax.swing.*;
import java.awt.*;
/*
 * Class PolyDemo (is a JFrame).
 * 
 * Author: Rob Nash
 * Modified by Sambhavi Pandey
 * @version(Last modified May 3,2018)
 */
class PolyDemo extends JFrame 
{
    /**
     * Written by: Rob Nash
     * No-argument constructor.
     */
    public PolyDemo() 
    {
        getContentPane().add( new PolyDemoPanel() );
        //just some windowing stuff that must happen for all Frames
        setSize( 300,300 );
        setVisible(true);
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    /**
     * Written by: Rob Nash
     * Main method conducts test. 
     * 
     * @param args
     */
    public static void main( String args[] ) 
    {
        PolyDemo myApp = new PolyDemo();
    }
    
    /*
     * Class PolyDemoPanel (is a JPanel). 
     * Author: Rob Nash
     * Modified by Sambhavi Pandey
     * @version(Last modified May 3,2018)
     */
    public class PolyDemoPanel extends JPanel 
    {     
        Shape[] myShapes= new Shape[20];
        public PolyDemoPanel() 
        {
            //Shape a = new Shape( getRandInt(), getRandInt());
            //Shape b = new Circle( getRandInt(), 
            //getRandInt(), getRandInt() );

            //a = new Square(getRandInt(), getRandInt(),
            //getRandInt(), getRandInt() );

            //a = getRandShape();

            //((Circle) b).getRadius();

            /*****************************************************
             * Code for populating our myShapes changes minimally 
             * when new classes are introduced 
             * (only in getRandShape())
             ***************************************************/
            for( int i = 0; i < 20; i++ ) 
            {
                myShapes[i] =  getRandShape();
            }
        }

        /********************************************************
         * Code for drawing our shapes doesn't change at all!
         * Since we intended to take advantage of polymorphism,
         * we coded this "in general" with respect to the 
         * superclass, and not specific to any subclass.
         *******************************************************/
        public void paint( Graphics g ) 
        {
            //required for GUI widgets to draw correctly
            super.paint(g); 
            /************************
             * Late Binding Demo
             ************************/
            for( int i = 0; i < myShapes.length; i++ ){
                myShapes[i].draw( g );  
            }   
        }

        /**
         * Written by Rob Nash.
         * Modified by Sambhavi Pandey.
         * 
         * getRandInt is a void method 
         * that returns an int value 
         * corresponding to a random int
         * number.
         */
        public int getRandInt() 
        {
            return ((int) (Math.random() * 400));   
        }

        /**
         * Written by Rob Nash.
         * Modified by Sambhavi Pandey.
         * 
         * getRandShape method is a method that 
         * returns a type Shape.
         */
        public Shape getRandShape() 
        {
            Shape retVal = null;
            final int x = getRandInt();
            final int y = getRandInt();
            /********************************
             * Polymorphic extensibility demo
             *
             *******************************/
            switch((int)(Math.random() * 5)) 
            {
                case 0:       retVal = new Rectangle( getRandInt(), 
                                       getRandInt(), getRandInt(), 
                                       getRandInt(),Color.LIGHT_GRAY);
                              break;
                              
                case 1:       retVal = new Triangle( getRandInt(), 
                                      getRandInt(), getRandInt(),
                                      getRandInt(), Color.RED);
                              break;
                             
                case 2:       retVal = new Spray( getRandInt(),
                                       getRandInt());
                              break;
                
                case 3:       retVal = new AngelHalo(getRandInt(),
                                       getRandInt(), 30);
                              break;

                case 4:       retVal = new Hexagon(getRandInt()/2, 
                                     getRandInt()/2, getRandInt()/2, 
                                     Color.PINK);
                              break;
            }
            return retVal;
        }
    }   
}