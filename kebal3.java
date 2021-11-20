import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kebal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kebal3 extends Levell3
{
    /**
     * Act - do whatever the Kebal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int deathtimer = 0; 
    
    private GreenfootImage Red; 
    
    public kebal3() //creation code, sets two variables with the two images
    {
        Red = getImage(); 
    }

    public void act() 
    {
        deathtimer++;
        if (deathtimer > 40) {
            ((level3) getWorld()).die();
            getWorld().removeObject(this);
        } else {
            setImage(Red);
        }
        }
            
    }
