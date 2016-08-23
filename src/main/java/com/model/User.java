package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Entity(name="UserFe")
@Component
public class User {
	

	public User() {
		// TODO Auto-generated constructor stub
	}
	@Id
	private String id;
	 private String userName;
	    private String password;
	    
	    
	 
	    public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getUserName() {
	        return userName;
	    }
	 
	    public void setUserName(String userName) {
	        this.userName = userName;
	    }
	 
	    public String getPassword() {
	        return password;
	    }
	 
	    public void setPassword(String password) {
	        this.password = password;
	    }
}
