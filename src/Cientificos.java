
import java.io.Serializable;
import java.util.ArrayList;


public class Cientificos implements Serializable {
    
    private String nombre;
    private ArrayList<Planetas>planetasDescubiertos=new ArrayList();

    public Cientificos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Planetas> getPlanetasDescubiertos() {
        return planetasDescubiertos;
    }

    public void setPlanetasDescubiertos(ArrayList<Planetas> planetasDescubiertos) {
        this.planetasDescubiertos = planetasDescubiertos;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
}
