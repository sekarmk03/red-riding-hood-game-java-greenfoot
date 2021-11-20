import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kebal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kebal2 extends Levell2
{
    /**
     * Act - do whatever the Kebal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int deathtimer = 0; 
    
    private GreenfootImage Red; 
    
    public kebal2() //creation code, sets two variables with the two images
    {
        Red = getImage(); 
    }

    public void act() 
    {
        deathtimer++;
        if (deathtimer > 40) {
            ((level2) getWorld()).die();
            getWorld().removeObject(this);
        } else {
            setImage(Red);
        }
        }
            
    }
