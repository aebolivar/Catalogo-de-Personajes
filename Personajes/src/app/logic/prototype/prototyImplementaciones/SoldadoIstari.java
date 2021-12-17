package app.logic.prototype.prototyImplementaciones;

import app.logic.prototype.prototypeInterface.InterfaceEjercito;
import javax.swing.ImageIcon;

public class SoldadoIstari implements InterfaceEjercito{

    private ImageIcon imagen;

    public SoldadoIstari() {
    }
    
    public SoldadoIstari(String direccion) {
        imagen = new ImageIcon(direccion);
    }

    @Override
    public Object clonar() {
        SoldadoIstari soldadoIstari = new SoldadoIstari();
        soldadoIstari.setImagen(imagen);
        return soldadoIstari;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    @Override
    public ImageIcon obtenerImagen() {
        return imagen;
    }
    
    
    
}
