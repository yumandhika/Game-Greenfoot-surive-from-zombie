import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
/**
 * Write a description of class zombiespawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class zombiespawner extends Actor
{
    /**
     * Act - do whatever the zombiespawner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int spawn = 0;
    private int time = 0;  
    private int count = 60;
    
    public void act() 
    {
        // Add your action code here.
        spawn();
        if(counter())  
            {
                spawn++;
                time++;  
                count = 60;  
            }  
        if(time == 5 || time == 60 ){
            getWorld().addObject(new car(),1100,600);
        }
        else if(time == 80){
            JOptionPane.showMessageDialog(null," Kalah :(","FINISHED",JOptionPane.INFORMATION_MESSAGE);
            Greenfoot.stop();
        }
        display();
    }    
    public void spawn()
    {
        if(Greenfoot.getRandomNumber(100) == 1)
        {
            getWorld().addObject(new zombie(),Greenfoot.getRandomNumber(getWorld().getWidth()),Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
    
    }
    private boolean counter()  
        {  
            if(count > 0)  
            {  
                count--;  
            }  
            return count == 0;  
        } 
    private void display()  
        {  
            setImage(new GreenfootImage("Time:  "+ time +" ", 25, Color.BLACK, Color.WHITE)); 
        }  
    public boolean isTimeUp()  
        {  
            return time == 0;  
        }  
}
