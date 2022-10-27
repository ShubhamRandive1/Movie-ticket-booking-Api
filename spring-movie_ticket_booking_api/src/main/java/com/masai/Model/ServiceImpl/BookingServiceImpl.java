package com.masai.Model.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Model.TicketBooking;
import com.masai.Repository.BookingRepository;
import com.masai.Service.BookingService;

@Service
public class BookingServiceImpl implements BookingService{

	@Autowired
	private BookingRepository repo;

	@Override
	public TicketBooking addBooking(TicketBooking booking) {
		
		return repo.save(booking);
	}

	@Override
	public TicketBooking updateBooking(TicketBooking booking) {
		return repo.save(booking);
	}

	@Override
	public TicketBooking cancelBooking(TicketBooking booking) {
		repo.delete(booking);
		return booking;
	}

	@Override
	public List<TicketBooking> showAllBooking() {
		
		return repo.findAll();
	}

}
