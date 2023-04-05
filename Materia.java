package andres.marulanda.javaparanovatoscap3;
/**
 *
 * @author Andres-Marulanda
 */

import java.util.Scanner;

public class Materia {
    
    private short codigo;
    private String nombre;
    
    // Constructor
    
    public Materia (short codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public Materia(){
        
    }
    
    // Set and Get
    
    public void setCodigo(short codigo){
        this.codigo = codigo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public short getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    // Determinar aprobados y reprobados
    
    public byte [] aproboReprobo(){
        NumerosReales numeroReal = new NumerosReales();
        NumerosEnteros numeroEntero = new NumerosEnteros();
        boolean siguiente = true;
        float nota;         // Leer cada una de las notas ingresadas por el docente.
        byte aprobados = 0;
        byte reprobados = 0;
        byte opcion = 0;
        
        System.out.println("A continuación ingrese cada una de las notas de los alumnos: ");
        
        while (siguiente == true){
            nota = numeroReal.leerNumeroReal();
            
            if(nota >= 1 && nota <= 10){
                
                if(nota >= 6){
                    aprobados+=1;
                }else{
                    reprobados+=1;
                }
            }else{
                System.out.println("Nota erronea, debe ingresar una nota entre 1 y 10");
            }
            
            opcion = (byte) numeroEntero.leerNumeroEntero("Desea ingresar una nueva nota? 1. Si; 2. No");
            
            if(opcion == 2){
                siguiente = false;
            }else{
                siguiente = true;
            }
        }
        
        return new byte [] {aprobados, reprobados};
    }
}
