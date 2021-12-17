package app.logic.prototype.prototyImplementaciones;

import app.logic.prototype.prototypeInterface.InterfaceEjercito;
import javax.swing.ImageIcon;

public class SoldadoEnano implements InterfaceEjercito{

    private ImageIcon imagen;

    public SoldadoEnano() {
    }
    
    public SoldadoEnano(String direccion) {
        imagen = new ImageIcon(direccion);
    }

    @Override
    public Object clonar() {
        SoldadoEnano soldadoEnano = new SoldadoEnano();
        soldadoEnano.setImagen(imagen);
        return soldadoEnano;
    }

    @Override
    public ImageIcon obtenerImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
    
}
