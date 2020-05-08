package com.capg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.beans.Retailer;
import com.capg.dao.RetailerDAOI;

/*This service class is for the implementation of the RetailerServiceI class. */
/*Controller asks for the services from it and it provides the data from DAO.*/
@Service
public class RetailerServiceImpl implements RetailerServiceI
{

	@Autowired
	RetailerDAOI retailer;
	
	
	public void add(Retailer r)
	{
		retailer.add(r);
	}
	
	/*The methods is this class are to view Retailers list,add,search,remove and update retailer details*/
	
	public Retailer findRetailerById(String id) 
	{
		return retailer.findRetailerById(id);
	}
	
	public List retrieve() 
	{
		return retailer.retrieve();
	}
	
	@Override
	public void updateRetailer(Retailer r)
	{
		retailer.updateRetailer(r);	
	}

	@Override
	public void removeRetailer(String retailerId)
	{
		retailer.removeRetailer(retailerId);	
	}
	
}
