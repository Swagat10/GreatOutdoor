package com.capg.dao;


import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.beans.Retailer;

@Service
public interface RetailerDAOI {

	public void add(Retailer r);
	public List retrieve();
	public Retailer findRetailerById(int id);

}
