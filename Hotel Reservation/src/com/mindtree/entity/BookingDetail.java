package com.mindtree.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookingDetail {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookingid;
	
public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
private String hotelname;
private String address;
private String city;
private String state;
private int zip;
private float rate;
private String emailid;
private String checkin_date;
private String checkout_date;

public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
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
public BookingDetail() {
	super();
}
public String getHotelname() {
	return hotelname;
}
public void setHotelname(String hotelname) {
	this.hotelname = hotelname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
}
public float getRate() {
	return rate;
}
public void setRate(float rate) {
	this.rate = rate;
}
public BookingDetail(int bookingid, String hotelname, String address,
		String city, String state, int zip, float rate, String emailid,
		String checkin_date, String checkout_date) {
	super();
	this.bookingid = bookingid;
	this.hotelname = hotelname;
	this.address = address;
	this.city = city;
	this.state = state;
	this.zip = zip;
	this.rate = rate;
	this.emailid = emailid;
	this.checkin_date = checkin_date;
	this.checkout_date = checkout_date;
}
}
