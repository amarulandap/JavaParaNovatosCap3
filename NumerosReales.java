package andres.marulanda.javaparanovatoscap3;
/**@author Andres-Marulanda*/

import java.util.Scanner;

public class NumerosReales {

    // Atributos
    
    // Constructor
    
    public NumerosReales() {
    }
    
    // Setters and Getters
    
    // Método para leer números reales.
    
    public float leerNumeroReal (){
        
        Scanner leer = new Scanner (System.in);
        
        float numero = 0;
        
        System.out.println("\nIngrese un número : ");
        try{
            numero = leer.nextFloat();
        }catch(Exception e){
            // e.printStackTrace();
            System.err.println("Valor erroneo"); 
        } 
        return numero;
    }
    
    // Detereminar si un número es positivo o negativo.
    
    public void positivoOnegativo (float numero){
        
        float numero1 = numero;
        
        if (numero1 < 0){
            System.out.println("\nEl número: " + numero1 + " es un número negativo");
        }else{
            System.out.println("\nEl número: " + numero1 + " es un número positivo");
        }   
    } 
    
    // Determinar si el número real tiene parte fraccionaria.
    
    public void parteDecimal (float numero){
        
        // Math.round : redondear el número al entero mas cercano.
        // Math.trunc : retornar la parte entera de un número decimal.
        
        float numero1 = numero;
        int redondeo = Math.round(numero1);     // Número redondeado.
        
        float diferencia = numero1 - redondeo;
        if (diferencia != 0){
            System.out.println("\nEl número " + numero1 + " es un número real");
        }else{
            System.out.println("\nEl número " + numero1 + " es un número entero");
        }
    }
}
