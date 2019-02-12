package com.mindtree.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Booking {
	private String checkin_date;
	private String checkout_date;
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookingid;
	
	public Booking() {
		super();
	}
	public String getCheckin_date() {
		return checkin_date;
	}
	public void setCheckin_date(String checkin_date) {
		this.checkin_date = checkin_date;
	}
	public String getCheckout_date() {
		return checkout_date;
	}
	public void setCheckout_date(String checkout_date) {
		this.checkout_date = checkout_date;
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public Booking(String checkin_date, String checkout_date, int bookingid) {
		super();
		this.checkin_date = checkin_date;
		this.checkout_date = checkout_date;
		this.bookingid = bookingid;
	}
	
}
