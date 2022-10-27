package com.masai.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class TicketBooking {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int bookingId;
	
	private String bookingDate;
	private int transactionId;
	private String transactionMode;
	private String transactionStatus;
	private double totalCost;
	
	@OneToOne
	private Customer customer;
	
	@OneToOne
	private Tickets ticket;
	

}
