package app.singleton;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class RecursosService {

    private Color colorFondo, colorGris, colorSpotify;
    private Font fontTPrincipal, fontPersonajes, fontCaracteristicas, fontBoton;
    private Cursor cMano;
    private ImageIcon iCerrar, iMaximizar, iMinimizar;
    private Border bordeGris;

    static private RecursosService servicio;

    private RecursosService() {//Constructor privado - Singleton

        iCerrar = new ImageIcon("resources/img/botonRojo.png");
        iMaximizar = new ImageIcon("resources/img/botonAmarillo.png");
        iMinimizar = new ImageIcon("resources/img/botonVerde.png");

        colorFondo = new Color(17, 17, 23);
        colorSpotify = new Color(0, 189, 89);
        colorGris = new Color(32, 33, 39);

        fontTPrincipal = new Font("Arial Rounded MT Bold", Font.PLAIN, 30);
        fontPersonajes = new Font("Arial Rounded MT Bold", Font.PLAIN, 20);
        fontCaracteristicas = new Font("book antiqua", Font.PLAIN, 12);
        fontBoton = new Font("arial black", Font.PLAIN, 15);

        cMano = new Cursor(Cursor.HAND_CURSOR);

        bordeGris = BorderFactory.createMatteBorder(0, 0, 1, 0, colorGris);
    }

    public static RecursosService getService() {
        if (servicio == null) {
            servicio = new RecursosService();
        }
        return servicio;
    }

    public Color getColorFondo() {
        return colorFondo;
    }

    public Color getColorSpotify() {
        return colorSpotify;
    }

    public Color getColorGris() {
        return colorGris;
    }

    public Font getFontTPrincipal() {
        return fontTPrincipal;
    }

    public Font getFontPersonajes() {
        return fontPersonajes;
    }

    public Font getFontCaracteristicas() {
        return fontCaracteristicas;
    }

    public Font getFontBoton() {
        return fontBoton;
    }

    public Cursor getcMano() {
        return cMano;
    }

    public ImageIcon getiCerrar() {
        return iCerrar;
    }

    public ImageIcon getiMaximizar() {
        return iMaximizar;
    }

    public ImageIcon getiMinimizar() {
        return iMinimizar;
    }

    public Border getBordeGris() {
        return bordeGris;
    }

    public static RecursosService getServicio() {
        return servicio;
    }

}
