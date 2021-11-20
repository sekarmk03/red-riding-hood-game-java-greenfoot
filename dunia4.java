import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BridgeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dunia4 extends World
{
    /**
     * Constructor for objects of class BridgeWorld.
     * 
     */
    public dunia4()
    {   
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setPaintOrder(PapanNyawa4.class, papanscore4.class,Mati.class,red4.class,nenek4.class,serigala4.class,buah4.class,Jalanan2.class,pohon4.class,kelinci4.class,Background2.class);
        
        level4.scores = new papanscore4();
        addObject(level4.scores,486,50); 
        level4.scores.setScore(level4.score);
        
        level4.lives = new PapanNyawa4();
        addObject(level4.lives,85,54); 
        level4.lives.setLives(level4.nyawa);
        
        nenek4 nenek = new nenek4();
        addObject(nenek,485,159);
       
        prepare();
    }
    
    
    public void prepare(){
        
        
        red4 red = new red4();
        addObject(red, 300, 363);
        red.setLocation(292, 359);
       
        
        red.setLocation(291, 360);
        red.setLocation(221, 349);
        removeObject(red);
        red4 red2 = new red4();
        addObject(red2, 342, 347);
        red2.setLocation(297, 359);
        
        
        
    }
}

