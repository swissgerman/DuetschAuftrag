package ch.bbw.githotel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class LoginBean {
	
	public LoginBean() {
		
	}
	
	public String getUserName(){
		return "Noah Siegrist";
	}
	public String getRole(){
		return "Admin";
	}
	public boolean isUserLoggedIn(){
		return true;
	}
	public String logout(){
		return "login.xhtml";
	}
	
}
