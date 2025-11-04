import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author Arjun Rajagopal 
 * @version 11.04.2025
 */
public class Hero extends Actor
{
    int speed = 1;
    int dx = 0;
    int dy = 0;
    public void act()
    {
         if (Greenfoot.isKeyDown("w")){
            dx = 0;
            dy = -speed;
        }
        if (Greenfoot.isKeyDown("a")){
            dx = -speed;
            dy = 0;
        }
        if (Greenfoot.isKeyDown("s")){
            dx = 0;
            dy = speed;
        }
        if (Greenfoot.isKeyDown("d")){
            dx = speed;
            dy = 0;
        }
        
        if (Greenfoot.isKeyDown("up")){
            speed += 1;
        }
        if (Greenfoot.isKeyDown("down") && speed > 0){
            speed -= 1;
        }
        if (getX() > 550){
            setLocation(-200, getY());
        }
        if (getX() < 50){
            setLocation(350, getY());
        }
        if (getY() > 350){
            setLocation(getX(), 50);
        }
        if (getY() < 50){
            setLocation(getX(), 550);
        }
        
        
        
        setLocation(getX() + dx, getY() + dy);
    }
}
