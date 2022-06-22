package com.wipro.onlinebanking;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


 @Service
 @Transactional
public class AddpayeeServiceImpl implements AddpayeeService {

    @Autowired
    private AddpayeeRepository AddpayeeRepository;

    @Override
    public Addpayee createAddpayee(Addpayee Addpayee) {
        return AddpayeeRepository.save(Addpayee);
    }

   // @Override
    //public Addpayee updateAddpayee(Addpayee Addpayee) {
        
   // }

    @Override
    public List < Addpayee > getAllAddpayee() {
        return this.AddpayeeRepository.findAll();
    }

 
    }

   
      

    
