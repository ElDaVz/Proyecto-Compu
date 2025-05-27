import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LaserHeroe extends Actor {
    public void act() {
        
        Actor enemigo = getOneIntersectingObject(Drone.class);
        if (enemigo != null) {
            getWorld().removeObject(enemigo);
            getWorld().removeObject(this);
            return;
        }

        
        move(10);
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
