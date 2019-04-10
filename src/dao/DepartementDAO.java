/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import activite3.HibernateUtil;
import static dao.EmployeeDAO.session;
import entites.Departementyn;
import entites.Employeeyn;
import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author 1895213
 */
public class DepartementDAO {

    static Session session = null;

    public static void insert(Departementyn dep) {

        session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.save(dep);

        tx.commit();
        session.close();

    }

    public static void updateTel(Departementyn dep, String tel) {

        session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();
        dep.setTelephone(tel);

        session.update(dep);

        tx.commit();
        session.close();

    }

    public static void delete(Departementyn dep) {

        session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.delete(dep);

        tx.commit();
        session.close();
    }

    public static void allDepartement() {
        session = HibernateUtil.getSessionFactory().openSession();

        Query query = session.createQuery("from Departementyn");
        List<Departementyn> results = query.list();

        for (Departementyn line : results) {
            System.out.println(" La numéro du Departement : " + line.getIdd());
            System.out.println(" Le nom du Departement : " + line.getNomdepartement());
            System.out.println(" Le téléphone du Departement : " + line.getTelephone());
            Set<Employeeyn> emlist = line.getEmployeeyns();
            for (Employeeyn temp : emlist) {
                System.out.println("\t La matricule du Employée : " + temp.getMatricule());
                System.out.println("\t Le nom du Employée : " + temp.getNom());
                System.out.println("\t Le prénom du Employée : " + temp.getPrenom());
                System.out.println("\t Le salaire du Employée : " + temp.getSalaire());
                System.out.println(" ---------------------------------------------------- ");
            }

            System.out.println(" //////////////////////////////////// ");
        }

        session.close();
    }

    public static void singleDepartement(String id) {
        session = HibernateUtil.getSessionFactory().openSession();

        Query query = session.createQuery("from Departementyn D where D.idd= :depid");
        query.setParameter("depid", id);
        List<Departementyn> results = query.list();

        for (Departementyn line : results) {
            System.out.println(" La numéro du Departement : " + line.getIdd());
            System.out.println(" Le nom du Departement : " + line.getNomdepartement());
            System.out.println(" Le téléphone du Departement : " + line.getTelephone());
            Set<Employeeyn> emlist = line.getEmployeeyns();
            for (Employeeyn temp : emlist) {
                System.out.println("\t La matricule du Employée : " + temp.getMatricule());
                System.out.println("\t Le nom du Employée : " + temp.getNom());
                System.out.println("\t Le prénom du Employée : " + temp.getPrenom());
                System.out.println("\t Le salaire du Employée : " + temp.getSalaire());
                System.out.println(" ---------------------------------------------------- ");
            }

            session.close();
        }

    }
    
    public static void groupEmployee() {
        session = HibernateUtil.getSessionFactory().openSession();

        Query query = session.createQuery("select D.idd,D.nomdepartement, count(E.matricule) from Employeeyn E inner join E.departementyn D group by D.idd,D.nomdepartement ");
        List<Object[]> results = query.list();

        for (Object[] line : results) {
            System.out.println(" Le numero de Departement : " + line[0]);
            System.out.println(" Le nom de Departement : " + line[1]);
            System.out.println(" Le nombre  de Employées : " + line[2]);
            System.out.println(" //////////////////////////////////// ");
        }

        session.close();
    }
    
        public static void moyenneSalaire() {
        session = HibernateUtil.getSessionFactory().openSession();

        Query query = session.createQuery("select D.idd,D.nomdepartement, avg(E.salaire) from Employeeyn E inner join E.departementyn D group by D.idd,D.nomdepartement ");
        List<Object[]> results = query.list();

        for (Object[] line : results) {
            System.out.println(" Le numero de Departement : " + line[0]);
            System.out.println(" Le nom de Departement : " + line[1]);
            System.out.println(" Le moyenne salaire de Employées : " + line[2]);
            System.out.println(" //////////////////////////////////// ");
        }

        session.close();
    }
}
