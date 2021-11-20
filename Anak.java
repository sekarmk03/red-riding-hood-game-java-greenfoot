import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Anak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Anak extends Levell2
{
    /**
     * Act - do whatever the Anak wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
    {
        // Add your action code here.
        int point = 0;
        Actor nenek = getOneIntersectingObject(Nenek2.class);
        
        control();
        
        if (nenek != null ){
           getWorld().removeObject(nenek);
           point = 1;
           Greenfoot.setWorld(new level3());
        }
        
    }
    
     
    public void control() {
        if (getX()>=100 && getX()<=480) {
               if (Greenfoot.isKeyDown("left")) {
                   move(-3); 
                }
               if (Greenfoot.isKeyDown("right")) {
                   move(3); 
               }
               if (Greenfoot.isKeyDown("up")) {
                   setLocation(getX(),getY()-2); 
               }
               if (Greenfoot.isKeyDown("down")) {
                   setLocation(getX(),getY()+2); 
               }
            }
            else if (getX()<100){
                if (Greenfoot.isKeyDown("right")) {
                   move(3); 
               }
               if (Greenfoot.isKeyDown("up")) {
                   setLocation(getX(),getY()-2); 
               }
               if (Greenfoot.isKeyDown("down")) {
                   setLocation(getX(),getY()+2); 
               }
            }
            else {
               if (Greenfoot.isKeyDown("left")) {
                   move(-3); 
               }
                if (Greenfoot.isKeyDown("up")) {
                   setLocation(getX(),getY()-2); 
               }
               if (Greenfoot.isKeyDown("down")) {
                   setLocation(getX(),getY()+2); 
               }
        }
    }
}
