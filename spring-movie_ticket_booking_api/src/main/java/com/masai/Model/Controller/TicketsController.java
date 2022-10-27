package com.masai.Model.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Model.Seat;
import com.masai.Model.Tickets;
import com.masai.Repository.SeatRepository;
import com.masai.Service.TicketService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class TicketsController {
	
	@Autowired
	private TicketService service;
	
	@Autowired
	private SeatRepository seatRepository;
	
	@GetMapping("/tickets")
	public List<Tickets> getAllTickets(){
		return service.viewAllTickets();
	}
	
	@PostMapping("/ticket")
	public Tickets addTicket(@RequestBody Tickets ticket){
		return service.addTicket(ticket);
	}
	
	@PutMapping("/ticket")
	public Tickets updateTicket(@RequestBody Tickets ticket){
		return service.updateTicket(ticket);
	}
	
	@DeleteMapping("/ticket")
	public Tickets deleteTicket(@RequestBody Tickets ticket){
		return service.removeTicket(ticket);
	}
	
	@PostMapping("/ticket/{id}/addSeat")
	public Tickets addSeat(@PathVariable("id") Integer id, @RequestBody Seat seat){
		Tickets t = service.viewTicket(id);
		addSeat(id, seat);
		seatRepository.save(seat);
		return t;
	}
	
	@DeleteMapping("/ticket/{id}/removeSeat")
	public Tickets removeSeat(@PathVariable("id") Integer id, @RequestBody Seat seat){
		Tickets t = service.viewTicket(id);
		deleteTicket(t);
		seatRepository.delete(seat);
		return t;
		
	}

}
