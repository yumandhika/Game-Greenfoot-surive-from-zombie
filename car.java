import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car extends Actor
{
    
   int speed = 2;
    /**
     * Act - do whatever the car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){ 
    
        // Add your action code here.
       setLocation(getX(),getY()-speed);
 
    }    
    public void remove(){
    if(getX()>=getWorld().getWidth()-1){
        getWorld().removeObject(this);
    }
    else if(getX()<1){
        getWorld().removeObject(this);
    }
    else if(getY()>=getWorld().getHeight()-1){
        getWorld().removeObject(this);
    }
    else if(getY()<1){
        getWorld().removeObject(this);
    } 
     }
  
}
