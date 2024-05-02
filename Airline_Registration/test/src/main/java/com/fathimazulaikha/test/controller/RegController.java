package com.fathimazulaikha.test.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fathimazulaikha.test.domain.Passenger;
import com.fathimazulaikha.test.service.RegService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class RegController {

    @Autowired
    private RegService regService;

    @GetMapping("/")
    public String api()
    {
 
        return "register";
    }

    @PostMapping("/reg")
    public String register(@ModelAttribute("pass")  Passenger pass)
    {
        Passenger newPass = regService.saveUser(pass.getPassName(), pass.getPassEmail(), pass.getPassword(), pass.getNoOfTickets(), pass.getDestination(), pass.getAirline());
        
        System.out.println(newPass);
        if(Objects.nonNull(newPass)){
            return "redirect:/display";
        }else {
            return "redirect:/";
        } 
    }

    @GetMapping("/display")
    public String disp()
    {
        return "display";
    }
} 
