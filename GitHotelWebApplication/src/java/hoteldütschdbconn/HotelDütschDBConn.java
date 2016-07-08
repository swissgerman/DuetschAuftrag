<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoteldütschdbconn;

import ch.bbw.siegrist.hotel.persitance.JPAHibernateDB;
import ch.bbw.siegrist.hotel.persitance.entity.Buchung;
import ch.bbw.siegrist.hotel.persitance.entity.Position;
import ch.bbw.siegrist.hotel.persitance.entity.Kunden;
import ch.bbw.siegrist.hotel.persitance.interfaces.IDB;
import java.math.BigDecimal;
import java.sql.Date;



/**
 *
 * @author 5ia13nosiegrist
 */
public class HotelDütschDBConn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IDB db = new JPAHibernateDB();
        if(!db.createKunde(new Kunden("Noah", "Siegrist", "Edelweissstrasse", "Dietikon", "Herr", "0795354514", null, null)))
            System.err.println("Fatal error!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");    
        System.out.println("All Good:D");
        Buchung b = new Buchung(db.getKunde(1), new Date(1, 1, 2015), new Date(1, 2, 2016), true, null);
        db.createBuchung(b);
        System.out.println("gaga" + b.getBuchungId());
        Position p1 = new Position(db.getBenutzer(1), b, db.getLeistung(1), 2, BigDecimal.valueOf(20.5), new Date(2, 1, 2016));
        db.createPosition(p1);
        Position p2 = new Position(db.getBenutzer(5), db.getBuchung(1), db.getLeistung(2), 2, BigDecimal.valueOf(20.5), new Date(2, 1, 2016));
        db.createPosition(p2);
        
        
    }
    
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoteldütschdbconn;

import ch.bbw.siegrist.hotel.persitance.JPAHibernateDB;
import ch.bbw.siegrist.hotel.persitance.entity.Buchung;
import ch.bbw.siegrist.hotel.persitance.entity.Position;
import ch.bbw.siegrist.hotel.persitance.entity.Kunden;
import ch.bbw.siegrist.hotel.persitance.interfaces.IDB;
import java.math.BigDecimal;
import java.sql.Date;



/**
 *
 * @author 5ia13nosiegrist
 */
public class HotelDütschDBConn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IDB db = new JPAHibernateDB();
        if(!db.createKunde(new Kunden("Noah", "Siegrist", "Edelweissstrasse", "Dietikon", "Herr", "0795354514", null, null)))
            System.err.println("Fatal error!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");    
        System.out.println("All Good:D");
        Buchung b = new Buchung(0, db.getKunde(1), new Date(1, 1, 2015), new Date(1, 2, 2016), true, null);
        db.createBuchung(b);
        System.out.println("gaga" + b.getBuchungId());
        Position p1 = new Position(db.getBenutzer(1), b, db.getLeistung(1), 2, BigDecimal.valueOf(20.5), new Date(2, 1, 2016));
        db.createPosition(p1);
        Position p2 = new Position(db.getBenutzer(5), db.getBuchung(1), db.getLeistung(2), 2, BigDecimal.valueOf(20.5), new Date(2, 1, 2016));
        db.createPosition(p2);
        
        
    }
    
    
}
>>>>>>> f5e194ae612815c0ac9626e5ec8d1446787cf172
