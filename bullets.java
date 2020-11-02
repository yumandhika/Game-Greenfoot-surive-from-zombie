import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullets extends Actor
{
    public int speed = 10;
    public bullets(int rotation)
    {
        setRotation(rotation);
    
    }
    /**
     * Act - do whatever the bullets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(speed);
        remove();
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
    else if(getOneIntersectingObject(tembok1.class)!=null){
     getWorld().removeObject(this);
    }
    else if(getOneIntersectingObject(tembok2.class)!=null){
    getWorld().removeObject(this);
    }
    else if(getOneIntersectingObject(tembok3.class)!=null){
     getWorld().removeObject(this);
    }
    else if(getOneIntersectingObject(tembok4.class)!=null){
     getWorld().removeObject(this);
    }
    else if(getOneIntersectingObject(tembok5.class)!=null){
    getWorld().removeObject(this);
    }
    else if(getOneIntersectingObject(tembok7.class)!=null){
    getWorld().removeObject(this);
    }else if(getOneIntersectingObject(tembok6.class)!=null){
    getWorld().removeObject(this);
    }else if(getOneIntersectingObject(tembok9.class)!=null){
    getWorld().removeObject(this);
    }
    }
}
