package app.logic.prototype.prototyImplementaciones;

import app.logic.prototype.prototypeInterface.InterfaceEjercito;
import javax.swing.ImageIcon;

public class SoldadoElfo implements InterfaceEjercito {

    private ImageIcon imagen;

    public SoldadoElfo() {
    }
    
    public SoldadoElfo(String direccion) {
        imagen = new ImageIcon(direccion);
    }

    @Override
    public Object clonar() {
        SoldadoElfo soldadoElfo = new SoldadoElfo();
        soldadoElfo.setImagen(imagen);
        return soldadoElfo;
    }

    @Override
    public ImageIcon obtenerImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

}
