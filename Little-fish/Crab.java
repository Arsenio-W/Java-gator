import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Animal
{
    public Crab() {
        getImage().scale(100, 100);
    }
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        checkKeyboard();
        hitFish();
        
    }
    public void checkKeyboard()
    {
        boolean key=Greenfoot.isKeyDown("right");
            if (key==true)
            {
                turnTowards(getX()+6,getY());
                setLocation(getX()+6,getY());
            }
            key=Greenfoot.isKeyDown("left");
            if (key==true)
            {
                turnTowards(getX()-6,getY());
                setLocation(getX()-6,getY());
            }
            key=Greenfoot.isKeyDown("down");
            if (key==true)
            {
                turnTowards(getX(),getY()+6);
                setLocation(getX(),getY()+6);
            }
            key=Greenfoot.isKeyDown("up");
            if (key==true)
            {
                turnTowards(getX(),getY()-6);
                setLocation(getX(),getY()-6);
            }
    }
    public void hitFish(){
        Actor fish = getOneIntersectingObject(Fish.class);
            if(fish != null){
                getWorld().removeObject(fish);
                FishWorld myWorld = (FishWorld) getWorld();
                myWorld.updateScore();
            }
    }
}
