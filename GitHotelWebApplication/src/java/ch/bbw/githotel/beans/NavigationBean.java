package ch.bbw.githotel.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class NavigationBean {
	private String page;
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
	
	
}
