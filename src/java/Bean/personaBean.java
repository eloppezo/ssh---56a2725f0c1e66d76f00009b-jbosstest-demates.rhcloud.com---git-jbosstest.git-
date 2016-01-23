/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.PersonaDao;
import DAO.PersonaDaoImplement;
import Model.Persona;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

/**
 *
 * @author User
 */
@ManagedBean
@ViewScoped
public class personaBean {
    Persona persona;
    List<Persona> personas;
    /**
     * Creates a new instance of personaBean
     */
    public personaBean() {
        persona = new Persona();
    }

    
    public void insertar(){
    PersonaDao linkDAO= new PersonaDaoImplement();
        linkDAO.insertarPersona(persona);
        persona= new Persona();
    }
    public void modificar(){
    PersonaDao linkDAO= new PersonaDaoImplement();
        linkDAO.modificarPersona(persona);
        persona= new Persona();
    }
    public void eliminar(){
    PersonaDao linkDAO= new PersonaDaoImplement();
        linkDAO.eliminarPersona(persona);
        persona= new Persona();
    }
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getPersonas() {
        PersonaDao linkDAO= new PersonaDaoImplement();
        personas=linkDAO.mostrarPersonas();
        return personas;
    }
    

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    
    
}
