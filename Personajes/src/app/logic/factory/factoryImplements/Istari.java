package app.logic.factory.factoryImplements;

import app.logic.factory.factoryInterface.Personaje;

public class Istari extends Personaje {

    @Override
    public void crearTarjeta() {
        this.caracteristicas = "También llamado Mago, pertenece a un grupo de "
                + "Maiar que fue enviado a la Tierra Media con la misión de "
                + "liberar a los Pueblos Libres de la sombra de Sauron. Tomo "
                + "forma humana, la de hombre de avanzada edad, con largas "
                + "barbas, capa, botas y un largo bastón.";
        this.salud = crearValor(30, 50);
        this.especie = "Istari";
        this.energia = crearValor(20, 40);
        this.mana = crearValor(85, 100);
        this.altura = crearValor(160, 180);
        this.fuerza = crearValor(30, 60);
        this.agilidad = crearValor(20, 50);
        this.imagen = "resources/img/istari.jpg";
        if (this.fuerza < 60) {
            this.arma = "Magia";
        } else {
            this.arma = "Espada";
        }
    }

    @Override
    public int crearValor(int numeroMenor, int numeroMayor) {
        return (int) Math.floor(Math.random() * (numeroMayor - numeroMenor + 1) + numeroMenor);
    }
}
