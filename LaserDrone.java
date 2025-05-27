import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class LaserDrone extends Actor {
    public void act() {
        
        Actor heroe = getOneIntersectingObject(Superheroe.class);
        if (heroe != null) {
            MundoJuego mundo = (MundoJuego) getWorld();
            mundo.getBarraVidas().perderVida();
            if (mundo.getBarraVidas().getVidas() == 0) {
                Greenfoot.playSound("gameOver.wav");
                getWorld().addObject(new GameOver(), getWorld().getWidth()/2, getWorld().getHeight()/2);
                Greenfoot.stop();
            }
            getWorld().removeObject(this);
            return;
        }        
        move(-7);
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
