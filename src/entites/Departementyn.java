package entites;
// Generated 2019-04-10 09:40:26 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Departementyn generated by hbm2java
 */
public class Departementyn  implements java.io.Serializable {


     private String idd;
     private String nomdepartement;
     private String telephone;
     private Set employeeyns = new HashSet(0);

    public Departementyn() {
    }

	
    public Departementyn(String idd, String nomdepartement) {
        this.idd = idd;
        this.nomdepartement = nomdepartement;
    }
    public Departementyn(String idd, String nomdepartement, String telephone, Set employeeyns) {
       this.idd = idd;
       this.nomdepartement = nomdepartement;
       this.telephone = telephone;
       this.employeeyns = employeeyns;
    }
   
    public String getIdd() {
        return this.idd;
    }
    
    public void setIdd(String idd) {
        this.idd = idd;
    }
    public String getNomdepartement() {
        return this.nomdepartement;
    }
    
    public void setNomdepartement(String nomdepartement) {
        this.nomdepartement = nomdepartement;
    }
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public Set getEmployeeyns() {
        return this.employeeyns;
    }
    
    public void setEmployeeyns(Set employeeyns) {
        this.employeeyns = employeeyns;
    }




}


