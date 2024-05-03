package Herencia;

public class Rectangle extends Figura {
    float ancho;
    float alto;

    public Rectangle(float ancho, float alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public float getArea() {
        return ancho * alto;
    }

    public float getPerimetro() {
        return 2 * (ancho + alto);
    }
}
