package com.mindtree.dao.jdbc;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import com.mindtree.dao.UserDao;

import com.mindtree.entity.Hotels;
import com.mindtree.entity.User;

public class UserDaoImpl implements UserDao{
	public List<User> authentication(String uname,String pass)
	{
System.out.println("in jdbc question user login ");
		
		Configuration1 c1=new Configuration1();
		Session session=c1.config();
		Transaction t=session.beginTransaction();
		Criteria criteria=session.createCriteria(User.class);
		List<User> results=criteria.list();
		t.commit();
		session.close();
		
		System.out.println("successfully saved");	
		return results;
		
	}
}
