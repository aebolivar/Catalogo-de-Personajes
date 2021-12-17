package app.logic.factory.factoryInterface;

public class Personaje {

    protected String nombre;
    protected String especie;
    protected String caracteristicas;
    protected String imagen;
    protected String arma;
    protected int salud;
    protected int energia;
    protected int mana;
    protected int altura;
    protected int fuerza;
    protected int agilidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public String getImagen() {
        return imagen;
    }

    public String getArma() {
        return arma;
    }
    
    public int getSalud() {
        return salud;
    }

    public int getEnergia() {
        return energia;
    }

    public int getMana() {
        return mana;
    }

    public int getAltura() {
        return altura;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void crearTarjeta() {
    }

    public int crearValor(int numeroMenor, int numeroMayor) {
        return (int) Math.floor(Math.random() * (numeroMayor - numeroMenor + 1) + numeroMenor);
    }
}
