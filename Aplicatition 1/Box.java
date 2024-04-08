import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Box here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Box extends Actor
{
    /**
     * Act - do whatever the Box wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Box()
    {
        getImage().scale(50, 50);
    }
    
    public void act()
    {
        // Add your action code here.
        checkKeyboard();
        isHit();
    }
    public void isHit() {
         if(isTouching(Key.class))
         {
             removeTouching(Key.class);
             
             MyWorld w=(MyWorld)getWorld();
             Key myKey=new Key();
             w.eatKey();
             w.addObject(myKey,Greenfoot.getRandomNumber(600) + 100,Greenfoot.getRandomNumber(700));
             
         }
        }
        public void checkKeyboard() {
    boolean key=Greenfoot.isKeyDown("right");
        if (key==true)
        {
            setLocation(getX()+6,getY());
        }
        key=Greenfoot.isKeyDown("left");
        if (key==true)
        {
            setLocation(getX()-6,getY());
        }
        key=Greenfoot.isKeyDown("down");
        if (key==true)
        {
            setLocation(getX(),getY()+6);
        }
        key=Greenfoot.isKeyDown("up");
        if (key==true)
        {
            setLocation(getX(),getY()-6);
        }
    }
}

