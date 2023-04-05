package andres.marulanda.javaparanovatoscap3;
/**
 * @author Andres-Marulanda
 */

import java.util.Scanner;

public class ContadoresAcumuladoresYConmutadores {

    static Scanner leer = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        contadores();
        acumuladores();
        conmutadores();
        
        }
        
        
        public static void contadores(){
            
            // Contadores (Escribir un ciclo while y un for que nos permitan obtener una tabla de multiplicar)
            
            byte numero = 0;    // Almacenar el número ingresado por el usuario.
            byte i = 0;         // Controlar el ciclo while. CONTADOR.
        
            System.out.println("Ingrese un número entre 1 y 10: ");
            try{
                numero = leer.nextByte();
            }catch(Exception e){
                e.printStackTrace();
            }
        
            if (1 <= numero && numero <= 10){
            
                while (i < 11){
                    System.out.println(numero + "*" + i + "=" + numero * i);
                    i++;
                }
            }else{
                System.out.println("Valor erroneo");
            }  
        }
        
        
        public static void acumuladores(){
            
            int numeros = 0;
            int suma = 0;       // Acumulador.
        
            for (int j = 0; j < 10; j++) {
            
                System.out.println("\nIngrese un número entero: ");
                try{
                    numeros = leer.nextInt();
                }catch(Exception e){
                    e.printStackTrace();
                    System.out.println("Valor erroneo");
                    break;
                }
            
                suma += numeros;
            
            }
        
            System.out.println("El resultado de la suma es: " + suma);
        }
        
        public static void conmutadores(){
            
            int producto = 1;
            int numeros = 0;        // Almacenar los números ingresados por el usuario.
            boolean terminar = false;   // CONMUTADOR.
            
            while(terminar == false){
                
                System.out.println("Ingrese un numero entero positivo: ");
                try{
                    numeros = leer.nextInt();
                }catch(Exception e){
                    e.printStackTrace();
                    System.out.println("Valor erroneo");
                    break;
                }
                
                if (numeros < 0){
                    terminar = true;
                }else{
                    producto *= numeros;
                }   
            }
            
            System.out.println("El resultado es: " + producto);
            
        }

}
