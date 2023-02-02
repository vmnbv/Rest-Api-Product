package com.product.services;

import java.util.List;

import com.product.entity.lead;

public interface leadservice
{
	public void savelead(lead Lead);

	public List<lead> getLeads();

	public void deleteOneLead(long id);

}
