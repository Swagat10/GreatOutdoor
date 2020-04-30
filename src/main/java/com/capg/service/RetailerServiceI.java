package com.capg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.beans.Retailer;

@Service
public interface RetailerServiceI 
{
	public void add(Retailer r);
	public Retailer findRetailerById(String id);
	public List retrieve();
	void updateRetailer(Retailer r);
	void removeRetailer(String retailertId);

}
