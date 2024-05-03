package Polimorfisme.Avançat;

interface Animal {
    void hablar();
}


class Perro implements Animal {
    public void hablar() {
        System.out.println("El perro ladra.");
    }
}


class Gato implements Animal {
    public void hablar() {
        System.out.println("El gato maulla.");
    }
}


class Pajaro implements Animal {
    public void hablar() {
        System.out.println("El pájaro canta.");
    }



    public static void main(String[] args) {
        Animal perro = new Perro();
        Animal gato = new Gato();
        Animal pajaro = new Pajaro();
        
        perro.hablar();
        gato.hablar();
        pajaro.hablar();
    }
}