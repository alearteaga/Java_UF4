package Classes_Abstractes;

abstract class Dispositivos {
    public abstract void encender();
}

class Smartphone extends Dispositivos {
    @Override
    public void encender() {
        System.out.println("Bienvenido a tu Smartphone");
    } 
}

class Tablet extends Dispositivos {
    @Override
    public void encender() {
        System.out.println("Bienvenido a tu tablet");
    } 
}
