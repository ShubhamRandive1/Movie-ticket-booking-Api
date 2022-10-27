package com.masai.Service;

import java.util.List;

import com.masai.Model.TicketBooking;

public interface BookingService {
	
	TicketBooking addBooking(TicketBooking booking);
	
	TicketBooking updateBooking(TicketBooking booking);
	
	TicketBooking cancelBooking(TicketBooking booking);
	
	List<TicketBooking> showAllBooking();

}
