import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        button_play button_play = new button_play();
        addObject(button_play,284,209);
        button_play.setLocation(292,198);
        button_google button_google = new button_google();
        addObject(button_google,94,313);
        button_google.setLocation(40,358);
        button_facebook button_facebook = new button_facebook();
        addObject(button_facebook,216,315);
        button_facebook.setLocation(115,356);
        button_play.setLocation(291,194);
        button_play.setLocation(294,197);
        button_play.setLocation(287,213);
        button_facebook.setLocation(560,37);
        button_play.setLocation(290,220);
        button_facebook.setLocation(110,356);
        button_google.setLocation(38,361);
        button_facebook.setLocation(112,363);
        button_play.setLocation(293,210);
        button_play.setLocation(300,210);
    }
}
