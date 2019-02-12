package com.mindtree.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mindtree.entity.Booking;
import com.mindtree.entity.Hotels;
import com.mindtree.entity.User;


public class main 
{
public static void main(String args[])
{
	
User user=new User();
Hotels hotel=new Hotels();
Booking bookin=new Booking();
Configuration cfg=new Configuration();
cfg.configure("hibernate.cfg.xml");
SessionFactory factory=cfg.buildSessionFactory();
Session session=factory.openSession();
Transaction t=session.beginTransaction();
t.commit();
session.close();
}
}
