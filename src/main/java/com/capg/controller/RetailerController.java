package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.beans.Retailer;
import com.capg.service.RetailerServcieI;

@CrossOrigin("*")
@RestController

public class RetailerController 
{
		@Autowired
		RetailerServcieI retailerServcie;
		
		@GetMapping(value="/retailer/{}")
		public Retailer findRetailer(@PathVariable int id) 
		{
			return retailerServcie.findRetailerByID(id);
		}
		
		@GetMapping(value = "/retailer")
		public List<Retailer> viewRetailers()
		{
			return retailerServcie.retrieve();
		}
		
		@PostMapping(value="/retailer/new",consumes= {"application/json"})
		public String addRetailer(@RequestBody Retailer retailer)
		{
			retailerServcie.add(retailer);
			return "The new retailer added successfully...";
		}

}
