
/**
 * Write a description of class Picture1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Picture
{
    // instance variables - replace the example below with your own
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun2;
    private Person person;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // initialise instance variables
        
    }

    /** 
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();
        
        roof = new Triangle();
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        sun2 = new Circle();
        sun2.changeColor("yellow");
        sun2.moveHorizontal(130);
        sun2.moveVertical(-40);
        sun2.changeSize(80);
        sun2.makeVisible();
        
        person = new Person();
        person.moveHorizontal(220);
        person.moveVertical(20);
        person.makeVisible();
    }
    
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null) //only if it's painted already...
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun2.changeColor("black");  
    }
    
    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null) // only if it's painted already...
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun2.changeColor("yellow");
    }
    
    /**
     * Change this picture to draw with sunset
     */
    public void sunset()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();
        
        roof = new Triangle();
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        sun2 = new Circle();
        sun2.changeColor("yellow");
        sun2.moveHorizontal(100);
        sun2.moveVertical(-40);
        sun2.changeSize(80);
        sun2.makeVisible();
        sun2.slowMoveVertical(250);
        sun2.makeInvisible();
        
        person = new Person();
        person.moveHorizontal(220);
        person.moveVertical(20);
        person.makeVisible();
        person.slowMoveHorizontal(-250);
        
    }
}

