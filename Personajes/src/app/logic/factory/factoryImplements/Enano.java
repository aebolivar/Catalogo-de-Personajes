package app.logic.factory.factoryImplements;

import app.logic.factory.factoryInterface.Personaje;

public class Enano extends Personaje {

    @Override
    public void crearTarjeta() {
        this.caracteristicas = "Es un gran conocedor de la minería y orfebrería"
                + " agobiado por la larga labor de la busqueda y extracción de "
                + "los minerales subterraneos. Posee una gran longevidad, "
                + "llegando algunos a vivir alrededor de los 600 años. Es "
                + "robusto, corpulento y más fuerte y recio que el resto de las"
                + " razas. Siempre tiene barba, y el cortársela es la mayor "
                + "vergüenza y ofensa que le puede hacer, mereciendo el odio "
                + "y rencor de toda su raza.";
        this.salud = crearValor(40, 80);
        this.especie = "Enano";
        this.energia = crearValor(40, 70);
        this.mana = crearValor(30, 60);
        this.altura = crearValor(120, 150);
        this.fuerza = crearValor(50, 80);
        this.agilidad = crearValor(30, 70);
        this.imagen = "resources/img/enano.jpg";
        if (this.fuerza > 65) {
            this.arma = "Garrote";
        } else {
            this.arma = "Acha";
        }
    }

    @Override
    public int crearValor(int numeroMenor, int numeroMayor) {
        return (int) Math.floor(Math.random() * (numeroMayor - numeroMenor + 1) + numeroMenor);
    }
}
