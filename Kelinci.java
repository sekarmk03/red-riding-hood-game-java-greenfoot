import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kelinci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kelinci extends Level1
{
    /**
     * Act - do whatever the Kelinci wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(),getY()+4);
        if (isAtEdge()){
            setLocation(getX(),0);
        }
    }    
}
