import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class buah3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class buah3 extends Levell3
{
    /**
     * Act - do whatever the buah3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World world;
    public void act() 
    {
         setLocation(getX(),getY()+4);
         Actor anak = getOneIntersectingObject(anak3.class);
         world = getWorld();
         if (isAtEdge()) {
             world.removeObject(this);
         }
         if(anak != null){
            getWorld().removeObject(this);
            level3.score+=1;
            level3.scores.setScore(level3.score);
         }
    }    
}
