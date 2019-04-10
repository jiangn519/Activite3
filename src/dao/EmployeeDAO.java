/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import activite3.HibernateUtil;
import entites.Departementyn;
import entites.Employeeyn;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author 1895213
 */
public class EmployeeDAO {
        static Session session = null;

    public static void insert(Employeeyn emp1) {

        session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.save(emp1);

        tx.commit();
        session.close();
    }
    
    public static void updateName(Employeeyn em, String name) {

        session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();
        em.setNom(name);

        session.update(em);

        tx.commit();
        session.close();

    }
    
    public static void delete(Employeeyn em) {

        session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.delete(em);

        tx.commit();
        session.close();
    }
    
    
    public static void allEmployee() {
        session = HibernateUtil.getSessionFactory().openSession();

        Query query = session.createQuery("from Employeeyn");
        List<Employeeyn> results = query.list();

        for (Employeeyn line : results) {
            System.out.println(" La matricule du Employée : " + line.getMatricule());
            System.out.println(" Le nom du Employée : " + line.getNom());
            System.out.println(" Le prénom du Employée : " + line.getPrenom());
            System.out.println(" Le salaire du Employée : " + line.getSalaire());
            
            System.out.println(" Le nom du Departement : " + line.getDepartementyn().getNomdepartement());
             System.out.println(" Le telphone du Departement : " + line.getDepartementyn().getTelephone());
           
            System.out.println(" //////////////////////////////////// ");
        }

        session.close();
    }

        public static void singleEmployee(String matricule) {
        session = HibernateUtil.getSessionFactory().openSession();

        Query query = session.createQuery("from Employeeyn E where E.matricule= :empMat");
        query.setParameter("empMat", matricule);
        List<Employeeyn> results = query.list();

        for (Employeeyn line : results) {
            System.out.println(" La matricule du Employée : " + line.getMatricule());
            System.out.println(" Le nom du Employée : " + line.getNom());
            System.out.println(" Le prénom du Employée : " + line.getPrenom());
            System.out.println(" Le salaire du Employée : " + line.getSalaire());
            System.out.println(" Le nom du Departement : " + line.getDepartementyn().getNomdepartement());
            System.out.println(" Le telphone du Departement : " + line.getDepartementyn().getTelephone());
            
            
            System.out.println(" //////////////////////////////////// ");
        }

        session.close();
    }
    
    
}
