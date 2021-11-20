import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buah extends Level1
{
    /**
     * Act - do whatever the Buah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World world;
    public void act() 
    {
         setLocation(getX(),getY()+4);
         Actor anak = getOneIntersectingObject(Red.class);
         world = getWorld();
         if (isAtEdge()) {
            world.removeObject(this);
         }
         if(anak != null){
            getWorld().removeObject(this);
            MyWorld.score+=1;
            MyWorld.scores.setScore(MyWorld.score);
         }
    }    
}
