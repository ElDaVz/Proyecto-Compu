    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    public class Drone extends Actor {
        private int contadorDisparo = 0;
        private int velocidad;
        public Drone(int velocidad) {
        this.velocidad = velocidad;
        GreenfootImage img = getImage();
        img.scale(50,70);
        setImage(img);
        }
        public void act() {
            mover();
            disparar();
        }
    
        private void mover() {
            setLocation(getX() - velocidad, getY());
            if (getX() < 0.1) {
                getWorld().removeObject(this);
        }
    }
    
        private void disparar() {
            contadorDisparo++;
            if (contadorDisparo == 90) {
                getWorld().addObject(new LaserDrone(), getX() - 20, getY());
                Greenfoot.playSound("laserDron.wav");
                contadorDisparo = 0;
            }
        }
    }
