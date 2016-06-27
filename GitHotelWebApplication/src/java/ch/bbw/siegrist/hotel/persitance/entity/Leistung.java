package ch.bbw.siegrist.hotel.persitance.entity;
// Generated 23.05.2016 16:48:12 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Leistung generated by hbm2java
 */
public class Leistung  implements java.io.Serializable {


     private int leistungId;
     private String beschreibung;
     private BigDecimal vorschlagspreis;
     private Set positions = new HashSet(0);

    public Leistung() {
    }

	
    public Leistung(int leistungId, BigDecimal vorschlagspreis) {
        this.leistungId = leistungId;
        this.vorschlagspreis = vorschlagspreis;
    }
    public Leistung(int leistungId, String beschreibung, BigDecimal vorschlagspreis, Set positions) {
       this.leistungId = leistungId;
       this.beschreibung = beschreibung;
       this.vorschlagspreis = vorschlagspreis;
       this.positions = positions;
    }
   
    public int getLeistungId() {
        return this.leistungId;
    }
    
    public void setLeistungId(int leistungId) {
        this.leistungId = leistungId;
    }
    public String getBeschreibung() {
        return this.beschreibung;
    }
    
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }
    public BigDecimal getVorschlagspreis() {
        return this.vorschlagspreis;
    }
    
    public void setVorschlagspreis(BigDecimal vorschlagspreis) {
        this.vorschlagspreis = vorschlagspreis;
    }
    public Set getPositions() {
        return this.positions;
    }
    
    public void setPositions(Set positions) {
        this.positions = positions;
    }




}

