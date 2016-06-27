/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbw.siegrist.hotel.persitance;

import ch.bbw.siegrist.hotel.persitance.entity.Benutzer;
import ch.bbw.siegrist.hotel.persitance.entity.Kunden;
import ch.bbw.siegrist.hotel.persitance.entity.Buchung;
import ch.bbw.siegrist.hotel.persitance.entity.Leistung;
import ch.bbw.siegrist.hotel.persitance.entity.Position;
import ch.bbw.siegrist.hotel.persitance.interfaces.IDB;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author 5ia13nosiegrist
 */
public class JPAHibernateDB implements IDB{
    private Session session;
    public JPAHibernateDB(){
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        StandardServiceRegistryBuilder ssrb = 
            new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory factory = configuration.buildSessionFactory(ssrb.build());
        session = factory.openSession();
    }
    
    @Override
    public boolean createKunde(Kunden client) {
        int id=0;
        Transaction t = session.beginTransaction();
        id = (Integer) session.save(client);
        t.commit();
        if(id!=0)
            return true;
        return false;
    }

    @Override
    public boolean createBenutzer(Benutzer benutzer) {
        Transaction t = session.beginTransaction();
        session.save(benutzer);
        t.commit();
        return true;
    }
    
    @Override
    public boolean createBuchung(Buchung buchung) {
        Transaction t = session.beginTransaction();
        session.save(buchung);
        t.commit();
        return true;
    }
    
    @Override
    public boolean createPosition(Position position) {
        Transaction t = session.beginTransaction();
        session.save(position);
        t.commit();
        return true; }

    @Override
    public Kunden getKunde(int id) {
        return (Kunden)session.get(Kunden.class, id);
    }

    @Override
    public Leistung getLeistung(int id) {
        return (Leistung)session.get(Leistung.class, id);
    }

    @Override
    public Benutzer getBenutzer(int id) {
        return (Benutzer)session.get(Benutzer.class, id);
    }

    @Override
    public Buchung getBuchung(int id) {
        return (Buchung)session.get(Buchung.class, id);
    }
    
}
