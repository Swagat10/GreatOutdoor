package com.capg.dao;


import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.beans.Retailer;

@Service
public interface RetailerDAOI {

	public void add(Retailer r);
	public Retailer findRetailerById(String id);
	public List retrieve();
	public void updateRetailer(Retailer retailer); 
	public void removeRetailer(String retailerId) ;

}
