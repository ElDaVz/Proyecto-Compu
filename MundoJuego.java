import greenfoot.*;

public class MundoJuego extends World {
    private int contador = 0;
    private BarraVidas barraVidas;
    private int velocidadDrones = 3;
    private int tiempoNivel = 0;
    public BarraVidas getBarraVidas() {
    return barraVidas;
    }
    public MundoJuego() {
        super(800, 600, 1);
        addObject(new Superheroe(), 100, getHeight() / 2);
        barraVidas = new BarraVidas();
        addObject(barraVidas,100, 50);
        setfondoEscalado();
    }
    private void setfondoEscalado(){
    GreenfootImage fondo = new GreenfootImage("Ciudad.jpg");
    fondo.scale(getWidth(), getHeight());
    setBackground(fondo);
    }

    public void act() {
        contador++;
        tiempoNivel++;
        
        if (contador > 90) {
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(new Drone(velocidadDrones), getWidth(), y);
            contador = 0;
        }
        if (tiempoNivel % 500==0){
            velocidadDrones++;
        }
    }
}
