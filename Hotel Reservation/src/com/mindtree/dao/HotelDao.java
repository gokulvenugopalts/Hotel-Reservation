package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.Hotels;

public interface HotelDao {
	public List<Hotels> displayhotel(String str);
	public List<Hotels> displayhotel(int hotelid);
}
