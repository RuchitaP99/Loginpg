package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api")
public class LoginController {
	
	@Autowired
	LoginRepository loginRepo;

	
	
    @PostMapping("/create")
    public Login createLogin(@RequestBody Login login) {
       
    	Login savedCustomer = loginRepo.save(login);
    	 
    	 return savedCustomer;
    }
    
    @GetMapping("/url")
    public List<Login> getAllEmployee(){
    	List<Login> allEmployeelist = loginRepo.findAll();
    	return allEmployeelist;
    }

}
