import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BridgeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dunia extends World
{
    /**
     * Constructor for objects of class BridgeWorld.
     * 
     */
    public dunia()
    {   
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setPaintOrder(PapanNyawa.class, PapanScore.class,Mati.class,Red2.class,Nenek.class,Serigala.class,Buah.class,Jalanan2.class,Pohon2.class,Kelinci2.class,Background2.class);
        
        MyWorld.scores = new PapanScore();
        addObject(MyWorld.scores,486,50); 
        MyWorld.scores.setScore(MyWorld.score);
        
        MyWorld.lives = new PapanNyawa();
        addObject(MyWorld.lives,85,54); 
        MyWorld.lives.setLives(MyWorld.nyawa);
        
        Nenek nenek = new Nenek();
        addObject(nenek,485,159);
       
        prepare();
    }
    
    
    public void prepare(){
        /**
        Jalanan2 jalanan = new Jalanan2();
        addObject(jalanan, 290, 37);
        Jalanan2 jalanan2 = new Jalanan2();
        addObject(jalanan2, 298, 114);
        jalanan2.setLocation(290, 106);
        Jalanan2 jalanan3 = new Jalanan2();
        addObject(jalanan3, 295, 199);
        jalanan3.setLocation(290, 179);
        Jalanan2 jalanan4 = new Jalanan2();
        addObject(jalanan4, 300, 252);
        jalanan4.setLocation(291, 248);
        Jalanan2 jalanan5 = new Jalanan2();
        addObject(jalanan5, 348, 306);
        jalanan5.setLocation(292, 315);
        Jalanan2 jalanan6 = new Jalanan2();
        addObject(jalanan6, 298, 389);
        jalanan6.setLocation(293, 380);
        jalanan.setLocation(289, 25);
        jalanan2.setLocation(289, 76);
        Jalanan2 jalanan7 = new Jalanan2();
        addObject(jalanan7, 364, 159);
        jalanan5.setLocation(293, 330);
        jalanan4.setLocation(293, 281);
        jalanan3.setLocation(293, 231);
        jalanan2.setLocation(289, 75);
        jalanan7.setLocation(289, 125);
        Jalanan2 jalanan8 = new Jalanan2();
        addObject(jalanan8, 295, 183);
        jalanan8.setLocation(289, 174);
        jalanan3.setLocation(288, 224);
        jalanan3.setLocation(289, 224);
        jalanan4.setLocation(289, 274);
        jalanan5.setLocation(288, 323);
        jalanan5.setLocation(289, 324);
        jalanan6.setLocation(289, 374);
         */
        Pohon2 pohon = new Pohon2();
        addObject(pohon, 443, 86);
        Pohon2 pohon2 = new Pohon2();
        addObject(pohon2, 521, 245);
        Pohon2 pohon3 = new Pohon2();
        addObject(pohon3, 106, 123);
        Pohon2 pohon4 = new Pohon2();
        addObject(pohon4, 153, 231);
        Pohon2 pohon5 = new Pohon2();
        addObject(pohon5, 68, 351);
        Pohon2 pohon6 = new Pohon2();
        addObject(pohon6, 389, 200);
        Pohon2 pohon7 = new Pohon2();
        addObject(pohon7, 507, 356);
        Pohon2 pohon8 = new Pohon2();
        addObject(pohon8, 32, 45);
        Red2 red = new Red2();
        addObject(red, 300, 363);
        red.setLocation(292, 359);
        Pohon2 pohon9 = new Pohon2();
        addObject(pohon9, 567, 53);
        //jalanan8.setLocation(289, 175);
        //jalanan3.setLocation(289, 225);
        //jalanan4.setLocation(289, 275);
        red.setLocation(200, 358);
        //jalanan5.setLocation(289, 325);
        //jalanan6.setLocation(289, 375);
        red.setLocation(291, 360);
        red.setLocation(221, 349);
        removeObject(red);
        Red2 red2 = new Red2();
        addObject(red2, 342, 347);
        red2.setLocation(297, 359);
        pohon6.setLocation(531, 164);

        Kelinci2 kelinci = new Kelinci2();
        addObject(kelinci, 450, 162);
        Kelinci2 kelinci2 = new Kelinci2();
        addObject(kelinci2, 42, 209);
        Kelinci2 kelinci3 = new Kelinci2();
        addObject(kelinci3, 151, 378);
        //removeObject(pohon24);
        //pohon25.setLocation(98,180);
        //pohon26.setLocation(60,319);
        //removeObject(pohon22);
        //removeObject(pohon23);
        //pohon27.setLocation(489,181);
        //pohon28.setLocation(544,315);
        //pohon210.setLocation(551,70);
        //pohon210.setLocation(562,73);
        //nenek.setLocation(435,267);
    }
    
    public void stop(){
        stop();
    }
}
