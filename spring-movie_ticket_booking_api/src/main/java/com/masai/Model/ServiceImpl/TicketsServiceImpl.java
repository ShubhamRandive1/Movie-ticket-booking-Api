package com.masai.Model.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Model.Tickets;
import com.masai.Repository.TicketsRepository;
import com.masai.Service.TicketService;

@Service
public class TicketsServiceImpl implements TicketService{
	
	
	@Autowired
	private TicketsRepository repo;
	
	@Override
	public Tickets addTicket(Tickets ticket) {
		
		return repo.save(ticket);
	}

	@Override
	public Tickets updateTicket(Tickets ticket) {
		return repo.save(ticket);
	}

	@Override
	public Tickets removeTicket(Tickets ticket) {
		repo.delete(ticket);
		return ticket;
	}

	@Override
	public List<Tickets> viewAllTickets() {
		
		return repo.findAll();
	}

	@Override
	public Tickets viewTicket(Integer id) {
		
		return repo.findById(id).get();
	}

}
