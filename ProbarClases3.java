package andres.marulanda.javaparanovatoscap3;
/**
 * @author Andres-Marulanda
 */
public class ProbarClases3 {

    /**
     * @param args the command line arguments
     */
    
    static NumerosEnteros numeroEntero = new NumerosEnteros();
    
    public static void main(String[] args) {
        
        //numerosPrimos();
        adivinaElNumero();
       
    }
    
    public static void numerosPrimos(){
        
        String mensaje = "Ingrese el número que desea validar: ";
        int numeroAValidar = numeroEntero.leerNumeroEntero(mensaje);
        boolean primo;
        
        NumerosPrimos numeroPrimo = new NumerosPrimos(numeroAValidar);
        
        primo = numeroPrimo.validarPrimo();
        
        if(primo == true){
            System.out.println("El número " + numeroAValidar + " es primo");
        }else{
            System.out.println("El número " + numeroAValidar + " no es primo");
        }
        
    }
    
    public static void adivinaElNumero(){
        
        //Crear el objeto AdivinaElNumero con el número incognito.
        byte numeroAAdivinar = (byte) ((byte) Math.random()*100 + 1);
        AdivinaElNumero numeroIncognito = new AdivinaElNumero(numeroAAdivinar);
        
        byte intento = 0;
        boolean terminar = false;
        while(terminar == false){
            
            //Pedirle al usuario que ingrese un número.
            intento++;
            String mensaje = "Ingrese un número entre 1 y 100";
            byte opcion = (byte)numeroEntero.leerNumeroEntero(mensaje);
            
            if(opcion == 1){
                
                System.out.println("Felicitaciones, ganaste, ya que " + numeroAAdivinar + " es igual a " + numero);
                System.out.println("Número de intentos: " + intento);
                terminar = true;
                
            }else if(opcion == 2){
                System.out.println("El número es demasiado mayor");
                System.out.println("Número de intentos: " + intento);
                
            }else if(opcion == 3){
                System.out.println("El número es mayor");
                System.out.println("Número de intentos: " + intento);
                
            }else if(opcion == 4){
                System.out.println("El número es mayor, pero ya estas cerca");
                System.out.println("Número de intentos: " + intento);
                
            }else if(opcion == 5){
                System.out.println("El número es demasiado menor");
                System.out.println("Número de intentos: " + intento);
                
            }else if(opcion == 6){
                System.out.println("El número es menor");
                System.out.println("Número de intentos: " + intento);
                
            }else if(opcion == 7){
                System.out.println("El número es menor, pero estás cerca");
                System.out.println("Número de intentos: " + intento);
                
            }else if(opcion == 8){
                System.out.println("El número esta fuera del rango");
                System.out.println("Número de intentos: " + intento);
                
            }else{
                System.out.println("siguelo intentando");
            }
            
        }
        
    }
}
