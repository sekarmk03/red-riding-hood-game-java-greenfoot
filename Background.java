import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends Bg
{
    /**
     * Act - do whatever the Background wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
          setLocation(getX(),getY()+4);
        if (isAtEdge()){
            setLocation(getX(),0);
        }
    }    
}
