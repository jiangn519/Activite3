/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activite3;

import dao.DepartementDAO;
import dao.EmployeeDAO;
import entites.Departementyn;
import entites.Employeeyn;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 1895213
 */
public class Activite3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // insert des données departement et employées
//        System.out.println("Insérer des données des départements");
//
//        Departementyn dep1=new Departementyn("D1","Sales");
//        DepartementDAO.insert(dep1);
//        Departementyn dep2=new Departementyn("D2","HR");
//        DepartementDAO.insert(dep2);
//        Departementyn dep3=new Departementyn("D3","Informatique");
//        DepartementDAO.insert(dep3);
//        Departementyn dep4=new Departementyn("D4","Transport");
//        DepartementDAO.insert(dep4);
//        System.out.println("*************************************************");

//        System.out.println("Insérer des données des employées");
//        
//        Employeeyn em1=new Employeeyn("E00001",dep1,"Smith","John",new BigDecimal(4000));
//        Employeeyn em2=new Employeeyn("E00002",dep1,"Nan","Jiang",new BigDecimal(5000));
//        Employeeyn em3=new Employeeyn("E00003",dep2,"Yuni","Mendez",new BigDecimal(6000));
//        Employeeyn em4=new Employeeyn("E00004",dep2,"Joan","QQQQ",new BigDecimal(7000));
//        Employeeyn em5=new Employeeyn("E00005","Anie","Hannnn");
//        Employeeyn em6=new Employeeyn("E00006","Paul","Tiannnn");
//        
//        EmployeeDAO.insert(em1);
//        EmployeeDAO.insert(em2);
//        EmployeeDAO.insert(em3);
//        EmployeeDAO.insert(em4);
//        EmployeeDAO.insert(em5);
//        EmployeeDAO.insert(em6);
//
//        System.out.println("*************************************************");

        // Update des données des departement et des employees
//        System.out.println("Update des données des départements");
//
//        Departementyn dep1=new Departementyn("D1","Sales");
//        String tel="5140000000";
//        DepartementDAO.updateTel(dep1, tel);
//       System.out.println("*************************************************"); 
//        System.out.println("Update des données des employées");
//        Employeeyn em1=new Employeeyn("E00001",dep1,"Smith","John",new BigDecimal(4000));
//        String name="Zied";
//        EmployeeDAO.updateName(em1, name);
//        System.out.println("*************************************************");

        // Delete des données departement et employees   
//        System.out.println("Delete des données des employées");
//        Departementyn dep2=new Departementyn("D2","HR");
//        Employeeyn em4=new Employeeyn("E00004",dep2,"Joan","QQQQ",new BigDecimal(7000));
//        Employeeyn em6=new Employeeyn("E00006","Paul","Tiannnn");
//        EmployeeDAO.delete(em4);
//        EmployeeDAO.delete(em6);
//        System.out.println("*************************************************");
//
//        System.out.println("Delete des données des départements");
//        Departementyn dep4=new Departementyn("D4","Transport");
//        DepartementDAO.delete(dep4);
//        System.out.println("*************************************************");

        //Lister tous les enregistrments
        //afficher des informations des employées
        System.out.println("afficher toutes les informations des employées");
         EmployeeDAO.allEmployee();
        System.out.println("*************************************************");

        //afficher des informations des Departement
//        System.out.println("afficher toutes les informations des departements");
        // DepartementDAO.allDepartement();
//        System.out.println("*************************************************");

        // Afficher des informations des employées selon Matricule
//        System.out.println("Afficher des informations des employées selon Matricule");
//       String matricule="E00001";
//       EmployeeDAO.singleEmployee(matricule);
//        System.out.println("*************************************************");

        // Afficher des informations des departements selon idd
//        System.out.println("Afficher des informations des departements selon idd");
//       String idd="D1";
//      DepartementDAO.singleDepartement(idd);
//        System.out.println("*************************************************");

// Afficher des nombres des employées chaque departements
//        System.out.println("Afficher des nombres des employées chaque departements");
//DepartementDAO.groupEmployee();
//        System.out.println("*************************************************");

// Afficher le monyenne salaire chaque departements
//        System.out.println("Afficher le monyenne salaire chaque departements");
//        DepartementDAO.moyenneSalaire();
//        System.out.println("*************************************************");

        HibernateUtil.getSessionFactory().close();

    }

}
