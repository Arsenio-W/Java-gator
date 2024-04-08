import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Label myScoreBoard;
    private int score;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
    }
    public void eatKey() {
        myScoreBoard.setValue("Score : " + score);
        score++;
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Key key = new Key();
        addObject(key,400,200);
        Key key2 = new Key();
        addObject(key2,400,400);
        Key key3 = new Key();
        addObject(key3,400,600);
        Key key4 = new Key();
        addObject(key4,400,700);
        Box box = new Box();
        addObject(box,550,550);
        
        myScoreBoard = new Label("Score: 0",50);
        addObject(myScoreBoard,400,100);
    }
}
