package com.masai.Service;

import java.util.List;

import com.masai.Model.Tickets;

public interface TicketService {
	
	Tickets addTicket(Tickets ticket);
	
	Tickets updateTicket(Tickets ticket);
	
	Tickets removeTicket(Tickets ticket);
	
	List<Tickets> viewAllTickets();
	
	Tickets viewTicket(Integer id);

}
