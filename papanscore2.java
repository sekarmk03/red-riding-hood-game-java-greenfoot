import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class PapanScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class papanscore2 extends Levell2
{
    /**
     * Act - do whatever the PapanScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public papanscore2() 
    {
        // Add your action code here.
        GreenfootImage skor = new GreenfootImage(200,100);
        setImage(skor);
        
    }    
    
    public void setScore( int score ){
        GreenfootImage skor = getImage();
        skor.clear();
        skor.setFont(skor.getFont().deriveFont(40f));
        skor.setColor(Color.WHITE);
        skor.drawString("Score :" + score,30,30);
        setImage(skor);
    }
}
