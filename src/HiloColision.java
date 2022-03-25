
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;


public class HiloColision extends Thread {
    
    Random perro=new Random();
    private JProgressBar barraDistancia1;
    private JProgressBar barraDistancia2;
    private Planetas planet1;
    private Planetas planet2;
    private Cientificos cienti;

    public HiloColision(JProgressBar barraDistancia1, JProgressBar barraDistancia2, Planetas planet1, Planetas planet2, Cientificos cienti) {
        this.barraDistancia1 = barraDistancia1;
        this.barraDistancia2 = barraDistancia2;
        this.planet1 = planet1;
        this.planet2 = planet2;
        this.cienti = cienti;
    }
    

    @Override
    public void run(){
        boolean continuar=true;
        while(continuar){
            barraDistancia1.setValue(barraDistancia1.getValue()+1);
            if(barraDistancia1.getValue()==barraDistancia1.getMaximum()){
                JOptionPane.showMessageDialog(null,"Fin de la colision");
              barraDistancia1.setValue(0);
              continuar=false;
            
            int coordenadaX = (planet1.getCoordenadaX()+planet2.getCoordenadaX())/2;
                int coordenadaY = (planet1.getCoordenadaY()+planet2.getCoordenadaY())/2;
                int peso = (planet1.getPeso()+planet2.getPeso())/2;
                int tamanio = (planet1.getTamanio()+planet2.getTamanio())/2;
                
             int probabilidad=perro.nextInt(100)+1;
             
            if(planet1 instanceof Terrestre){
                 if(probabilidad<=25){
                    String nombreNewPlanet =JOptionPane.showInputDialog(null,"Ingrese un nombre para el nuevo planeta");
                     Planetas nuevoPlanet=new Terrestre(tamanio,peso,nombreNewPlanet,coordenadaX,coordenadaY);
                     cienti.getPlanetasDescubiertos().add(nuevoPlanet);
                 }
             }
             else if(planet2 instanceof Gaseoso){
                 if(probabilidad<=20){
                     String nombreNewPlanet =JOptionPane.showInputDialog(null,"Ingrese un nombre para el nuevo planeta");
                     Planetas nuevoPlanet=new Gaseoso(tamanio,peso,nombreNewPlanet,coordenadaX,coordenadaY);
                     cienti.getPlanetasDescubiertos().add(nuevoPlanet);
                 }  
             }
             }
        try {
            Thread.sleep(5);
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        }
        
    }
}
