import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Superheroe extends Actor {
    private int contadorDisparo = 0;
    
    public Superheroe(){
    GreenfootImage img = getImage();
    img.scale(100,100);
    setImage(img);
    }
    public void act() {
        mover();
        disparar();
        colisionConDrone();
        contadorDisparo++;
    }

    private void mover() {
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 5);
        } else if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 5);
        }
    }

    private void disparar() {
        if (Greenfoot.isKeyDown("space") && contadorDisparo > 20) {
            getWorld().addObject(new LaserHeroe(), getX() + 40, getY());
            Greenfoot.playSound("laser.wav");
            contadorDisparo = 0;
        }
    }
    
    private void colisionConDrone() {
        Actor drone = getOneIntersectingObject(Drone.class);
        if (drone != null) {
            MundoJuego mundo = (MundoJuego) getWorld();
            mundo.getBarraVidas().perderVida();
            getWorld().removeObject(drone);
            if (mundo.getBarraVidas().getVidas()==0) {
                Greenfoot.playSound("gameOver.wav");
                getWorld().addObject(new GameOver(), getWorld().getWidth()/2, getWorld().getHeight()/2);
                Greenfoot.stop();
            }
        }
    }
}
