package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Model.Tickets;

@Repository
public interface TicketsRepository extends JpaRepository<Tickets, Integer>{

}
