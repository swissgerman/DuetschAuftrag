package ch.bbw.siegrist.hotel.persitance.entity;
// Generated 05.07.2016 18:51:09 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Kunden generated by hbm2java
 */
public class Kunden  implements java.io.Serializable {


     private Integer persId;
     private String vorname;
     private String name;
     private String strasse;
     private String ort;
     private String anrede;
     private String privattelefon;
     private Date eingabedatum;
     private Set buchungs = new HashSet(0);

    public Kunden() {
    }

	
    public Kunden(String vorname, String name) {
        this.vorname = vorname;
        this.name = name;
    }
    public Kunden(String vorname, String name, String strasse, String ort, String anrede, String privattelefon, Date eingabedatum, Set buchungs) {
       this.vorname = vorname;
       this.name = name;
       this.strasse = strasse;
       this.ort = ort;
       this.anrede = anrede;
       this.privattelefon = privattelefon;
       this.eingabedatum = eingabedatum;
       this.buchungs = buchungs;
    }
   
    public Integer getPersId() {
        return this.persId;
    }
    
    public void setPersId(Integer persId) {
        this.persId = persId;
    }
    public String getVorname() {
        return this.vorname;
    }
    
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getStrasse() {
        return this.strasse;
    }
    
    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }
    public String getOrt() {
        return this.ort;
    }
    
    public void setOrt(String ort) {
        this.ort = ort;
    }
    public String getAnrede() {
        return this.anrede;
    }
    
    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }
    public String getPrivattelefon() {
        return this.privattelefon;
    }
    
    public void setPrivattelefon(String privattelefon) {
        this.privattelefon = privattelefon;
    }
    public Date getEingabedatum() {
        return this.eingabedatum;
    }
    
    public void setEingabedatum(Date eingabedatum) {
        this.eingabedatum = eingabedatum;
    }
    public Set getBuchungs() {
        return this.buchungs;
    }
    
    public void setBuchungs(Set buchungs) {
        this.buchungs = buchungs;
    }




}


