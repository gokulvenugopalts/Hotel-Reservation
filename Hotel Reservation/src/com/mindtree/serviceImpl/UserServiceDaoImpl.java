package com.mindtree.serviceImpl;

import java.util.Iterator;
import java.util.List;

import com.mindtree.dao.UserDao;
import com.mindtree.dao.jdbc.UserDaoImpl;
import com.mindtree.entity.User;
import com.mindtree.service.UserServiceDao;

public class UserServiceDaoImpl implements UserServiceDao{
	UserDao udaoObj=new UserDaoImpl();
	public boolean authentication(String uname,String pass)
	{
		List<User> result=udaoObj.authentication(uname, pass);
		Iterator itr = result.iterator();
	      while(itr.hasNext()) {
	    	  User us=(User) itr.next();
	        System.out.println("inside service iterator");
	        if(uname.equals(us.getEmailid()) && pass.equals(us.getPassword()))
	        {
	        	System.out.println("success");
	        	return true;
	        }
	        
	      }
		return false;
	}
}
