package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Model.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer>{

}
