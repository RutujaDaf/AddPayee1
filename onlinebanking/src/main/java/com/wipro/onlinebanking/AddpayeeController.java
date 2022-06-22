package com.wipro.onlinebanking;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;







@RestController
public class AddpayeeController {
	
	 @Autowired
	    private AddpayeeService AddpayeeService;
	 
	  @GetMapping("/Addpayee")
	    public ResponseEntity < List < Addpayee >> getAllAddpayee() {
	        return ResponseEntity.ok().body(AddpayeeService.getAllAddpayee());
	    }
	  @PostMapping("/Addpayee")
	    public ResponseEntity < Addpayee > createAddpayee(@RequestBody Addpayee Addpayee) {
	        return ResponseEntity.ok().body(this.AddpayeeService.createAddpayee(Addpayee));
	    }
	  
	  
	  

}


