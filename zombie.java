import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class zombie extends Actor
{
    
    public int x,y;
    public int speed = 1;
    GreenfootImage zombie1 = new GreenfootImage("zoimbie1_hold.png");
    public int frame = 1;
    public int animationCounter = 0;
    /**
     * Act - do whatever the zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        animationCounter ++;
        followhuman();
        if(animationCounter % 6 == 0)
         animate();
         die();
    }   
    
    public void chasePlayer(){
    move(speed);
    colosion();
    }
    public void animate(){
    if(frame == 1){
        setImage(zombie1);
        frame = 2;
     }
    else if(frame == 2){
        setImage(zombie1);
        frame = 2;
     } 
    }
    public void colosion(){
    if(getOneIntersectingObject(tembok1.class)!=null){
    setLocation(x,y);
    }
    else if(getOneIntersectingObject(tembok2.class)!=null){
    setLocation(x,y);
    }
    else if(getOneIntersectingObject(tembok3.class)!=null){
    setLocation(x,y);
    }
    else if(getOneIntersectingObject(tembok4.class)!=null){
    setLocation(x,y);
    }
    else if(getOneIntersectingObject(tembok5.class)!=null){
    setLocation(x,y);
    }
    else if(getOneIntersectingObject(tembok7.class)!=null){
    setLocation(x,y);
    }else if(getOneIntersectingObject(tembok6.class)!=null){
    setLocation(x,y);
    }else if(getOneIntersectingObject(tembok9.class)!=null){
    setLocation(x,y);
    }
    else{
    x=getX();
    y=getY();
    }
    }
    public void moveAround(){
        move(1);
    if(Greenfoot.getRandomNumber(100)<10){
    turn(Greenfoot.getRandomNumber(90)-45);
    }
    if(getX()<=5 || getX() >= getWorld().getWidth()-5){
    turn(180);
    }
    if(getY()<=5 || getY() >= getWorld().getWidth()-5){
    turn(180);
    }
    
}
public void followhuman(){
    moveAround();
    colosion();
    int dist = 180;
    Actor closest = null;
        if(!getObjectsInRange(dist,player.class).isEmpty()){
        for(Object obj: getObjectsInRange(dist, player.class)){
            Actor guy = (Actor) obj;
            int guyDist = (int)Math.hypot(player.playerX-getX(),player.playerY-getY());
            if(closest == null || guyDist < dist){
            closest = guy;
            dist = guyDist;
            }
            turnTowards(closest.getX(),closest.getY());
        }
}
}
public void die(){
    Actor bullet = getOneIntersectingObject(bullets.class);
    if(bullet !=null){
    getWorld().removeObject(bullet);
    getWorld().removeObject(this);
    }
}
}
