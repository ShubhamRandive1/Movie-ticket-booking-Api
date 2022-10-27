package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Model.TicketBooking;

@Repository
public interface BookingRepository extends JpaRepository<TicketBooking, Integer>{

}
