import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author Arjun Rajagopal 
 * @version 11.04.2025
 */
public class Hero extends Actor
{
    int speed = 3;
    
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
        
        setLocation(getX() + dx, getY() + dy);
        
        if (isTouching(Explosion.class))
        {
            Skull death = new Skull();
            getWorld().addObject(death, getX(), getY());
            getWorld().removeObject(this);
            
        }
        
        
        
        
    }
}
