package andres.marulanda.javaparanovatoscap3;

import java.util.Scanner;

public class EstructurasRepetitivas {

    
    public static void main(String[] args) {
        
        // implementar un ciclo o bucle while que muestre en pantalla los números del 1 al 20.
        
        // Declarar e inicializar la variable de control.
        byte control_1 = 1;
        while(control_1 <= 20){
            
            System.out.println("Número: " + control_1);
            
            //Incrementar la variable de control.
            control_1 += 1;
        }
        
        // Implementar un ciclo do while que muestre en pantalla un mensaje un número determinado de veces.
        
        // Declarar e inicializar la variable de control.
        byte control_2 = 1;
        do {
            
            System.out.println("\nHola, eres el usuario número " + control_2);
            control_2++;
            
        } while(control_2 <= 20);
        
        // Implementar un ciclo for para imprimir los numeros pares entre 0 y 50;
        
        // Declarar la variable de control.
        // for (int i = 0; i < 10; i++)
        
        byte control_3;
        for (control_3 = 0; control_3 <= 50; control_3 += 2){
            
            System.out.println("\nNúmero par: " + control_3);
        }    
    }   
}
