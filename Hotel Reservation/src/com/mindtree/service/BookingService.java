package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.Booking;
import com.mindtree.entity.BookingDetail;

public interface BookingService {

	void insertDetails(BookingDetail bookin);
	public List<BookingDetail> displayReport(String emailid);
}
