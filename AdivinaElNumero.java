package andres.marulanda.javaparanovatoscap3;
/**
 * @author Andres-Marulanda
 */
public class AdivinaElNumero {
    
    //Atributos
    private byte numeroIncognito;
    
    //Constructor
    public AdivinaElNumero(byte numeroIncognito){
        this.numeroIncognito = numeroIncognito;
    }
    
    //set and get
    public void setNumeroIncognito(byte numeroIncognito){
        this.numeroIncognito = numeroIncognito;
    }

    public byte getNumeroIncognito() {
        return numeroIncognito;
    }
    
    //Método para comparar el número ingresado por el usuario y el número a adivinar.
    public byte compararNumeros(byte numero){
        
        byte numeroIngresado = numero;
        
        byte opcion = 0;
        
        if (numeroIngresado < 0 || numeroIngresado > 100){
           
            opcion = 8;
            
        }else{
            
            if(this.numeroIncognito == numeroIngresado){

                opcion = 1;

            }else if(this.numeroIncognito + 50 < numeroIngresado){

                opcion = 2;

            }else if(this.numeroIncognito + 30 < numeroIngresado){

                opcion = 3;

            }else if(this.numeroIncognito + 10 < numeroIngresado){

                opcion = 4;

            }else if(this.numeroIncognito - 50 > numeroIngresado){

                opcion = 5;

            }else if(this.numeroIncognito - 30 > numeroIngresado){

                opcion = 6;

            }else if(this.numeroIncognito - 10 > numeroIngresado){

                opcion = 7;
            }   
        }

        return opcion;
    }
}
