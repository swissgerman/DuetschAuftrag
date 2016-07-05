/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbw.siegrist.hotel.persitance.interfaces;

import ch.bbw.siegrist.hotel.persitance.entity.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 5ia13nosiegrist
 */
public interface IDB {
    public boolean createKunde(Kunden client);
    public boolean createBenutzer(Benutzer benutzer);
    public boolean createBuchung(Buchung buchung);
    public boolean createPosition(Position position);
    
    
    public Kunden getKunde(int id);
    public Leistung getLeistung(int id);
    public Benutzer getBenutzer(int id);
    public Buchung getBuchung(int id);
    public List<Kunden> getKunden();
    public ArrayList<Buchung> getBuchungen();
}
