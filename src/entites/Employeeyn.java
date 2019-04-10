package entites;
// Generated 2019-04-10 09:40:26 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Employeeyn generated by hbm2java
 */
public class Employeeyn  implements java.io.Serializable {


     private String matricule;
     private Departementyn departementyn;
     private String nom;
     private String prenom;
     private BigDecimal salaire;

    public Employeeyn() {
    }

	
    public Employeeyn(String matricule, String nom, String prenom) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }
    public Employeeyn(String matricule, Departementyn departementyn, String nom, String prenom, BigDecimal salaire) {
       this.matricule = matricule;
       this.departementyn = departementyn;
       this.nom = nom;
       this.prenom = prenom;
       this.salaire = salaire;
    }
   
    public String getMatricule() {
        return this.matricule;
    }
    
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public Departementyn getDepartementyn() {
        return this.departementyn;
    }
    
    public void setDepartementyn(Departementyn departementyn) {
        this.departementyn = departementyn;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public BigDecimal getSalaire() {
        return this.salaire;
    }
    
    public void setSalaire(BigDecimal salaire) {
        this.salaire = salaire;
    }




}

