package andres.marulanda.javaparanovatoscap3;
/** @author Andres-Marulanda*/

// Clase que resta siempre el número menor del mayor.

import java.util.Scanner;

public class NumerosEnteros {

    // Atributos
    
    // Constructor
    
    public NumerosEnteros() {
    }
    
    // Método para leer números enteros.
    
    public int leerNumeroEntero(String mensaje){
        
        Scanner leer = new Scanner (System.in);
        
        int numero = 0;
        
        System.out.println(mensaje);
        try{
            numero = leer.nextInt();            
        }catch(Exception e){
            // e.printStackTrace();
            System.err.println("Valor erroneo"); 
        } 
        return numero;
    }
    
    // Determinar cual es el número mayor.
    
    public int [] numeroMayor (int numero1, int numero2){
        
        int primerNumero = numero1;
        int segundoNumero = numero2;
        int mayor;
        int menor;
        
        if (numero1 > numero2){
            mayor = numero1;
            menor = numero2;
        }else{
            mayor = numero2;
            menor = numero1;
        }
        return new int []{mayor, menor};
    }
    
    // Realizar la resta de los dos números. Número1 siempre tiene que ser el número mayor.
    
    public int restar (int numero1, int numero2){
        
        int resultado = 0;
        int mayor = numero1;
        int menor = numero2;
        
        resultado = mayor - menor;
        
        return resultado;
    }
    
    // Método para contar las cifras de un número.
    
    public void contarCifras (int numero){
        
        int numero1 = numero;
        int cocienteNumero = 0;
        int cifras = 0;
        
        if (numero1 >= 0){
            cocienteNumero = numero1 / 10;
        }else{
            cocienteNumero = numero1 / -10;
        }
        
        if (cocienteNumero == 0){
            cifras = 1;
        }else if(cocienteNumero >= 1 && cocienteNumero <= 9){
            cifras = 2;
        }else if (cocienteNumero >= 10 && cocienteNumero <= 99){
            cifras = 3;
        }else if(cocienteNumero >= 100 && cocienteNumero <= 999){
            cifras = 4;
        }else if (cocienteNumero >= 1000 && cocienteNumero <= 9999){
            cifras = 5;
        }else{
            cifras = 0;
        }
        
        if (cifras == 0){
            System.out.println("El número " + numero1 + " tiene mas de cinco cifras");
        }else{
            System.out.println("El número " + numero1 + " tiene " + cifras + " cifras.");
        }
    }
    
    // Método para contar el total de números pares en un intervalo determinado por el usuario
    
    public void contarPares (int numero1, int numero2){
        
        int A = numero1;
        int B = numero2;
        
        if (B < A){
            System.out.println("Error, el segundo número debe ser mayor que el primero");
        }else{
            
            int contador = A;
            int residuoNumero = 0;
            int pares = 0;
            
            while (contador >= A && contador <= B){
                residuoNumero = contador % 2;
                if (residuoNumero == 0){
                    pares += 1;
                }
                contador++;
            }
            System.out.println("La cantidad de números pares que hay entre " + A + " y " + B + " es: " + pares);
        }
    }
    
    // Método para imprimir en pantalla los números pares o impares.
    
    public void imprimirParesOImpares (int menor, int mayor, byte opcion){
        
        int A = menor;
        int B = mayor;
        byte opcion1 = opcion;
        
        // Si la opción seleccionada fue 1 imprimir los pares, si fue 2, imprimir los impares.
        
        if (opcion == 1){
            int contador = A;
            int residuoNumero = 0;
            System.out.println("\nNúmeros pares: ");
            
            while (contador >= A && contador <= B){
                residuoNumero = contador % 2;
                if (residuoNumero == 0){
                    System.out.print(contador + " , ");
                }
                contador++;
            }
        }else if (opcion == 2){
            int contador = A;
            int residuoNumero = 0;
            System.out.println("\nNúmeros impares: ");
            
            while (contador >= A && contador <= B){
                residuoNumero = contador % 2;
                if (residuoNumero != 0){
                    System.out.print(contador + " , ");
                }
                contador++;
            }
        }else{
            System.out.println("\nOpción erronea, ingrese una opción valida");
        }
    }
    
    // Método para generar las tablas de multiplicar.
    
    public void tablasDeMultiplicar (byte numero){
        
        byte numero1 = numero;
        
        System.out.println("\nTabla de multiplicar del número " + numero1 + " : ");
        
        for (int i = 1; i <= 10; i++) {
            byte resultado = (byte) (numero1 * i);
            System.out.println(numero1 + " X " + i + " = " + resultado);
            
        }
    }
        
    
}
