import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class buah4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class buah4 extends levell4
{
    /**
     * Act - do whatever the buah4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World world;
    public void act() 
    {
         setLocation(getX(),getY()+4);
         Actor anak = getOneIntersectingObject(anak4.class);
         world = getWorld();
         if (isAtEdge()) {
            world.removeObject(this);
         }
         if(anak != null){
            getWorld().removeObject(this);
            level4.score+=1;
            level4.scores.setScore(level4.score);
         }
    }    
}
