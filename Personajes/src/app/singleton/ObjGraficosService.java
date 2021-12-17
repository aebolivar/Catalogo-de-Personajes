package app.singleton;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.geom.RectangularShape;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class ObjGraficosService {

    private ObjGraficosService() {//Constructor privado - Singleton
    }

    private JPanel panel;
    private JScrollPane panelScroll;
    private JButton button;
    private JRadioButton radioButton;
    private JCheckBox check;
    private JLabel label;
    private JTextField textField;
    private JPasswordField passwordField;
    private JTextArea textArea;
    private JComboBox<String> comboBox;
    static private ObjGraficosService servicio;

    public JPanel construirJPanel(
            int x, int y, int ancho, int alto, Color colorFondo, Border borde
    ) {
        panel = new JPanel();
        panel.setSize(ancho, alto);
        panel.setLocation(x, y);
        panel.setLayout(null);
        panel.setBackground(colorFondo);
        panel.setBorder(borde);
        return panel;
    }

    public JButton construirJButton(
            String texto, int x, int y, int ancho, int alto, Cursor cursor,
            ImageIcon imagen, Font fuente, Color colorFondo, Color colorFuente,
            Border borde, String direccion, boolean esSolido
    ) {
        button = new JButton(texto);
        button.setSize(ancho, alto);
        button.setLocation(x, y);
        button.setFocusable(false);
        button.setCursor(cursor);
        button.setFont(fuente);
        button.setBackground(colorFondo);
        button.setForeground(colorFuente);
        button.setIcon(imagen);
        button.setBorder(borde);
        button.setContentAreaFilled(esSolido);
        switch (direccion) {
            case "l":
                button.setHorizontalAlignment(SwingConstants.LEFT);
                break;
            case "r":
                button.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            default:
                break;
        }
        return button;
    }

    public JLabel construirJLabel(
            String texto, int x, int y, int ancho, int alto, ImageIcon imagen,
            Color colorFuente, Color colorFondo, Font fuente, String direccion
    ) {
        label = new JLabel(texto);
        label.setSize(ancho, alto);
        label.setLocation(x, y);
        label.setForeground(colorFuente);
        label.setFont(fuente);
        label.setIcon(imagen);
        if (colorFondo != null) {
            label.setOpaque(true);
            label.setBackground(colorFondo);
        }
        switch (direccion) {
            case "c":
                label.setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case "r":
                label.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            default:
                break;
        }
        return label;
    }

    public JComboBox<String> construirJComboBox(
            String cadena, int x, int y, int ancho, int alto, Color colorFondo,
            Color colorFuente, String direccion
    ) {
        comboBox = new JComboBox<String>();
        comboBox.setSize(ancho, alto);
        comboBox.setLocation(x, y);
        String[] arregloCadena = cadena.split("_");
        for (int i = 0; i < arregloCadena.length; i++) {
            comboBox.addItem(arregloCadena[i]);
        }
        comboBox.setBackground(colorFondo);
        comboBox.setForeground(colorFuente);
        switch (direccion) {
            case "c":
                ((JLabel) comboBox.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case "r":
                ((JLabel) comboBox.getRenderer()).setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            default:
                break;
        }
        return comboBox;
    }

    public static ObjGraficosService getService() {
        if (servicio == null) {
            servicio = new ObjGraficosService();
        }
        return servicio;
    }
}
