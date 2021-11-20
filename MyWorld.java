import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int count = 0;
    static int nyawa = 3;
    static int score = 0;
    static PapanScore scores = null;
    static PapanNyawa lives = null;
    Red red = new Red();
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setPaintOrder(PapanNyawa.class, PapanScore.class,Mati.class,Red.class,Serigala.class,Buah.class,Jalanan.class,Pohon.class,Kelinci.class,Background.class);
        
        scores = new PapanScore();
        addObject(scores,486,50); 
        scores.setScore(0);
        
        lives = new PapanNyawa();
        addObject(lives,85,54); 
        lives.setLives(nyawa);
        
        prepare();
    }
    
    public void act(){

        count++;
        
        if (score < 20){
            if (count==80) {
                summonRed();
                summonBuah();
                count=0;
           }
        }
        
        if (score == 10) {
           Greenfoot.setWorld(new dunia());
        }
    }
    
    private void prepare()
    {

        //Jalanan jalanan = new Jalanan();
        //addObject(jalanan, 290, 37);
        //Jalanan jalanan2 = new Jalanan();
        //addObject(jalanan2, 298, 114);
        //jalanan2.setLocation(290, 106);
        //Jalanan jalanan3 = new Jalanan();
        //addObject(jalanan3, 295, 199);
        //jalanan3.setLocation(290, 179);
        //Jalanan jalanan4 = new Jalanan();
        //addObject(jalanan4, 300, 252);
        //jalanan4.setLocation(291, 248);
        //Jalanan jalanan5 = new Jalanan();
        //addObject(jalanan5, 348, 306);
        //jalanan5.setLocation(292, 315);
        //Jalanan jalanan6 = new Jalanan();
        //addObject(jalanan6, 298, 389);
        //jalanan6.setLocation(293, 380);
        //jalanan.setLocation(289, 25);
        //jalanan2.setLocation(289, 76);
        //Jalanan jalanan7 = new Jalanan();
        //addObject(jalanan7, 364, 159);
        //jalanan5.setLocation(293, 330);
        //jalanan4.setLocation(293, 281);
        //jalanan3.setLocation(293, 231);
        //jalanan2.setLocation(289, 75);
        //jalanan7.setLocation(289, 125);
        //Jalanan jalanan8 = new Jalanan();
        //addObject(jalanan8, 295, 183);
        //jalanan8.setLocation(289, 174);
        //jalanan3.setLocation(288, 224);
        //jalanan3.setLocation(289, 224);
        //jalanan4.setLocation(289, 274);
        //jalanan5.setLocation(288, 323);
        //jalanan5.setLocation(289, 324);
        //jalanan6.setLocation(289, 374);
        Pohon pohon = new Pohon();
        addObject(pohon, 443, 86);
        Pohon pohon2 = new Pohon();
        addObject(pohon2, 521, 245);
        Pohon pohon3 = new Pohon();
        addObject(pohon3, 106, 123);
        Pohon pohon4 = new Pohon();
        addObject(pohon4, 153, 231);
        Pohon pohon5 = new Pohon();
        addObject(pohon5, 68, 351);
        Pohon pohon6 = new Pohon();
        addObject(pohon6, 389, 200);
        Pohon pohon7 = new Pohon();
        addObject(pohon7, 507, 356);
        Pohon pohon8 = new Pohon();
        addObject(pohon8, 32, 45);
        addObject(red, 300, 363);
        red.setLocation(292, 359);
        Pohon pohon9 = new Pohon();
        addObject(pohon9, 567, 53);
        Serigala serigala = new Serigala();
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
        Red red2 = new Red();
        addObject(red2, 342, 347);
        red2.setLocation(297, 359);
        pohon6.setLocation(531, 164);

        Kelinci kelinci = new Kelinci();
        addObject(kelinci, 450, 162);
        Kelinci kelinci2 = new Kelinci();
        addObject(kelinci2, 42, 209);
        Kelinci kelinci3 = new Kelinci();
        addObject(kelinci3, 151, 378);
        act();
        pohon4.setLocation(177,211);
        removeObject(pohon4);
        pohon3.setLocation(95,166);
        kelinci2.setLocation(62,213);
        pohon5.setLocation(43,312);
        kelinci3.setLocation(121,371);
        removeObject(pohon6);
        pohon2.setLocation(558,191);
        pohon9.setLocation(516,83);
        pohon.setLocation(385,199);
        pohon.setLocation(352,171);
        removeObject(pohon);
        pohon7.setLocation(490,315);
        kelinci.setLocation(491,146);
        serigala.setLocation(181,95);
        pohon5.act();
        pohon5.setLocation(39,314);
        pohon3.setLocation(102,174);
        pohon8.setLocation(34,48);
        pohon5.setLocation(44,314);
        pohon7.setLocation(491,317);
        pohon9.setLocation(485,61);
        kelinci.setLocation(485,159);
        pohon2.setLocation(556,177);
        pohon7.setLocation(500,314);
    }
    
    public void summonRed(){
           addObject(new Serigala(),Greenfoot.getRandomNumber(380)+100,0);
    }
        
    public void summonBuah(){
            addObject(new Buah(),Greenfoot.getRandomNumber(380)+100,0);
    }
    
    public void die(){
        addObject(red,300, 363);
    }
    
}