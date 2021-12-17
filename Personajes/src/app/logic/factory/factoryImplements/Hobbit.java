package app.logic.factory.factoryImplements;

import app.logic.factory.factoryInterface.Personaje;

public class Hobbit extends Personaje {

    @Override
    public void crearTarjeta() {
        this.caracteristicas = "Está emparentado con los hombres y se "
                + "caracteriza por su baja estatura, la abundante vellosidad "
                + "que le crece en el empeine de los pies, las orejas algo "
                + "puntiagudas y una figura normalmente rolliza. Antes de "
                + "llegar a la Comarca a mediados de la Tercera Edad del Sol, "
                + "Solía vivir en los valles del río Anduin vive namorado "
                + "de su nueva tierra, da cada vez menos importancia a los "
                + "asuntos del exterior y vive en paz hasta que durante la "
                + "Guerra del Anillo y el mago Saruman invadió la Comarca.";
        this.salud = crearValor(70, 80);
        this.especie = "Hobbit";
        this.energia = crearValor(80, 90);
        this.mana = crearValor(5, 30);
        this.altura = crearValor(80, 110);
        this.fuerza = crearValor(10, 30);
        this.agilidad = crearValor(15, 45);
        this.imagen = "resources/img/hobbit.jpg";
        if (this.fuerza < 15) {
            this.arma = "Daga";
        } else {
            this.arma = "Espada";
        }
    }

    @Override
    public int crearValor(int numeroMenor, int numeroMayor) {
        return (int) Math.floor(Math.random() * (numeroMayor - numeroMenor + 1) + numeroMenor);
    }
}
