package herencia;

class Animal {
    // Atributos
    String nombre;
    int edad;

    // Contructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos
    public void hacerRuido() {
        System.out.println("Grrrrr");
    }
}