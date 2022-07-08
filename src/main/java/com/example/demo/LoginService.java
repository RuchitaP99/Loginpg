package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class LoginService {

	List<Login> list = new ArrayList<>();
	
	public LoginService() {
		list.add(new Login(1,"user", "user123"));
		list.add(new Login(2,"admin", "admin123"));
	}
	
	public List<Login> getAllLogin(){
		return this.list;
	}
	
	public Login getLogin(String username) {
		return this.list.stream().filter((login)->login.getUsername().equals(username)).findAny().orElse(null);
	}
	  
	public Login addLogin(Login login) {
		this.list.add(login);
		return login;
	}
}
