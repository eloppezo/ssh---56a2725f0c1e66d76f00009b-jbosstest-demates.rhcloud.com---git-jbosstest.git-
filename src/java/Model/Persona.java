package Model;
// Generated 28-feb-2015 17:55:59 by Hibernate Tools 4.3.1



/**
 * Persona generated by hbm2java
 */
public class Persona  implements java.io.Serializable {


     private Integer idpersona;
     private String nombre;
     private String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
       this.nombre = nombre;
       this.apellido = apellido;
    }
   
    public Integer getIdpersona() {
        return this.idpersona;
    }
    
    public void setIdpersona(Integer idpersona) {
        this.idpersona = idpersona;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }




}


