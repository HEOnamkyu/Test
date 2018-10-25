package com.InOut.Share;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private ModelAndView mav;
	
	
	
	@RequestMapping(value = "/")   
	public ModelAndView index() {
		mav=new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
	
	
	@RequestMapping(value = "/access")
	public ModelAndView access() {
		mav=new ModelAndView();
		mav.setViewName("erpMain");
		return mav;
	}
	
	@RequestMapping(value = "/provisionForm")
	public ModelAndView provisionForm() {
		mav=new ModelAndView();
		mav.setViewName("provisionForm");
		return mav;
	}
	@RequestMapping(value = "/joinForm")
	public ModelAndView joinForm() {
		mav=new ModelAndView();
		mav.setViewName("joinForm");
		return mav;
	}
	
	
}
