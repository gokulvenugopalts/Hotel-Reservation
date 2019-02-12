package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.Hotels;

public interface HotelDisplayDao {
	public List<Hotels> displayhotel(String str);
	public List<Hotels> displayhotel(int hotelid);
}
