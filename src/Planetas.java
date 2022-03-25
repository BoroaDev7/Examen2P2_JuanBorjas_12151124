
public class Planetas {
    
    private String nombre;
    private int tamanio,peso,coordenadaX,coordenadaY;

    public Planetas() {
    }

    public Planetas( int tamanio, int peso,String nombre, int coordenadaX, int coordenadaY) {
        this.nombre = nombre;
    
        this.tamanio = tamanio;
        this.peso = peso;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
 
    
}
