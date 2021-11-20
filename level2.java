import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends World
{
    public int count = 0;
    static int nyawa = 3;
    static int score = 0;
    static papanscore2 scores = null;
    static PapanNyawa2 lives = null;
    anak2 red = new anak2();
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setPaintOrder(PapanNyawa2.class, papanscore2.class,Mati.class,anak2.class,serigala2.class,buah2.class,Jalanan.class,Pohon2.class,Kelinci2.class,Background.class);
        
        scores = new papanscore2();
        addObject(scores,486,50); 
        scores.setScore(0);
        
        lives = new PapanNyawa2();
        addObject(lives,85,54); 
        lives.setLives(nyawa);
        
        prepare();
    }
    
    public void act(){
        count++;
        
        if (score < 20){
            if (count==80) {
                summonAnak();
                summonbuah2();
                count=0;
           }
        }
        
        if (score == 20) {
           Greenfoot.setWorld(new dunia2());
        }
    }
    
    private void prepare()
    {
        /**
        Jalanan jalanan = new Jalanan();
        addObject(jalanan, 290, 37);
        Jalanan jalanan2 = new Jalanan();
        addObject(jalanan2, 298, 114);
        jalanan2.setLocation(290, 106);
        Jalanan jalanan3 = new Jalanan();
        addObject(jalanan3, 295, 199);
        jalanan3.setLocation(290, 179);
        Jalanan jalanan4 = new Jalanan();
        addObject(jalanan4, 300, 252);
        jalanan4.setLocation(291, 248);
        Jalanan jalanan5 = new Jalanan();
        addObject(jalanan5, 348, 306);
        jalanan5.setLocation(292, 315);
        Jalanan jalanan6 = new Jalanan();
        addObject(jalanan6, 298, 389);
        jalanan6.setLocation(293, 380);
        jalanan.setLocation(289, 25);
        jalanan2.setLocation(289, 76);
        Jalanan jalanan7 = new Jalanan();
        addObject(jalanan7, 364, 159);
        jalanan5.setLocation(293, 330);
        jalanan4.setLocation(293, 281);
        jalanan3.setLocation(293, 231);
        jalanan2.setLocation(289, 75);
        jalanan7.setLocation(289, 125);
        Jalanan jalanan8 = new Jalanan();
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
        addObject(red, 300, 363);
        red.setLocation(292, 359);
        Pohon2 pohon9 = new Pohon2();
        addObject(pohon9, 567, 53);
        serigala2 serigala = new serigala2();
        addObject(serigala, 143, 72);
        //jalanan8.setLocation(289, 175);
        //jalanan3.setLocation(289, 225);
        //jalanan4.setLocation(289, 275);
        red.setLocation(200, 358);
        //jalanan5.setLocation(289, 325);
        //jalanan6.setLocation(289, 375);
        red.setLocation(291, 360);
        red.setLocation(221, 349);
        removeObject(red);
        anak2 red2 = new anak2();
        addObject(red2, 342, 347);
        red2.setLocation(297, 359);
        pohon6.setLocation(531, 164);
        Kelinci2 kelinci = new Kelinci2();
        addObject(kelinci, 450, 162);
        Kelinci2 kelinci2 = new Kelinci2();
        addObject(kelinci2, 42, 209);
        Kelinci2 kelinci3 = new Kelinci2();
        addObject(kelinci3, 151, 378);
    }
    
    public void summonAnak(){
           addObject(new serigala2(),Greenfoot.getRandomNumber(380)+100,0);
    }
        
    public void summonbuah2(){
            addObject(new buah2(),Greenfoot.getRandomNumber(380)+100,0);
    }
    
    public void die(){
        addObject(red,300, 363);
    }
    
}

