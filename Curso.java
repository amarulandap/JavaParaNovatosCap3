package andres.marulanda.javaparanovatoscap3;
/**
 *
 * @author Andres-Marulanda
 */
public class Curso {
    
    // Atributos
    
    private byte grado;
    private String [] materias;
    private Alumno [] alumnos;
    
    // Constructores

    public Curso(byte grado, String[] materias, Alumno[] alumnos) {
        this.grado = grado;
        this.materias = materias;
        this.alumnos = alumnos;
    }

   public Curso(){
   
   }
   
    // Set and Get

    public byte getGrado() {
        return grado;
    }

    public void setGrado(byte grado) {
        this.grado = grado;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }
    
    
    
    
    
}
