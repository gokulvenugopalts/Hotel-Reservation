package com.mindtree.serviceImpl;

import java.util.List;

import com.mindtree.dao.HotelDao;
import com.mindtree.dao.jdbc.HotelJdbcImpl;
import com.mindtree.entity.Hotels;
import com.mindtree.service.HotelDisplayDao;

public class hotelDisplay implements HotelDisplayDao{
	HotelDao hoteldaoObj=new HotelJdbcImpl();
	public List<Hotels> displayhotel(String str)
	{
		return hoteldaoObj.displayhotel(str); 
	}
	public List<Hotels> displayhotel(int hotelid)
	{
		return hoteldaoObj.displayhotel(hotelid);
		
	}
}
