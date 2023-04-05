package andres.marulanda.javaparanovatoscap3;
/**
 * @author Andres-Marulanda
 */

import java.util.Scanner;

public class EstructurasSelectivas {

    static Scanner leer = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        // Estructura selectiva simple. Calcular el área y el perímetro de un rectangulo.
        
        float base = 0;
        float altura = 0;
        float area = 0;
        float perimetro = 0;
        
        System.out.println("base = ");
        try{
            base = leer.nextFloat();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        System.out.println("Altura = ");
        try{
            altura = leer.nextFloat();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        if (base > 0 && altura > 0){
            area = base * altura;
            perimetro = (2 * altura)+(2 * base);
            
            System.out.println("Área = " + area + " Perimetro = " + perimetro);
        }
        
        if (base <= 0 || altura <= 0){
            System.out.println("Datos incorrectos");
        }
        
        // Estructura selectiva doble. Surpimimos la segunda condicional y la remplazamos por una opción else.
        
        if (base > 0 && altura > 0){
            area = base * altura;
            perimetro = (2 * altura)+(2 * base);
            
            System.out.println("Área = " + area + " Perimetro = " + perimetro);
            
        }else{
             System.out.println("Datos incorrectos");
        }
        
        // Estrutura selectiva múltiple else if.
        
        byte dia = 0;
        
        System.out.println("Ingrese un valor entre 1 y 7: ");
        try{
            dia = leer.nextByte();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        if (dia == 1){
            System.out.println("Lunes");
        }else if(dia == 2){
            System.out.println("Martes");
        }else if(dia == 3){
            System.out.println("Miercoles");
        }else if(dia == 4){
            System.out.println("Jueves");
        }else if(dia == 5){
            System.out.println("Viernes");
        }else if(dia == 6){
            System.out.println("Sabado");
        }else if(dia == 7){
            System.out.println("Domingo");
        }else{
            System.out.println("Dato incorrecto");
        }
        
        // Estructura selectiva multiple switch.
        
        switch(dia){
            case 1:
               System.out.println("Lunes");
               break;
            case 2:
               System.out.println("Martes");
               break;
            case 3:
               System.out.println("Miercoles");
               break;
            case 4:
               System.out.println("Jueves");
               break;
            case 5:
               System.out.println("Viernes");
               break;
            case 6:
               System.out.println("Sabado");
               break;
            case 7:
               System.out.println("Domingo");
               break;
            default:
               System.out.println("Dato incorrecto");   
        } 
    }
    
}
