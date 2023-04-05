package andres.marulanda.javaparanovatoscap3;
/**
 * @author Andres-Marulanda
 */
public class NumerosPrimos {
    
    // Atributos 
    private int numero;
    
    // Constructor
    public NumerosPrimos(int numero){
        this.numero = numero;
    }
    
    //set and get
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public boolean validarPrimo(){
        
        // Es aquel que solo se puede dividir por 1 y por ellos mismos.
        int contador = 2;
        boolean primo = true;
        
        while (contador < this.numero){
            float residuo = this.numero % contador;
            
            if(residuo == 0){
                primo = false;
            }
            contador++;
        }
        return primo;
    }
}
