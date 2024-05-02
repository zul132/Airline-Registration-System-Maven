package com.fathimazulaikha.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fathimazulaikha.test.domain.Passenger;
import com.fathimazulaikha.test.repository.PassRepo;

@Service
public class RegService {
    @Autowired
    private PassRepo passRepository;

    public Passenger saveUser(String passName, String passEmail, String password, int noOfTickets, String destination, String airline)
    {
        Passenger pass = new Passenger();
        pass.setPassName(passName);
        pass.setPassEmail(passEmail);
        pass.setPassword(password);
        pass.setNoOfTickets(noOfTickets);
        pass.setDestination(destination);
        pass.setAirline(airline);

        passRepository.save(pass);    
        return pass;
    } 
}
