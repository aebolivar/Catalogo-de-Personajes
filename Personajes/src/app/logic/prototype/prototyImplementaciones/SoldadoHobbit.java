package app.logic.prototype.prototyImplementaciones;

import app.logic.prototype.prototypeInterface.InterfaceEjercito;
import javax.swing.ImageIcon;

public class SoldadoHobbit implements InterfaceEjercito{

    private ImageIcon imagen;

    public SoldadoHobbit() {
        imagen = new ImageIcon();
    }
    
    public SoldadoHobbit(String direccion) {
        imagen = new ImageIcon(direccion);
    }

    @Override
    public Object clonar() {
        SoldadoHobbit soldadoHobbit = new SoldadoHobbit();
        soldadoHobbit.setImagen(imagen);
        return soldadoHobbit;
    }

    @Override
    public ImageIcon obtenerImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
    
}
