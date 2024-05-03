package Polimorfisme.Desafio;

interface Mensaje {
    void enviar();
}

// Clase Email
class Email implements Mensaje {
    public void enviar() {
        System.out.println("Enviando correo electrónico...");
    }
}

// Clase SMS
class SMS implements Mensaje {
    public void enviar() {
        System.out.println("Enviando mensaje de texto (SMS)...");
    }
}

// Clase MensajeVoz
class MensajeVoz implements Mensaje {
    public void enviar() {
        System.out.println("Enviando mensaje de voz...");
    }



    public static void main(String[] args) {
        Mensaje email = new Email();
        Mensaje sms = new SMS();
        Mensaje mensajeVoz = new MensajeVoz();
        
        email.enviar();
        sms.enviar();
        mensajeVoz.enviar();
    }
}
