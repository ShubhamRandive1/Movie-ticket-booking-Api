package com.masai.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Tickets {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int ticketId;
	
	private int noOfSeats;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_ticket_id", referencedColumnName = "ticketId")
	private List<Seat> seatNumber;
	
	private boolean ticketStatus;
	
	@OneToOne
	private TicketBooking booking;

}
