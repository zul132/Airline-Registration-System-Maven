package com.fathimazulaikha.test.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="register")
public class Passenger {
    @Id
    private String passName;
    private String passEmail;
    private String password;
    private int noOfTickets;
    private String destination;
    private String airline;

    
    public Passenger() {

    }
    public Passenger(String passName, String passEmail, String password, int noOfTickets, String destination,
            String airline) {
        this.passName = passName;
        this.passEmail = passEmail;
        this.password = password;
        this.noOfTickets = noOfTickets;
        this.destination = destination;
        this.airline = airline;
    }
    
    public String getPassName() {
        return passName;
    }
    public void setPassName(String passName) {
        this.passName = passName;
    }
    public String getPassEmail() {
        return passEmail;
    }
    public void setPassEmail(String passEmail) {
        this.passEmail = passEmail;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getNoOfTickets() {
        return noOfTickets;
    }
    public void setNoOfTickets(int noOfTickets) {
        this.noOfTickets = noOfTickets;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getAirline() {
        return airline;
    }
    public void setAirline(String airline) {
        this.airline = airline;
    }
}
