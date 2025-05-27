import greenfoot.*;

public class BarraVidas extends Actor {
    private int vidas = 3;
    private final int MAX_VIDAS = 3;

    public BarraVidas() {
        actualizarImagen();
    }

    public void perderVida() {
        if (vidas > 0) {
            vidas--;
            actualizarImagen();
        }
    }

    public int getVidas() {
        return vidas;
    }

    private void actualizarImagen() {
        GreenfootImage imagen = new GreenfootImage(120, 40); // Espacio suficiente para 3 corazones

        GreenfootImage corazonLleno = new GreenfootImage("corazon.png");
        GreenfootImage corazonVacio = new GreenfootImage("corazonVacio.png");

        corazonLleno.scale(30, 30);
        corazonVacio.scale(30, 30);

        for (int i = 0; i < MAX_VIDAS; i++) {
            if (i < vidas) {
                imagen.drawImage(corazonLleno, i * 35, 0);
            } else {
                imagen.drawImage(corazonVacio, i * 35, 0);
            }
        }

        setImage(imagen);
    }
}
