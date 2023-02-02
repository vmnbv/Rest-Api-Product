package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.lead;
import com.product.services.leadservice;


@RestController
@RequestMapping("/api/leads")	
public class leadRestController 
{
	@Autowired
	private leadservice  Leadservice;
	
	@GetMapping
	public List<lead> getAllLeads()
	{
		List<lead> leads=Leadservice.getLeads();
		return leads;
	}
	@PostMapping
	public void saveOneLead(@RequestBody lead Lead)
	{
		Leadservice.savelead(Lead);
	}
	
	@PutMapping
	public void updateOneLead(@RequestBody lead Lead)
	{
		Leadservice.savelead(Lead);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteOneLead(@PathVariable("id") long id)
	{
		Leadservice.deleteOneLead(id);
	}

}
