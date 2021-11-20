import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BridgeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dunia2 extends World
{
    /**
     * Constructor for objects of class BridgeWorld.
     * 
     */
    public dunia2()
    {   
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setPaintOrder(PapanNyawa2.class, papanscore2.class,Mati.class,Anak.class,Nenek.class,serigala2.class,buah2.class,Jalanan2.class,Pohon2.class,Kelinci2.class,Background2.class);
        
        level2.scores = new papanscore2();
        addObject(level2.scores,486,50); 
        level2.scores.setScore(level2.score);
        
        level2.lives = new PapanNyawa2();
        addObject(level2.lives,85,54); 
        level2.lives.setLives(level2.nyawa);
        
        Nenek2 nenek = new Nenek2();
        addObject(nenek,485,159);
       
        prepare();
    }
    
    
    public void prepare(){
        
        Anak red = new Anak();
        addObject(red, 300, 363);
        red.setLocation(292, 359);
       
        
        red.setLocation(291, 360);
        red.setLocation(221, 349);
        removeObject(red);
        Anak red2 = new Anak();
        addObject(red2, 342, 347);
        red2.setLocation(297, 359);
        
        
        
    }
}
