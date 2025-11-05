import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dx = 1;
    int dy = 1;
    int randNum = Greenfoot.getRandomNumber(2);
    boolean initialDirectionSet = false;
    int speed = 1;
    public void act()
    {
        // Add your action code here.
        
        if (!initialDirectionSet)
        {
            if (randNum == 0)
            {
                dx = -speed;
            }else
            {
                dx = speed;
            }
            
            randNum = Greenfoot.getRandomNumber(2);
            
            if (randNum == 0)
            {
                dy = -speed;
            }else
            {
                dy = speed;
            }
            
            initialDirectionSet = true;
        }
       
        if (isAtEdge())
        {
            randNum = Greenfoot.getRandomNumber(2);
             if (randNum == 0)
            {
                speed++;
                if (dx < 0)
                {
                    dx = -speed;
                }else
                {
                    dx = speed;
                }
                dx = -dx;
            }else
            {
                speed++;
                if (dy < 0)
                {
                    dy = -speed;
                }else
                {
                    dy = speed;
                }
                dy = -dy;
            }
           
        }
        
        setLocation(getX() + dx, getY() + dy);
        
        if (isTouching(Hero.class))
        {
            Explosion boom = new Explosion();
            getWorld().addObject(boom, getX(), getY());
            getWorld().removeObject(this);
            
        }
    }
}
