import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        GreenfootImage img = new GreenfootImage("gameOver.png");
        img.scale(500, 400);
        setImage(img);
        
    }
}
