package Polimorfisme.Interm_Expert;



// aqui estan el intermedio y el experto
abstract class Forma {
    public abstract void dibujar();
    public abstract double calcularÁrea();
}

class Círculo extends Forma {
    int radio;
    
    public Círculo(int radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Círculo");
    }

    @Override
    public double calcularÁrea() {
        return 3.14 * (radio * radio);
    }
}

class Cuadrado extends Forma {
    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Cuadrado");
    }

    @Override
    public double calcularÁrea() {
        return lado * lado;
    }
}

class Triángulo extends Forma {
    private double base;
    private double altura;

    public Triángulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Triángulo");
    }

    @Override
    public double calcularÁrea() {
        return (base * altura) / 2;
    }
}

class Rectángulo extends Forma {
    private double longitud;
    private double anchura;

    public Rectángulo(double longitud, double anchura) {
        this.longitud = longitud;
        this.anchura = anchura;
    }

    @Override
    public void dibujar() {
        System.out.println("Rectángulo");
    }

    @Override
    public double calcularÁrea() {
        return longitud * anchura;
    }
}
