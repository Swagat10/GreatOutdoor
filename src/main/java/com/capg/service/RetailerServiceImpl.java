package com.capg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.beans.Retailer;
import com.capg.dao.RetailerDAOI;

@Service
public class RetailerServiceImpl implements RetailerServcieI
{

	@Autowired
	RetailerDAOI retailer;
	
	
	public void add(Retailer r)
	{
		retailer.add(r);
	}
	
	public Retailer findRetailerByID(int id) 
	{
		return retailer.findRetailerById(id);
	}
	
	public List retrieve() 
	{
		return retailer.retrieve();
	}
	
}
