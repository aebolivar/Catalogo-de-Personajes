package app.client.vistaPersonajes;

import app.logic.factory.factoryInterface.Personaje;
import app.logic.prototype.prototypeInterface.InterfaceEjercito;
import app.singleton.ObjGraficosService;
import app.singleton.RecursosService;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VistaPersonajesTemplate extends Frame {

    private ObjGraficosService sObjGraficos;//Objeto de la clase Service
    private RecursosService sRecursos;

    private JPanel pIzquierda, pDerecha, pIzquierdaCentro, pDerechaCentro;
    private JLabel lTituloIzquierda, lTituloDerecha, lEspecie, lCaracteristicas,
            lSalud, lEnergia, lMana, lAltura, lFuerza, lAgilidad, lArmaText,
            lPersonaje, lSaludText, lEnergiaText, lManaText, lAlturaText,
            lFuerzaText, lAgilidadText;
    private JButton bIzquierda, bDerecha, bCerrar, bMaximizar, bMinimizar;
    private ImageIcon iDimAux, iIzquierda, iDerecha, iSalud, iEnergia, iMana,
            iAltura, iFuerza, iAgilidad, iPersonaje;

    private VistaPersonajesComponent vistaPersonajesComponent;

    public VistaPersonajesTemplate(VistaPersonajesComponent vistaPersonajesComponent) {
        this.vistaPersonajesComponent = vistaPersonajesComponent;

        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        this.crearObjetosDecoradores();
        this.crearJPanels();
        this.crearJButtons();
        this.crearJLabels();

        setSize(1200, 650);
        setUndecorated(true);
        setLayout(null);
        setLocationRelativeTo(this);
        setVisible(true);
    }

    private void crearObjetosDecoradores() {
        iIzquierda = new ImageIcon("resources/img/izquierdaBlanco.png");
        iDerecha = new ImageIcon("resources/img/derechaBlanco.png");
        iAgilidad = new ImageIcon("resources/img/agilidad.png");
        iFuerza = new ImageIcon("resources/img/fuerza.png");
        iEnergia = new ImageIcon("resources/img/energia.png");
        iMana = new ImageIcon("resources/img/mana.png");
        iSalud = new ImageIcon("resources/img/salud.png");
        iAltura = new ImageIcon("resources/img/altura.png");
    }

    private void crearJPanels() {
        pIzquierda = sObjGraficos.construirJPanel(
                0, 0, 100, 650, sRecursos.getColorFondo(),
                sRecursos.getBordeGris()
        );
        this.add(pIzquierda);

        pDerecha = sObjGraficos.construirJPanel(
                1100, 0, 100, 650, sRecursos.getColorFondo(),
                sRecursos.getBordeGris()
        );
        this.add(pDerecha);

        pIzquierdaCentro = sObjGraficos.construirJPanel(
                100, 0, 500, 650, sRecursos.getColorFondo(),
                sRecursos.getBordeGris()
        );
        this.add(pIzquierdaCentro);

        pDerechaCentro = sObjGraficos.construirJPanel(
                600, 0, 500, 650, sRecursos.getColorFondo(),
                sRecursos.getBordeGris()
        );
        this.add(pDerechaCentro);
    }

  

    private void crearJButtons() {
        //Botón Cerrar
        iDimAux = new ImageIcon(sRecursos.getiCerrar().getImage().getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING));
        bCerrar = sObjGraficos.construirJButton(
                null, 8, 7, 15, 15, sRecursos.getcMano(), iDimAux, null, null,
                null, null, "c", false
        );
        bCerrar.addActionListener(vistaPersonajesComponent);
        pIzquierda.add(bCerrar);

        //Botón Maximizar
        iDimAux = new ImageIcon(sRecursos.getiMaximizar().getImage().getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING));
        bMaximizar = sObjGraficos.construirJButton(
                null, 26, 7, 15, 15, sRecursos.getcMano(), iDimAux, null, null,
                null, null, "c", false
        );
        pIzquierda.add(bMaximizar);

        //Botón Minimizar
        iDimAux = new ImageIcon(sRecursos.getiMinimizar().getImage().getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING));
        bMinimizar = sObjGraficos.construirJButton(
                null, 44, 7, 15, 15, sRecursos.getcMano(), iDimAux, null, null,
                null, null, "c", false
        );
        this.bMinimizar.addActionListener(vistaPersonajesComponent);
        pIzquierda.add(bMinimizar);

        //Botón Izquierda
        iDimAux = new ImageIcon(iIzquierda.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        bIzquierda = sObjGraficos.construirJButton(
                null, 0, 50, 100, 600, sRecursos.getcMano(), iDimAux, null, null,
                null, null, "c", false
        );
        bIzquierda.addActionListener(vistaPersonajesComponent);
        pIzquierda.add(bIzquierda);

        //Botón Derecha
        iDimAux = new ImageIcon(iDerecha.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        bDerecha = sObjGraficos.construirJButton(
                null, 0, 50, 100, 600, sRecursos.getcMano(), iDimAux, null, null,
                null, null, "c", false
        );
        bDerecha.addActionListener(vistaPersonajesComponent);
        pDerecha.add(bDerecha);
    }

    private void crearJLabels() {
        lTituloIzquierda = sObjGraficos.construirJLabel(
                "Sección de información", 0, 0, 500, 650, null, Color.WHITE,
                null, sRecursos.getFontTPrincipal(), "c"
        );
        pIzquierdaCentro.add(lTituloIzquierda);

        lTituloDerecha = sObjGraficos.construirJLabel(
                "Sección de cantidad", 0, 0, 500, 650, null, Color.WHITE,
                null, sRecursos.getFontTPrincipal(), "c"
        );
        pDerechaCentro.add(lTituloDerecha);
    }

    public void crearPanelIZquierda(Personaje personaje) {
        personaje.crearTarjeta();

        lTituloIzquierda = sObjGraficos.construirJLabel(
                personaje.getEspecie(), 0, 0, 500, 50, null, Color.WHITE,
                null, sRecursos.getFontTPrincipal(), "c"
        );
        pIzquierdaCentro.add(lTituloIzquierda);

        iPersonaje = new ImageIcon(personaje.getImagen());
        iDimAux = new ImageIcon(iPersonaje.getImage().getScaledInstance(200, 230, Image.SCALE_AREA_AVERAGING));
        lPersonaje = sObjGraficos.construirJLabel(
                null, 150, 50, 200, 230, iDimAux, null, null, null, "c"
        );
        pIzquierdaCentro.add(lPersonaje);

        lCaracteristicas = sObjGraficos.construirJLabel(
                "<html><div align='justify'>\"" + personaje.getCaracteristicas()
                + "\"</div></html>", 50, 300, 400, 130, null, Color.WHITE,
                null, sRecursos.getFontCaracteristicas(), "c"
        );
        pIzquierdaCentro.add(lCaracteristicas);

        iDimAux = new ImageIcon(iSalud.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));
        lSalud = sObjGraficos.construirJLabel(
                null, 20 + 50, 450, 20, 20, iDimAux, null, null, null, "c"
        );
        pIzquierdaCentro.add(lSalud);

        iDimAux = new ImageIcon(iEnergia.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));
        lEnergia = sObjGraficos.construirJLabel(
                null, 20 + 50, 490, 20, 20, iDimAux, null, null, null, "c"
        );
        pIzquierdaCentro.add(lEnergia);

        iDimAux = new ImageIcon(iMana.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));
        lMana = sObjGraficos.construirJLabel(
                null, 20 + 50, 530, 20, 20, iDimAux, null, null, null, "c"
        );
        pIzquierdaCentro.add(lMana);

        iDimAux = new ImageIcon(iAgilidad.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));
        lAgilidad = sObjGraficos.construirJLabel(
                null, 270 + 50, 450, 20, 20, iDimAux, null, null, null, "c"
        );
        pIzquierdaCentro.add(lAgilidad);

        iDimAux = new ImageIcon(iFuerza.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));
        lFuerza = sObjGraficos.construirJLabel(
                null, 270 + 50, 490, 20, 20, iDimAux, null, null, null, "c"
        );
        pIzquierdaCentro.add(lFuerza);

        iDimAux = new ImageIcon(iAltura.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));
        lAltura = sObjGraficos.construirJLabel(
                null, 270 + 50, 530, 20, 20, iDimAux, null, null, null, "c"
        );
        pIzquierdaCentro.add(lAltura);

        //////////////////////////////////////////
        lSaludText = sObjGraficos.construirJLabel(
                personaje.getSalud() + "", 20 + 30 + 50, 450, 100, 20, null, Color.WHITE, null,
                sRecursos.getFontPersonajes(), "l"
        );
        pIzquierdaCentro.add(lSaludText);

        lEnergiaText = sObjGraficos.construirJLabel(
                personaje.getEnergia() + "", 20 + 30 + 50, 490, 100, 20, null, Color.WHITE, null,
                sRecursos.getFontPersonajes(), "l"
        );
        pIzquierdaCentro.add(lEnergiaText);

        lManaText = sObjGraficos.construirJLabel(
                personaje.getMana() + "", 20 + 30 + 50, 530, 100, 20, null, Color.WHITE, null,
                sRecursos.getFontPersonajes(), "l"
        );
        pIzquierdaCentro.add(lManaText);

        lAgilidadText = sObjGraficos.construirJLabel(
                personaje.getAgilidad() + "", 270 + 30 + 50, 450, 100, 20, null, Color.WHITE, null,
                sRecursos.getFontPersonajes(), "l"
        );
        pIzquierdaCentro.add(lAgilidadText);

        lFuerzaText = sObjGraficos.construirJLabel(
                personaje.getFuerza() + "", 270 + 30 + 50, 490, 100, 20, null, Color.WHITE, null,
                sRecursos.getFontPersonajes(), "l"
        );
        pIzquierdaCentro.add(lFuerzaText);

        lAlturaText = sObjGraficos.construirJLabel(
                personaje.getAltura() + "", 270 + 30 + 50, 530, 100, 20, null, Color.WHITE, null,
                sRecursos.getFontPersonajes(), "l"
        );
        pIzquierdaCentro.add(lAlturaText);

        lArmaText = sObjGraficos.construirJLabel(
                personaje.getArma(), 0, 580, 500, 20, null, Color.WHITE, null,
                sRecursos.getFontPersonajes(), "c"
        );
        pIzquierdaCentro.add(lArmaText);
    }

    public void crearPanelDerecha(ArrayList<InterfaceEjercito> ejercito) {
        int i, j, contador = 1;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (contador < ejercito.size()) {
                    JLabel lSoldado;
                    iDimAux = new ImageIcon(ejercito.get(contador).obtenerImagen().getImage().getScaledInstance(136, 186, Image.SCALE_AREA_AVERAGING));
                    lSoldado = sObjGraficos.construirJLabel(
                            null, (15 + (j * 166)), (15 + (i * 216)), 136, 186, iDimAux, null, null, null, "c"
                    );
                    pDerechaCentro.add(lSoldado);
                    contador++;
                }
            }
        }
    }

    public JButton getbCerrar() {
        return bCerrar;
    }

    public JButton getbMaximizar() {
        return bMaximizar;
    }

    public JButton getbMinimizar() {
        return bMinimizar;
    }

    public JButton getbIzquierda() {
        return bIzquierda;
    }

    public JButton getbDerecha() {
        return bDerecha;
    }

    public JPanel getpIzquierdaCentro() {
        return pIzquierdaCentro;
    }

    public JPanel getpDerechaCentro() {
        return pDerechaCentro;
    }

}
