package com.mindtree.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.entity.BookingDetail;
import com.mindtree.entity.Hotels;
import com.mindtree.service.BookingService;
import com.mindtree.service.HotelDisplayDao;
import com.mindtree.service.UserServiceDao;
import com.mindtree.serviceImpl.BookingServiceImpl;
import com.mindtree.serviceImpl.UserServiceDaoImpl;
import com.mindtree.serviceImpl.hotelDisplay;

@Controller
@SessionAttributes("hotel")
public class HomeController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView indexpage() {

		ModelAndView model1 = new ModelAndView("index");

		return model1;

	}

	@ModelAttribute
	public void commonMethod(Model model) {
		model.addAttribute("message",
				"Welcome to Hotel Booking Application!!!!!!!!");
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView searchpage() {
		ModelAndView model1 = new ModelAndView("searchHotel");
		model1.addObject("msg", "Search Hotel");
		return model1;

	}

	@RequestMapping(value = "/searchresult", method = RequestMethod.POST)
	public ModelAndView searchresultpage(
			@RequestParam(value = "searchbox") String str) {
		System.out.println("hotel name " + str);
		ModelAndView model1 = new ModelAndView("searchResult");
		model1.addObject("msg", "Search Hotel");
		HotelDisplayDao hotelObj = new hotelDisplay();

		model1.addObject("qarray", hotelObj.displayhotel(str));
		List<Hotels> results = hotelObj.displayhotel(str);
		model1.addObject("hotel", hotelObj.displayhotel(str));
		for (Hotels h : results) {
			System.out.println("in controller " + h.getHotelname());
		}
		return model1;

	}
	@RequestMapping(value = "/loginpage", method = RequestMethod.GET)
	public ModelAndView bookHotelPage() {
		
		System.out.println("going to login controller");
		
			ModelAndView model1 = new ModelAndView("BookLogin");
			
			return model1;
		}

	

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView bookHotelPage(
			@RequestParam(value = "emailid") String str,
			@RequestParam(value = "password") String pass,HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("emailid", str);
		System.out.println("email  "+session.getAttribute("emailid"));
		session.setAttribute("password", pass);
		System.out.println("in book hotel controller");
		Date date=new Date();
		String date1 = new SimpleDateFormat("dd-MM-yyyy").format(date);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DATE, 1);
		Date next = c.getTime();
		String next1 = new SimpleDateFormat("dd-MM-yyyy").format(next);
		System.out.println("today" + date1);
		session.setAttribute("today", date1);
		session.setAttribute("next", next1);
		UserServiceDao uobj = new UserServiceDaoImpl();
		boolean value = uobj.authentication(str, pass);
		if (value){
		return new ModelAndView("BookingDetails");
		}
		else {
			ModelAndView model1 = new ModelAndView("BookLogin");
			model1.addObject("msg",
					"Either username or password is incorrect. Enter valid username and password");
			return model1;
		}

	}

	@RequestMapping(value = "/viewhotel", method = RequestMethod.GET)
	public ModelAndView viewHotelPage(
			@RequestParam(value = "hotelid") int hotelid, HttpServletRequest request) {
		System.out.println("in  selected hotel details controller " + hotelid);
		
		ModelAndView model1 = new ModelAndView("HotelDetails");
		model1.addObject("msg", "Welcome to  ");
		HotelDisplayDao hotelObj = new hotelDisplay();

		model1.addObject("qarray", hotelObj.displayhotel(hotelid));
		List<Hotels> results = hotelObj.displayhotel(hotelid);
		HttpSession session = request.getSession();
		session.setAttribute("object", results);
		model1.addObject("hotel", hotelObj.displayhotel(hotelid));
		return model1;

	}
	
	@RequestMapping(value = "/BookingDetails", method = RequestMethod.POST)
	public ModelAndView viewHotelDetails(@RequestParam("emailid") String name) {
		
		ModelAndView model1 = new ModelAndView("BookingDetails");
		model1.addObject("msg", "Welcome to ");
		model1.addObject("uname", name);
		
		return model1;

	}
	@RequestMapping(value = "/store")
	public ModelAndView viewHotelDetails(@ModelAttribute("bookin") BookingDetail bookin, HttpServletRequest request) {
		
		BookingService bkObject=new BookingServiceImpl();
		bkObject.insertDetails(bookin);
		HttpSession session = request.getSession();
		String emailid=(String) session.getAttribute("emailid");
		
		List<BookingDetail> res=bkObject.displayReport(emailid);
		System.out.println(res);
		for(BookingDetail b:res)
		{
			System.out.println(b.getBookingid());
		}
		ModelAndView model1 = new ModelAndView("Report");
		model1.addObject("email",emailid);
		model1.addObject("resul", res);
		return model1;

	}
	
	@RequestMapping(value = "/changesearch")
	public ModelAndView changesearch() {
		
		ModelAndView model1 = new ModelAndView("searchHotel");
		model1.addObject("msg", "Search Hotel");
		
		
		return model1;

	}
}
