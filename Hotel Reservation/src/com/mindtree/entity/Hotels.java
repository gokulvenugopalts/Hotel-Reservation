package com.mindtree.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Hotels {
	@Id 
	//@GeneratedValue(strategy=GenerationType.AUTO)
private int hotelid;
private String hotelname;
private String address;
private String state;
private String city;
private int zip;
private float rate;
@OneToOne
private Booking book;

public Booking getBook() {
	return book;
}
public void setBook(Booking book) {
	this.book = book;
}
public Hotels() {
	super();
}
public int getHotelid() {
	return hotelid;
}
public void setHotelid(int hotelid) {
	this.hotelid = hotelid;
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
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
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
public Hotels(int hotelid, String hotelname, String address, String state,
		String city, int zip, float rate, Booking book) {
	super();
	this.hotelid = hotelid;
	this.hotelname = hotelname;
	this.address = address;
	this.state = state;
	this.city = city;
	this.zip = zip;
	this.rate = rate;
	this.book = book;
}

}
