package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.BookingDetail;

public interface BookingDao {
	public void insertDetails(BookingDetail bookin);
	public List<BookingDetail> displayReport(String emailid);
}
