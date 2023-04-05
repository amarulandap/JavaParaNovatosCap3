package andres.marulanda.javaparanovatoscap3;
/*** @author Andres-Marulanda*/

public class ProbarClases1 {
    
    // Crear una variable global del tipo PositivoONegativo.
    static NumerosReales numeroReal = new NumerosReales();
    // Crear una variable global del tipo Restar.
    static NumerosEnteros numeroEntero = new NumerosEnteros ();

    public static void main(String[] args) {
      
       // Invocar el método para probar la clase PositivoONegativo.
       probarPositivoOnegativo();
        
       // Invocar el método para probar la clase Restar.
       probarRestar();
       
       // Invocar el método para determinar si un número tiene parte decimal
       probarParteDecimal();
       
       // Invocar el método para contar las cifras de un número
       probarContarCifras();
       
       // Invocar el método para determinar la cantidad de números pares.
       probarContarPares();
       
       // Invocar el método para imprimir los números pares o impares en un rango determinado.
       probarImprimirParesOImpares();
        
    }

    public static void probarPositivoOnegativo() {
       
        float numero = numeroReal.leerNumeroReal();
        numeroReal.positivoOnegativo(numero);
        
    }
    
    public static void probarRestar (){
        
        int primerNumero = numeroEntero.leerNumeroEntero("Ingrese el primer operando: ");
        int segundoNumero = numeroEntero.leerNumeroEntero("Ingrese el segundo operando: ");
        int [] datosDiferencia = numeroEntero.numeroMayor(primerNumero, segundoNumero);
        int mayor = datosDiferencia [0];
        int menor = datosDiferencia [1];
        int resultadoResta = numeroEntero.restar(mayor, menor);
        System.out.println("El resultado de la resta es: " + mayor + " - " + menor + " = " + resultadoResta);
        
    }
    
    public static void probarParteDecimal (){
        
        float numero = numeroReal.leerNumeroReal();
        numeroReal.parteDecimal(numero);
    }
    
    public static void probarContarCifras (){
        
        int numero = numeroEntero.leerNumeroEntero("\nIngrese un número de máximo 5 cifras: ");
        numeroEntero.contarCifras(numero);
    }
    
    public static void probarContarPares (){
        
        int A = numeroEntero.leerNumeroEntero("\nIngrese el límite inferior: ");
        int B = numeroEntero.leerNumeroEntero("Ingrese el límite superior: ");
        
        // Asumimos que B es mayor que A.
        numeroEntero.contarPares(A, B);
    }
    
    public static void probarImprimirParesOImpares(){
        
        String mensaje = "\nSeleccione una opción: " + "1. Imprimir Pares " + "2. Imprimir Impares";
        
        byte opcion = (byte) numeroEntero.leerNumeroEntero(mensaje); // Se hace le casteo ya que el método retorna un número entero.
        int A = numeroEntero.leerNumeroEntero("Ingrese el límite inferior: ");
        int B = numeroEntero.leerNumeroEntero("Ingrese el límite superior: ");
        int [] limitesIntervalo = numeroEntero.numeroMayor(A, B);
        int mayor = limitesIntervalo [0];
        int menor = limitesIntervalo [1];
        numeroEntero.imprimirParesOImpares(menor, mayor, opcion);
        
    }
    
}
