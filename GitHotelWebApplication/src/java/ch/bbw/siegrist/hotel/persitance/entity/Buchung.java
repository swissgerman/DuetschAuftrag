package ch.bbw.siegrist.hotel.persitance.entity;
// Generated 05.07.2016 18:51:09 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Buchung generated by hbm2java
 */
public class Buchung  implements java.io.Serializable {


     private int buchungId;
     private Kunden kunden;
     private Date ankunft;
     private Date abreise;
     private boolean abgeschlossen;
     private Set positions = new HashSet(0);

    public Buchung() {
    }

	
    public Buchung(int buchungId, boolean abgeschlossen) {
        this.buchungId = buchungId;
        this.abgeschlossen = abgeschlossen;
    }
    public Buchung(int buchungId, Kunden kunden, Date ankunft, Date abreise, boolean abgeschlossen, Set positions) {
       this.buchungId = buchungId;
       this.kunden = kunden;
       this.ankunft = ankunft;
       this.abreise = abreise;
       this.abgeschlossen = abgeschlossen;
       this.positions = positions;
    }
   
    public int getBuchungId() {
        return this.buchungId;
    }
    
    public void setBuchungId(int buchungId) {
        this.buchungId = buchungId;
    }
    public Kunden getKunden() {
        return this.kunden;
    }
    
    public void setKunden(Kunden kunden) {
        this.kunden = kunden;
    }
    public Date getAnkunft() {
        return this.ankunft;
    }
    
    public void setAnkunft(Date ankunft) {
        this.ankunft = ankunft;
    }
    public Date getAbreise() {
        return this.abreise;
    }
    
    public void setAbreise(Date abreise) {
        this.abreise = abreise;
    }
    public boolean isAbgeschlossen() {
        return this.abgeschlossen;
    }
    
    public void setAbgeschlossen(boolean abgeschlossen) {
        this.abgeschlossen = abgeschlossen;
    }
    public Set getPositions() {
        return this.positions;
    }
    
    public void setPositions(Set positions) {
        this.positions = positions;
    }




}


