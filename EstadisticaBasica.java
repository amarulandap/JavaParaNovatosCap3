package andres.marulanda.javaparanovatoscap3;

// Importar la clase Arrays para hacer uso del método sort para ordenar el arreglo.
import java.util.Arrays;

/**
 * @author Andres-Marulanda
 */

public class EstadisticaBasica {
    
    // Atributos.
    
    private short tamañoMuestra;
    private float [] muestra;
    
    // Constructores.

    public EstadisticaBasica(short tamañoMuestra, float[] muestra) {
        this.tamañoMuestra = tamañoMuestra;
        this.muestra = muestra;
    }
    
    // setters and getters.

    public short getTamañoMuestra() {
        return tamañoMuestra;
    }

    public void setTamañoMuestra(short tamañoMuestra) {
        this.tamañoMuestra = tamañoMuestra;
    }

    public float[] getMuestra() {
        return muestra;
    }

    public void setMuestra(float[] muestra) {
        this.muestra = muestra;
    }
    
    // Encontrar el valor máximo.
    
    public float valorMaximo (){
        float valorMaximo = this.muestra[0];
        
        for (short i = 1; i < this.tamañoMuestra; i++){
            
            if (this.muestra[i] > valorMaximo){
                valorMaximo = this.muestra[i];
            }
        }
        return valorMaximo;
    }
    
    // Encontrar el valor mínimo.
    
    public float valorMinimo (){
        float valorMinimo = this.muestra[0];
        
        for (short i = 1; i < this.tamañoMuestra; i++){
            
            if (this.muestra[i] < valorMinimo){
                valorMinimo = this.muestra[i];
            }
        }
        return valorMinimo;
    }
    
    // Hallar el rango.
    
    public void rango (float valorMaximo,float valorMinimo){
        float maximo = valorMaximo;
        float minimo = valorMinimo;
        
        if (maximo > minimo){
            float rangoMuestra = maximo - minimo;
            System.out.println("El rango de la muestra es: " + rangoMuestra); 
        }else{
            System.out.println("El valor máximo tiene que ser mayor que el valor mínimo");
        }
    }
    
    // Hallar la media.
    
    public float media (){
        float suma = 0;
        float media = 0;
        
        for (short i = 0; i < this.tamañoMuestra; i++){
            suma += this.muestra[i];
        }
        media = suma / this.tamañoMuestra;
        return media;
    }
    
    // Hallar la mediana.
    
    public float mediana (){
        float mediana = 0;
        float residuo = this.tamañoMuestra % 2;
        
        // Ordenar el arreglo de menor a mayor con el método sort.
        Arrays.sort(this.muestra);
        System.out.println(Arrays.toString(this.muestra));
        
        if (residuo != 0){
            mediana = this.muestra[this.tamañoMuestra / 2];    
        }else{
            float datoCentral1 = this.muestra[this.tamañoMuestra / 2];
            float datoCentral2 = this.muestra[(this.tamañoMuestra / 2) + 1];
            mediana = (datoCentral1 + datoCentral2) / 2;
        }
        return mediana;
    }
    
    // Hallar la varianza.
    
    public float varianza (){
        float varianza = 0;
        float suma = 0;
        
        for (short i = 0; i < this.tamañoMuestra; i++){
            suma += Math.pow((this.muestra[i] - this.media()), 2);
        }
        varianza = suma / this.tamañoMuestra;
        
        return varianza;
    }
    
    public float desviacionEstandar (){
        float desviacion = (float) Math.sqrt(this.varianza());
        
        return desviacion;    
    }
}
