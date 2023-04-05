package andres.marulanda.javaparanovatoscap3;
/*** @author Andres-Marulanda*/

import java.util.ArrayList;
import java.util.List;

public class ProbarClases2 {

    // Objeto de la clase NumerosEnteros.
    static NumerosEnteros numeroEntero = new NumerosEnteros();
    static NumerosReales numeroReal = new NumerosReales();
    
    public static void main(String[] args) {
       
        // Invocar el método para generar una tabla de multiplicar.
        probarTablasDeMultiplicar();
        // Invocar el método paa probar estaditica básica.
        probarEstadisticaBasica();
        // Invocar el método para probar Materia
        probarMateria();
        // Invocar el método para generar la seria de fibonacci.
        serieFibonacci();
    }
    
    public static void probarTablasDeMultiplicar(){
        
        byte numero = (byte) numeroEntero.leerNumeroEntero("Ingrese un número entre 1 y 10: ");
        
        if (numero >= 1 && numero <= 10){
            numeroEntero.tablasDeMultiplicar(numero);
        }else{
            System.err.println("Error, ingrese un número entre 1 y 10.");
        }  
    }
    
    public static void probarEstadisticaBasica(){
        
        float [] muestra = new float [0];
        short tamañoMuestra = (short) numeroEntero.leerNumeroEntero("\nIngrese el tamaño de la muestra: ");
        
        if (tamañoMuestra < 0){
            System.err.println("\nError, ingrese un número mayor que cero.");
        }else{
            muestra = new float [tamañoMuestra];
            
            for (short i = 0; i < tamañoMuestra; i++){
            
                float datoMuestra = numeroReal.leerNumeroReal();
                muestra[i] = datoMuestra;   
            }
        }
        
        // Objeto de la clase EstadisticaBasica.
        EstadisticaBasica estadistica = new EstadisticaBasica (tamañoMuestra, muestra);
        
        // Hallar el valor máximo.
        float valorMaximo = estadistica.valorMaximo();
        System.out.println("\nEl valor máximo es: " + valorMaximo);
        
        // Hallar el valor mínimo.
        float valorMinimo = estadistica.valorMinimo();
        System.out.println("El valor mínimo es: " + valorMinimo);
        
        // Hallar el rango.
        estadistica.rango(valorMaximo, valorMinimo);
        
        // Hallar la media.
        float media = estadistica.media();
        System.out.println("El valor de la media es: " + media);
        
        // Hallar la mediana.
        float mediana = estadistica.mediana();
        System.out.println ("el valor de la mediana es: " + mediana);
        
        // Hallar la Varianza.
        float varianza = estadistica.varianza();
        System.out.println("El valor de la varianza es: " + varianza);
        
        // Hallar la desviación Típica
        float desviacion = estadistica.desviacionEstandar();
        System.out.println("El valor de la desviación típica es: " + desviacion);
    }
    
    public static void probarMateria(){
        Materia materia = new Materia();
        byte aprobados = 0;
        byte reprobados = 0;
        byte [] aproRepro = materia.aproboReprobo();
        
        aprobados = aproRepro[0];
        reprobados = aproRepro[1];
        
        System.out.println("Aprobaron: " + aprobados + " y Reprobaron: " + reprobados + " Alumnos");
    }
    
    public static void serieFibonacci(){
        
        // Declarar un arreglo normal e inmodificable: 
        // tipo_dato [] nombre_arreglo = new tipo_dato [tamaño];
        
        String mensaje = "Ingrese la cantidad de datos de la serie: ";
        byte numeroDatos = (byte) numeroEntero.leerNumeroEntero(mensaje);
        
        // Creamos un ArrayList vacio.
        ArrayList fibonacci = new ArrayList();
        fibonacci.add(0);
        fibonacci.add(1);
        
        byte contador = 0;
        
        while (contador < numeroDatos - 2){
            int n1 = (int) fibonacci.get(contador);
            int n2 = (int) fibonacci.get(contador + 1);
            int n3 = n1 + n2;
            fibonacci.add(n3);
            contador++;
        }
        
        // Imprimir la serie.
        System.out.println("Serie de fibonacci: ");
        for (Object i : fibonacci) {
            System.out.print(i + " ");   
        }
        
    }
    
}
