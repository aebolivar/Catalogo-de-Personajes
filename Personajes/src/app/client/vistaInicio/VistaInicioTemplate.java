package app.client.vistaInicio;

import app.singleton.ObjGraficosService;
import app.singleton.RecursosService;

import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VistaInicioTemplate extends JFrame {

    private ObjGraficosService sObjGraficos;//Objeto de la clase Service
    private RecursosService sRecursos;

    private JPanel panel;
    private JLabel lTitulo, lHumano, lElfo, lHobbit, lIstari, lEnano;
    private JButton bConfirmar, bCerrar, bMaximizar, bMinimizar;
    private JComboBox cbHumano, cbElfo, cbHobbit, cbIstari, cbEnano;
    private ImageIcon iDimAux;

    private VistaInicioComponent vistaInicioComponent;

    public VistaInicioTemplate(VistaInicioComponent vistaInicioComponent) {

        this.vistaInicioComponent = vistaInicioComponent;

        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        this.crearObjetosDecoradores();
        this.crearJPanels();
        this.crearJButtons();
        this.crearJComboBox();
        this.crearJLabels();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 650);
        setUndecorated(true);
        setLayout(null);
        setLocationRelativeTo(this);
        setVisible(true);
    }

    private void crearObjetosDecoradores() {
    }

    private void crearJPanels() {
        panel = sObjGraficos.construirJPanel(
                0, 0, 1200, 650, sRecursos.getColorFondo(),
                sRecursos.getBordeGris()
        );
        this.add(panel);
    }

    public void crearJComboBox() {
        cbHumano = sObjGraficos.construirJComboBox(
                "0_1_2_3_4_5_6_7_8_9", 150, 170, 100, 30, Color.WHITE, Color.BLACK, "c"
        );
        cbHumano.setFont(sRecursos.getFontPersonajes());
        cbHumano.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        panel.add(cbHumano);

        cbElfo = sObjGraficos.construirJComboBox(
                "0_1_2_3_4_5_6_7_8_9", 550, 170, 100, 30, Color.WHITE, Color.BLACK, "c"
        );
        cbElfo.setFont(sRecursos.getFontPersonajes());
        cbElfo.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        panel.add(cbElfo);

        cbEnano = sObjGraficos.construirJComboBox(
                "0_1_2_3_4_5_6_7_8_9", 950, 170, 100, 30, Color.WHITE, Color.BLACK, "c"
        );
        cbEnano.setFont(sRecursos.getFontPersonajes());
        cbEnano.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        panel.add(cbEnano);

        cbIstari = sObjGraficos.construirJComboBox(
                "0_1_2_3_4_5_6_7_8_9", 250, 350, 100, 30, Color.WHITE, Color.BLACK, "c"
        );
        cbIstari.setFont(sRecursos.getFontPersonajes());
        cbIstari.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        panel.add(cbIstari);

        cbHobbit = sObjGraficos.construirJComboBox(
                "0_1_2_3_4_5_6_7_8_9", 850, 350, 100, 30, Color.WHITE, Color.BLACK, "c"
        );
        cbHobbit.setFont(sRecursos.getFontPersonajes());
        cbHobbit.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        panel.add(cbHobbit);
    }


    private void crearJButtons() {
        //Botón Confirmar
        bConfirmar = sObjGraficos.construirJButton(
                "Confirmar", (panel.getWidth() - 250) / 2, 550, 250, 45,
                sRecursos.getcMano(), null, sRecursos.getFontBoton(),
                sRecursos.getColorSpotify(), Color.white, null,
                "C", true
        );
        bConfirmar.addActionListener(vistaInicioComponent);
        panel.add(bConfirmar);

        //Botón Cerrar
        iDimAux = new ImageIcon(sRecursos.getiCerrar().getImage().getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING));
        bCerrar = sObjGraficos.construirJButton(
                null, 8, 7, 15, 15, sRecursos.getcMano(), iDimAux, null, null,
                null, null, "c", false
        );
        bCerrar.addActionListener(vistaInicioComponent);
        panel.add(bCerrar);

        //Botón Maximizar
        iDimAux = new ImageIcon(sRecursos.getiMaximizar().getImage().getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING));
        bMaximizar = sObjGraficos.construirJButton(
                null, 26, 7, 15, 15, sRecursos.getcMano(), iDimAux, null, null,
                null, null, "c", false
        );
        panel.add(bMaximizar);

        //Botón Minimizar
        iDimAux = new ImageIcon(sRecursos.getiMinimizar().getImage().getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING));
        bMinimizar = sObjGraficos.construirJButton(
                null, 44, 7, 15, 15, sRecursos.getcMano(), iDimAux, null, null,
                null, null, "c", false
        );
        this.bMinimizar.addActionListener(vistaInicioComponent);
        panel.add(bMinimizar);

    }

    private void crearJLabels() {
        lTitulo = sObjGraficos.construirJLabel(
                "Señor de los anillos", (panel.getWidth() - 320) / 2, 20, 320, 35,
                null, Color.WHITE, null, sRecursos.getFontTPrincipal(), "c"
        );
        panel.add(lTitulo);

        lHumano = sObjGraficos.construirJLabel(
                "Humano", 50, 120, 300, 20,
                null, Color.WHITE, null, sRecursos.getFontPersonajes(), "c"
        );
        panel.add(lHumano);

        lElfo = sObjGraficos.construirJLabel(
                "Elfo", 450, 120, 300, 20,
                null, Color.WHITE, null, sRecursos.getFontPersonajes(), "c"
        );
        panel.add(lElfo);

        lEnano = sObjGraficos.construirJLabel(
                "Enano", 850, 120, 300, 20,
                null, Color.WHITE, null, sRecursos.getFontPersonajes(), "c"
        );
        panel.add(lEnano);

        lIstari = sObjGraficos.construirJLabel(
                "Istari", 0, 300, 600, 20,
                null, Color.WHITE, null, sRecursos.getFontPersonajes(), "c"
        );
        panel.add(lIstari);

        lHobbit = sObjGraficos.construirJLabel(
                "Hobbit", 600, 300, 600, 20,
                null, Color.WHITE, null, sRecursos.getFontPersonajes(), "c"
        );
        panel.add(lHobbit);

    }

    public JButton getbConfirmar() {
        return bConfirmar;
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

    public JComboBox getCbHumano() {
        return cbHumano;
    }

    public JComboBox getCbElfo() {
        return cbElfo;
    }

    public JComboBox getCbHobbit() {
        return cbHobbit;
    }

    public JComboBox getCbIstari() {
        return cbIstari;
    }

    public JComboBox getCbEnano() {
        return cbEnano;
    }

}
