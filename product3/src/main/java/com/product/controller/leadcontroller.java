package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.product.entity.lead;
import com.product.services.leadservice;

@Controller
public class leadcontroller 
{
	@Autowired
	private leadservice  LeadService;
	
	@RequestMapping( value = "/ViewPage" , method = RequestMethod.GET)
	public String createViewpage()
	{
		return "creat_lead";
	}
	
	@RequestMapping("/saveLead")
	public String saveOneLead( @ModelAttribute("lead")lead Lead)
	{
		 LeadService.savelead(Lead);
		return  "creat_lead";
	}
	
}
