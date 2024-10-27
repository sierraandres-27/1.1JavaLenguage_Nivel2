package Exercise1;

public class Smartphone extends Teléfono implements Camara, Reloj {

    public String alarma() {
        return "Esta sonando la alarma";
    }


    public String fotografiar() {

        return "Se esta tomando una foto";


    }
}

