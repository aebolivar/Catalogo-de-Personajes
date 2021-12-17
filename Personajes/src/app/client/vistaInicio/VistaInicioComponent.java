package app.client.vistaInicio;

import app.client.vistaPersonajes.VistaPersonajesComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Frame;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class VistaInicioComponent implements ActionListener, FocusListener {

    private VistaInicioTemplate vistaInicioTemplate;
    private VistaPersonajesComponent vistaPersonajesComponent;

    public VistaInicioComponent() {
        this.vistaInicioTemplate = new VistaInicioTemplate(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaInicioTemplate.getbMinimizar()) {
            this.vistaInicioTemplate.setExtendedState(Frame.ICONIFIED);
        }
        if (e.getSource() == vistaInicioTemplate.getbCerrar()) {
            System.exit(0);
        }
        if (e.getSource() == vistaInicioTemplate.getbConfirmar()) {
            String canHum, canElf, canEna, canHob, canIst;
            int cantidadHumanos, cantidadElfos, cantidadEnanos, cantidadHobbies, cantidadIstaris;
            canHum = ((String) vistaInicioTemplate.getCbHumano().getSelectedItem());
            canElf = ((String) vistaInicioTemplate.getCbElfo().getSelectedItem());
            canEna = ((String) vistaInicioTemplate.getCbEnano().getSelectedItem());
            canHob = ((String) vistaInicioTemplate.getCbHobbit().getSelectedItem());
            canIst = ((String) vistaInicioTemplate.getCbIstari().getSelectedItem());
            cantidadHumanos = Integer.parseInt(canHum);
            cantidadElfos = Integer.parseInt(canElf);
            cantidadEnanos = Integer.parseInt(canEna);
            cantidadHobbies = Integer.parseInt(canHob);
            cantidadIstaris = Integer.parseInt(canIst);
            vistaInicioTemplate.setVisible(false);
            vistaPersonajesComponent = new VistaPersonajesComponent(
                    cantidadHumanos, cantidadElfos, cantidadEnanos,
                    cantidadHobbies, cantidadIstaris
            );
        }
    }

    public VistaInicioTemplate getvistaInicioTemplate() {
        return this.vistaInicioTemplate;
    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {

    }

}
