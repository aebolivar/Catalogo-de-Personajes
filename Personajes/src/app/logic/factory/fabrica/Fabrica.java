package app.logic.factory.fabrica;

import app.logic.factory.factoryInterface.Personaje;
import app.logic.factory.factoryImplements.*;

public class Fabrica {

    public Fabrica() {
    }

    public Personaje obtenerPersonaje(String opcion) {
        if (opcion == "Humano") {
            return new Humano();
        } else if (opcion == "Elfo") {
            return new Elfo();
        } else if (opcion == "Enano") {
            return new Enano();
        } else if (opcion == "Istari") {
            return new Istari();
        } else {
            return new Hobbit();
        }
    }
}
