package com.mindtree.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id 
	//@GeneratedValue(strategy=GenerationType.AUTO)
private int userid;
private String username;
private String emailid;
private String password;
@OneToOne
private Booking book;

public Booking getBook() {
	return book;
}
public void setBook(Booking book) {
	this.book = book;
}
public User() {
	super();
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public User(int userid, String username, String emailid, String password,
		Booking book) {
	super();
	this.userid = userid;
	this.username = username;
	this.emailid = emailid;
	this.password = password;
	this.book = book;
}

}
