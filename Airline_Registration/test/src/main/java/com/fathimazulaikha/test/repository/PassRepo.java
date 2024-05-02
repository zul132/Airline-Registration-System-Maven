package com.fathimazulaikha.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fathimazulaikha.test.domain.Passenger;

@Repository
public interface PassRepo extends JpaRepository<Passenger,String>
{
        Passenger bookTicketForPassenger(String passName, String passEmail, String password, int noOfTickets, String destination, String airline);
}
