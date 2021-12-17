package app.logic.prototype.prototyImplementaciones;

import app.logic.prototype.prototypeInterface.InterfaceEjercito;
import javax.swing.ImageIcon;

public class SoldadoHumano implements InterfaceEjercito{

    private ImageIcon imagen;

    public SoldadoHumano() {        
    }
    
    public SoldadoHumano(String direccion) {
        imagen = new ImageIcon(direccion);
    }

    @Override
    public Object clonar() {
        SoldadoHumano soldadoHumano = new SoldadoHumano();
        soldadoHumano.setImagen(imagen);
        return soldadoHumano;
    }

    @Override
    public ImageIcon obtenerImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
    
}
