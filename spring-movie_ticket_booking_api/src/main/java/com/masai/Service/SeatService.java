package com.masai.Service;

import com.masai.Model.Seat;

public interface SeatService {
	
	Seat bookSeat(Seat seat);
	
	Seat cancelSeatBooking(Seat seat);
	
	Seat blockSeat(Seat seat);

}
