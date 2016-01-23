/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Persona;
import Persistencia.NewHibernateUtil;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author User
 */
public class PersonaDaoImplement  implements  PersonaDao{

    @Override
    public List<Persona> mostrarPersonas() {
      Session session=null;
      List<Persona> lista=null;
        try {
            session= NewHibernateUtil.getSessionFactory().openSession();
            Query query=session.createQuery("from Persona");
            lista=(List<Persona>) query.list();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }finally{
        
        if(session!=null){
            session.close();
        }
        }
        return lista;
    }

    @Override
    public void insertarPersona(Persona persona) {
        Session session=null;
      
        try {
            session= NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(persona);
            session.getTransaction().commit();
            
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }finally{
        
        if(session!=null){
            session.close();
        }
        }
       
    }

    @Override
    public void modificarPersona(Persona persona) {
       Session session=null;
      
        try {
            session= NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(persona);
            session.getTransaction().commit();
            
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }finally{
        
        if(session!=null){
            session.close();
        }
        }
    }

    @Override
    public void eliminarPersona(Persona persona) {
        Session session=null;
      
        try {
            session= NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(persona);
            session.getTransaction().commit();
            
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }finally{
        
        if(session!=null){
            session.close();
        }
        }
    }
    
}
