package com.tcs.displayperson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.displayperson.client.CallPersonService;

@Controller
public class DisplayController {
	
	@Autowired
	CallPersonService service;
	
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public ModelAndView getPerson() {
		String personName=service.getPersonDetails();
		return new ModelAndView("personDetails","name",personName);
	}

}
