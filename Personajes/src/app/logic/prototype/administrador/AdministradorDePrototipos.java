package app.logic.prototype.administrador;

import app.logic.prototype.prototyImplementaciones.*;
import app.logic.prototype.prototypeInterface.InterfaceEjercito;
import java.util.ArrayList;

public class AdministradorDePrototipos {
    
    private ArrayList<InterfaceEjercito> soldadosElfos;
    private ArrayList<InterfaceEjercito> soldadosEnanos;
    private ArrayList<InterfaceEjercito> soldadosHobbits;
    private ArrayList<InterfaceEjercito> soldadosHumanos;
    private ArrayList<InterfaceEjercito> soldadosIstaris;
    
    public AdministradorDePrototipos() {
        soldadosElfos = new ArrayList();
        soldadosEnanos = new ArrayList();
        soldadosHobbits = new ArrayList();
        soldadosHumanos = new ArrayList();
        soldadosIstaris = new ArrayList();
        
        SoldadoElfo soldadoElfo = new SoldadoElfo("resources/img/elfo.png");
        SoldadoEnano soldadoEnano = new SoldadoEnano("resources/img/enano.jpg");
        SoldadoHobbit soldadoHobbit = new SoldadoHobbit("resources/img/hobbit.jpg");
        SoldadoHumano soldadoHumano = new SoldadoHumano("resources/img/humano.jpg");
        SoldadoIstari soldadoIstari = new SoldadoIstari("resources/img/istari.jpg");
        
        soldadosElfos.add(soldadoElfo);
        soldadosEnanos.add(soldadoEnano);
        soldadosHobbits.add(soldadoHobbit);
        soldadosHumanos.add(soldadoHumano);
        soldadosIstaris.add(soldadoIstari);
    }
    
    public void crearEjercito(String opcion, int cantidad){
        int i;
        if (opcion == "Humano") {
            for (i=0; i<cantidad; i++){
                soldadosHumanos.add((InterfaceEjercito) soldadosHumanos.get(0).clonar());
            }
        } else if (opcion == "Elfo") {
            for (i=0; i<cantidad; i++){
                soldadosElfos.add((InterfaceEjercito) soldadosElfos.get(0).clonar());
            }
        } else if (opcion == "Enano") {
            for (i=0; i<cantidad; i++){
                soldadosEnanos.add((InterfaceEjercito) soldadosEnanos.get(0).clonar());
            }
        } else if (opcion == "Istari") {
            for (i=0; i<cantidad; i++){
                soldadosIstaris.add((InterfaceEjercito) soldadosIstaris.get(0).clonar());
            }
        } else {
            for (i=0; i<cantidad; i++){
                soldadosHobbits.add((InterfaceEjercito) soldadosHobbits.get(0).clonar());
            }
        }
    }

    public ArrayList<InterfaceEjercito> getSoldadosElfos() {
        return soldadosElfos;
    }

    public ArrayList<InterfaceEjercito> getSoldadosEnanos() {
        return soldadosEnanos;
    }

    public ArrayList<InterfaceEjercito> getSoldadosHobbits() {
        return soldadosHobbits;
    }

    public ArrayList<InterfaceEjercito> getSoldadosHumanos() {
        return soldadosHumanos;
    }

    public ArrayList<InterfaceEjercito> getSoldadosIstaris() {
        return soldadosIstaris;
    }
    
    

}
