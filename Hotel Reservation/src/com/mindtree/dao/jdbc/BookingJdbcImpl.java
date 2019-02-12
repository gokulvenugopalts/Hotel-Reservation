package com.mindtree.dao.jdbc;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import com.mindtree.dao.BookingDao;
import com.mindtree.entity.BookingDetail;
import com.mindtree.entity.Hotels;

public class BookingJdbcImpl implements BookingDao {

	
	public void insertDetails(BookingDetail bookin) {
		Configuration1 c1=new Configuration1();
		Session session=c1.config();
		Transaction t=session.beginTransaction();
		session.persist(bookin);	
		t.commit();
		session.close();
		
		System.out.println("successfully saved");
	
	}
	public List<BookingDetail> displayReport(String emailid) {
		Configuration1 c1=new Configuration1();
		String emailId=emailid;
		Session session=c1.config();
		Transaction t=session.beginTransaction();
		Criteria crit = session.createCriteria(BookingDetail.class);
		crit.add(Restrictions.eq("emailid",emailId));
		List<BookingDetail> results = crit.list();
		for(BookingDetail b:results)
		{
			System.out.println(b.getBookingid());
		}
		t.commit();
		session.close();
		
		System.out.println("successfully saved");
		return results;
	
	}
}
