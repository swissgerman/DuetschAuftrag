package ch.bbw.githotel.beans;

import ch.bbw.siegrist.hotel.persitance.JPAHibernateDB;
import ch.bbw.siegrist.hotel.persitance.entity.Buchung;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


@ManagedBean
@SessionScoped
public class NavigationBean {
        //@ManagedProperty(value="#{jPAHibernateDB}")
        private JPAHibernateDB db;
	private String page;
        private Buchung editBuchung;
        private int kunde;
	public NavigationBean() {
            page = "index";
            editBuchung = new Buchung();
	}

    /**
     * @return the page
     */
    public String getPage() {
        return page;
    }

    
    public String setPage(String page) {
        this.page = page;
        return page+".xhtml";
    }
    public String isPageUsed(String page) {
        if(this.page.equals(page)){
            return "used";
        }
        return "";
    }

    /**
     * @return the editBuchung
     */
    public Buchung getEditBuchung() {
        return editBuchung;
    }

    /**
     * @param editBuchung the editBuchung to set
     * @return 
     */
    public String setEditBuchung(Buchung editBuchung) {
        if(!editBuchung.isAbgeschlossen()){
            this.editBuchung = editBuchung;
            return "buchungerstellen.xhtml";
        }else{
            this.editBuchung = new Buchung();
            return "#";
        }
    }
    public String save(){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        db = (JPAHibernateDB)facesContext.getCurrentInstance().getExternalContext().getSessionMap().get("jPAHibernateDB");
        editBuchung.setKunden(db.getKunde(kunde));
        boolean r = db.createBuchung(editBuchung);
        if(r){
            editBuchung = null;
            return "viewallbuchungen.xhtml";
        }
        return "index.xhtml";
    }

    /**
     * @return the kunde
     */
    public int getKunde() {
        return kunde;
    }

    /**
     * @param kunde the kunde to set
     */
    public void setKunde(int kunde) {
        this.kunde = kunde;
    }
	
}
