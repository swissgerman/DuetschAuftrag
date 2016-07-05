package ch.bbw.siegrist.hotel.persitance.entity;
// Generated 05.07.2016 18:51:09 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Benutzer generated by hbm2java
 */
public class Benutzer  implements java.io.Serializable {


     private Integer userId;
     private String benutzer;
     private String passwort;
     private String ganzerName;
     private Set positions = new HashSet(0);

    public Benutzer() {
    }

	
    public Benutzer(String benutzer, String passwort, String ganzerName) {
        this.benutzer = benutzer;
        this.passwort = passwort;
        this.ganzerName = ganzerName;
    }
    public Benutzer(String benutzer, String passwort, String ganzerName, Set positions) {
       this.benutzer = benutzer;
       this.passwort = passwort;
       this.ganzerName = ganzerName;
       this.positions = positions;
    }
   
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getBenutzer() {
        return this.benutzer;
    }
    
    public void setBenutzer(String benutzer) {
        this.benutzer = benutzer;
    }
    public String getPasswort() {
        return this.passwort;
    }
    
    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }
    public String getGanzerName() {
        return this.ganzerName;
    }
    
    public void setGanzerName(String ganzerName) {
        this.ganzerName = ganzerName;
    }
    public Set getPositions() {
        return this.positions;
    }
    
    public void setPositions(Set positions) {
        this.positions = positions;
    }




}


