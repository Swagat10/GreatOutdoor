package com.capg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.beans.Retailer;

@Service
public interface RetailerServcieI 
{
	public void add(Retailer r);
	public Retailer findRetailerByID(int id);
	public List retrieve();

}
