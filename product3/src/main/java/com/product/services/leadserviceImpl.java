package com.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.lead;
import com.product.repository.leadrepository;

@Service
public class leadserviceImpl implements leadservice {

	@Autowired
	private leadrepository  leadRepo;
	
	@Override
	public void savelead(lead Lead) 
	{
		leadRepo.save(Lead);
		
	}

	@Override
	public List<lead> getLeads() {
		
		List<lead> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public void deleteOneLead(long id) {
		leadRepo.deleteById(id);	
	}

}
