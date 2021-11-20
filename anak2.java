import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class anak2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class anak2 extends Levell2
{
    /**
     * Act - do whatever the anak2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0;
    public void act() 
    {
       Greenfoot.playSound("happy.mp3");
       control();
       
       Actor musuh = getOneIntersectingObject(serigala2.class);
       if (musuh != null) {
           getWorld().removeObject(musuh);
           if (level2.nyawa == 0){
               Greenfoot.stop();
               getWorld().addObject(new Mati(),300,200);
           }else if (MyWorld.nyawa > 0){
               hancur();
               level2.nyawa -= 1;
               level2.lives.setLives(level2.nyawa);
           }
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
               if (Greenfoot.isKeyDown("space")) {
                   setLocation(getX(),getY()+3); 
               }
            }
            else if (getX()<100){
                if (Greenfoot.isKeyDown("right")) {
                   move(3); 
               }
               if (Greenfoot.isKeyDown("up")) {
                   setLocation(getX(),getY()-2); 
               }
               if (Greenfoot.isKeyDown("space")) {
                   setLocation(getX(),getY()+3); 
               }
            }
            else {
               if (Greenfoot.isKeyDown("left")) {
                   move(-3); 
               }
                if (Greenfoot.isKeyDown("up")) {
                   setLocation(getX(),getY()-2); 
               }
               if (Greenfoot.isKeyDown("space")) {
                   setLocation(getX(),getY()+3); 
               }
        }
    }
    
    private void hancur(){
        getWorld().addObject(new kebal2(), getX(), getY());
        getWorld().removeObject(this);
    }
}
