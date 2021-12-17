package app.logic.factory.factoryImplements;

import app.logic.factory.factoryInterface.Personaje;

public class Elfo extends Personaje {

    @Override
    public void crearTarjeta() {
        this.caracteristicas = "Tiene una visión muy superior a la de los "
                + "Hombres y ve perfectamente en la oscuridad si ésta no es "
                + "absoluta. Es más hábil que las demás razas, y más resistente"
                + " en cuerpo y mente que Hombres y Enanos. Se recupera más "
                + "rápido de las heridas y no está sujeto a las enfermedades. "
                + "Es una criatura que ama la naturaleza, la vida y la música. "
                + "Es prácticamente inmortal: envejece junto con el mundo y "
                + "existe mientras el mundo exista. Es inmune a las "
                + "enfermedades; sólo puede perder la vida en batalla o "
                + "fallecer de pena.";
        this.salud = crearValor(90, 100);
        this.especie = "Elfo";
        this.energia = crearValor(50, 70);
        this.mana = crearValor(10, 30);
        this.altura = crearValor(160, 180);
        this.fuerza = crearValor(50, 70);
        this.agilidad = crearValor(50, 70);
        this.imagen = "resources/img/elfo.png";
        if (this.fuerza < 60) {
            this.arma = "Daga";
            
        } else {
            this.arma = "Arco";
        }
    }

    @Override
    public int crearValor(int numeroMenor, int numeroMayor) {
        return (int) Math.floor(Math.random() * (numeroMayor - numeroMenor + 1) + numeroMenor);
    }
}
