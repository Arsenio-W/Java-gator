import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FishWorld extends World
{
    private Label scoreBoard;
    private int score=1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public FishWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Fish fish = new Fish();
        addObject(fish,376,299);
        Crab crab = new Crab();
        addObject(crab,250,250);
        
        this.scoreBoard =new Label("Score: 0", 24);
        addObject(scoreBoard,400,100);
    }
    public void updateScore()
    {
        scoreBoard.setValue("Score: " +score);
        score++;
    }
}
