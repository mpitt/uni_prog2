import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueCar extends Actor
{
    protected void addedToWorld()
    {
        GreenfootImage img = this.getImage();
        img.rotate(90);
        this.setImage(img);
    }
        
    /**
     * Act - do whatever the BlueCar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("up")) {
            move(4);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-4);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(2);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-2);
        }
        if (Greenfoot.isKeyDown("space")) {
            World world = getWorld();
        }
    }    
}
