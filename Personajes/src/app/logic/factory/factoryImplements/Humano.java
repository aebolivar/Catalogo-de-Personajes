package app.logic.factory.factoryImplements;

import app.logic.factory.factoryInterface.Personaje;

public class Humano extends Personaje {

    @Override
    public void crearTarjeta() {
        this.caracteristicas = "Su característica principal dada por Ilúvatar "
                + "es el don de la libertad, acotada en que sólo está un tiempo"
                + " breve en el mundo y por tanto no están sujetos a él, como "
                + "los Elfos; en otra palabras, la Muerte es realidad la más "
                + "grande expresión de la Libertad humana. Además tiene el "
                + "poder de modelar y cambiar su propio destino, esto significa"
                + " que pueden cambiar su propia historia cantada y "
                + "preconcebida en La Gran Música de los Ainur durante la "
                + "creación de Arda.";
        this.salud = crearValor(60, 80);
        this.especie = "Humano";
        this.energia = crearValor(70, 85);
        this.mana = crearValor(5, 15);
        this.altura = crearValor(155, 185);
        this.fuerza = crearValor(40, 50);
        this.agilidad = crearValor(50, 75);
        this.imagen = "resources/img/humano.jpg";
        if (this.fuerza < 45) {
            this.arma = "Arco";
        } else {
            this.arma = "Espada";
        }
    }

    @Override
    public int crearValor(int numeroMenor, int numeroMayor) {
        return (int) Math.floor(Math.random() * (numeroMayor - numeroMenor + 1) + numeroMenor);
    }
}
