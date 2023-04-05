package andres.marulanda.javaparanovatoscap3;
/**
 * @author Andres-Marulanda
 */
public class Alumno {
    
    // Atributos
    
    private String nombre;
    private String apellido;
    private int id;
    private byte curso;
    
    // Constructores

    public Alumno(String nombre, String apellido, int id, byte curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.curso = curso;
    }
    
    public Alumno(){
    
    }
    
    // Set and get
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setCurso(byte curso){
        this.curso = curso;
    }
    
    public String getNombre(){
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public int getId(){
        return id;
    }

    public byte getCurso() {
        return curso;
    }
     
}   
