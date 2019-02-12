package com.mindtree.serviceImpl;

import java.util.List;

import com.mindtree.dao.BookingDao;
import com.mindtree.dao.jdbc.BookingJdbcImpl;
import com.mindtree.entity.BookingDetail;
import com.mindtree.service.BookingService;

public class BookingServiceImpl implements BookingService{
	BookingDao bkObj=new BookingJdbcImpl();
	public void insertDetails(BookingDetail bookin)
	{
		System.out.println("In bk serviceimpl");
		bkObj.insertDetails(bookin);
	}
	public List<BookingDetail> displayReport(String emailid)
	{
		return bkObj.displayReport(emailid);
	}
}
