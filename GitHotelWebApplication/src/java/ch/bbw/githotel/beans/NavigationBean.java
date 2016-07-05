package ch.bbw.githotel.beans;

import ch.bbw.siegrist.hotel.persitance.entity.Buchung;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class NavigationBean {
	private String page;
        private Buchung editBuchung;
	public NavigationBean() {
		page = "index";
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
     */
    public String setEditBuchung(Buchung editBuchung) {
        if(editBuchung.isAbgeschlossen()){
            this.editBuchung = editBuchung;
            return "buchungerstellen.xhtml";
        }else{
            this.editBuchung = null;
            return "#";
        }
    }
	
	
}
