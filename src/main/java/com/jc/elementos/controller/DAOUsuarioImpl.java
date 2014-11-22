/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.controller;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *  
 * @author T107
 */
public class DAOUsuarioImpl {
    private Object HibernateUtilidades;
   public String ObtenerTodos() throws Exception {
       SessionFactory factory=HibernateUtilidades.getSessionFactory();
       Session sesion= factory.openSession();
       
       Transaction tranza= sesion.beginTransaction();
       
       Criteria cri=sesion.createCriteria(usuario.class);
       ArrayList<usuario> usuarios= (ArrayList=<usuario>)cri.list();
       
       ObjectMapper mapper=new ObjectMapper();
       
       tranza.commit();
      sesion.close(); 
      return mapper.writeValueAsString(usuarios);
               
   } 
}
