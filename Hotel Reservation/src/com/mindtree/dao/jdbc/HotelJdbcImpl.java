package com.mindtree.dao.jdbc;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;



import com.mindtree.dao.HotelDao;
import com.mindtree.entity.Hotels;
public class HotelJdbcImpl implements HotelDao{
	public List<Hotels> displayhotel(String str) 
	{
		System.out.println("in jdbc question");
		
		Configuration1 c1=new Configuration1();
		Session session=c1.config();
		Transaction t=session.beginTransaction();
		Criteria crit = session.createCriteria(Hotels.class);
		crit.add(Restrictions.ilike("hotelname",str+"%",MatchMode.ANYWHERE));
		List<Hotels> results = crit.list();
		t.commit();
		session.close();
		for(Hotels h:results)
		{
			System.out.println(h.getHotelname());
		}
		System.out.println("successfully saved");	
		return results;
		
	}
	public List<Hotels> displayhotel(int hotelid) 
	{
		
		
		Configuration1 c1=new Configuration1();
		Session session=c1.config();
		Transaction t=session.beginTransaction();
		Criteria crit = session.createCriteria(Hotels.class);
		crit.add(Restrictions.eq("hotelid",hotelid));
		List<Hotels> results = crit.list();
		t.commit();
		session.close();
		
		System.out.println("successfully saved");	
		return results;
		
	}
}
