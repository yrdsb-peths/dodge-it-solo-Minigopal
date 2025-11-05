import greenfoot.*;

public class MyWorld extends World {
    int startingX = 0;
    int startingY = 0;
    int spawnPoint = Greenfoot.getRandomNumber(4);
        
    
        
    
    public MyWorld() {
        super(600, 400, 1);
        
        if (spawnPoint == 0)
        {
            startingX = 100;
            startingY = 100;
        }else if (spawnPoint == 1)
        {
            startingX = 500;
            startingY = 100;
        }else if (spawnPoint == 2)
        {
            startingX = 500;
            startingY = 300;
        }else if (spawnPoint == 3)
        {
            startingX = 100;
            startingY = 300;
        }
        
        Hero hero = new Hero();
        Bomb bomb = new Bomb();
        addObject(hero, startingX, startingY);
        addObject(bomb, 300, 200);
    }
}
