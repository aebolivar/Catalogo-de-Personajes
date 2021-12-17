package app.client.vistaPersonajes;

import app.logic.factory.fabrica.Fabrica;
import app.logic.prototype.administrador.AdministradorDePrototipos;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;

public class VistaPersonajesComponent implements ActionListener, FocusListener {

    private VistaPersonajesTemplate vistaPersonajesTemplate;
    private Fabrica fabrica;
    private AdministradorDePrototipos administradorDePrototipos;
    private ArrayList<String> personajes;
    
    private int posicion, cantidadHumanos, cantidadElfos, cantidadEnanos,
            cantidadHobbits, cantidadIstaris;

    public VistaPersonajesComponent(int cantidadHumanos, int cantidadElfos, int cantidadEnanos, int cantidadHobbits, int cantidadIstaris) {
        this.cantidadHumanos = cantidadHumanos;
        this.cantidadElfos = cantidadElfos;
        this.cantidadEnanos = cantidadEnanos;
        this.cantidadHobbits = cantidadHobbits;
        this.cantidadIstaris = cantidadIstaris;
        personajes = new ArrayList();
        fabrica = new Fabrica();
        llenarListaPersonajes();
        administradorDePrototipos = new AdministradorDePrototipos();
        armarEjercito();
        posicion = -1;
        this.vistaPersonajesTemplate = new VistaPersonajesTemplate(this);
    }

    public VistaPersonajesTemplate getvistaPersonajesTemplate() {
        return this.vistaPersonajesTemplate;
    }

    public void llenarListaPersonajes() {
        personajes.add("Humano");
        personajes.add("Elfo");
        personajes.add("Enano");
        personajes.add("Istari");
        personajes.add("Hobbit");
    }
    
    public void armarEjercito() {
        administradorDePrototipos.crearEjercito("Humano", cantidadHumanos);
        administradorDePrototipos.crearEjercito("Elfo", cantidadElfos);
        administradorDePrototipos.crearEjercito("Enano", cantidadEnanos);
        administradorDePrototipos.crearEjercito("Istari", cantidadIstaris);
        administradorDePrototipos.crearEjercito("Hobbit", cantidadHobbits);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaPersonajesTemplate.getbMinimizar()) {
            this.vistaPersonajesTemplate.setExtendedState(Frame.ICONIFIED);
        }
        if (e.getSource() == vistaPersonajesTemplate.getbCerrar()) {
            System.exit(0);
        }
        if (e.getSource() == vistaPersonajesTemplate.getbIzquierda()) {
            if (posicion <= 0) {
                posicion = personajes.size() - 1;
            } else {
                posicion--;
            }
            actualizarPanelIzquierda();
            actualizarPanelDerecha();
        }
        if (e.getSource() == vistaPersonajesTemplate.getbDerecha()) {
            if (posicion >= personajes.size() - 1) {
                posicion = 0;
            } else {
                posicion++;
            }
            actualizarPanelIzquierda();
            actualizarPanelDerecha();
        }        
    }

    public void actualizarPanelIzquierda() {
        vistaPersonajesTemplate.getpIzquierdaCentro().removeAll();
        vistaPersonajesTemplate.crearPanelIZquierda(
                fabrica.obtenerPersonaje(personajes.get(posicion)
                ));
        vistaPersonajesTemplate.getpIzquierdaCentro().repaint();
    }
    
    public void actualizarPanelDerecha() {
        vistaPersonajesTemplate.getpDerechaCentro().removeAll();
        switch (posicion){
            case 0:
                vistaPersonajesTemplate.crearPanelDerecha(administradorDePrototipos.getSoldadosHumanos());
                break;
            case 1:
                vistaPersonajesTemplate.crearPanelDerecha(administradorDePrototipos.getSoldadosElfos());
                break;
            case 2:
                vistaPersonajesTemplate.crearPanelDerecha(administradorDePrototipos.getSoldadosEnanos());
                break;
            case 3:
                vistaPersonajesTemplate.crearPanelDerecha(administradorDePrototipos.getSoldadosIstaris());
                break;
            case 4:
                vistaPersonajesTemplate.crearPanelDerecha(administradorDePrototipos.getSoldadosHobbits());
                break;
        }
        vistaPersonajesTemplate.getpDerechaCentro().repaint();
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
    }

}
