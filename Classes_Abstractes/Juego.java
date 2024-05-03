package Classes_Abstractes;


abstract class Juego {
    String nombre;

    public Juego(String nombre) {
        this.nombre = nombre;
    }

    abstract void iniciar();
    abstract void acabar();
    abstract void actualizar();
}

class JuegoAventura extends Juego {

    public JuegoAventura(String nombre){
        super(nombre);
    }

    @Override
    void iniciar() {
        System.out.println("IniciandJuegoEstrategiao juego " + nombre);
    }

    @Override
    void acabar() {
        System.out.println("Finalizando juego " + nombre);
    }

    @Override
    void actualizar() {
        System.out.println("Actualizando juego " + nombre);
    }
}
// Definimos la clase JuegoEstrategia que hereda de Juego
class JuegoEstrategia extends Juego {

    public JuegoEstrategia(String nombre){
        super(nombre);
    }

    @Override
    void iniciar() {
        System.out.println("Iniciando juego " + nombre);
    }

    @Override
    void acabar() {
        System.out.println("Finalizando juego " + nombre);
    }

    @Override
    void actualizar() {
        System.out.println("Actualizando juego " + nombre);
    }
}