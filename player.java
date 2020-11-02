import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    public int speed = 3;
    GreenfootImage player1 = new GreenfootImage("survivor1_stand.png");
    
    public int frame = 1;
    public int animationCounter = 0;
    
    public int mouseX,mouseY; 
    public int x,y;
    
    public int survivorRotation;
    
    public static int playerX,playerY;
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move();
        mouse();
        
        playerX=getX();
        playerY=getY();
        
        survivorRotation = getRotation();
        
        shoot();
      
        
        animationCounter = animationCounter +1;
        
        win();
        Lose();
    }   
    
    
    public void move(){
    if(Greenfoot.isKeyDown("up")){
        move(speed);
        colosion();
        if(animationCounter % 6 == 0)
        animate();
    }
     if(Greenfoot.isKeyDown("down")){
        move(-speed);
        colosion();
        if(animationCounter % 6 == 0)
        animate();
    }
    }
    
    public void animate(){
    if(frame == 1){
        setImage(player1);
        frame = 2;
     }
    else if(frame == 2){
        setImage(player1);
        frame = 2;
     } 
    }
    
    public void mouse(){
        
        if(Greenfoot.getMouseInfo() != null){
        
        
        mouseX = Greenfoot.getMouseInfo().getX();
        mouseY = Greenfoot.getMouseInfo().getY();
        turnTowards(mouseX,mouseY);
         
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
    x = getX();
    y = getY();
    }
    }
    
    public void shoot ()
    {
        if(Greenfoot.getMouseInfo() != null)
        {
            if(Greenfoot.getMouseInfo().getButton() == 1)
            getWorld().addObject(new bullets(survivorRotation),getX(),getY()); 
        
        }
    }
      public void win(){
    Actor win = getOneIntersectingObject(car.class);
    if(win !=null){
        JOptionPane.showMessageDialog(null,"=+=+=+=+= Berhasil =+=+=+=+=","FINISHED",JOptionPane.INFORMATION_MESSAGE);
        Greenfoot.stop();
    }
}
     public void Lose(){
    Actor lose = getOneIntersectingObject(zombie.class);
    if(lose !=null){
        JOptionPane.showMessageDialog(null," Kalah ","FINISHED",JOptionPane.INFORMATION_MESSAGE);
        Greenfoot.stop();
    }
}
}


