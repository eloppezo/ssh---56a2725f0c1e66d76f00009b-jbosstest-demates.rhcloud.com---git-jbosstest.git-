/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Persona;
import java.util.List;

/**
 *
 * @author User
 */
public interface PersonaDao {
    
    public List<Persona> mostrarPersonas();
    public void insertarPersona(Persona persona);
    public void modificarPersona(Persona persona);
    public void eliminarPersona(Persona persona);
   
}
