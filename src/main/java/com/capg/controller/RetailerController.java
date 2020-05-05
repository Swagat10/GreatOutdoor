package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.beans.Retailer;
import com.capg.service.RetailerServiceI;

@CrossOrigin(origins= "http://localhost:4200")
@RestController

public class RetailerController 
{
		@Autowired
		RetailerServiceI retailerService;
		
		@PostMapping(value="/retailer/new",consumes= {"application/json"})
		public String addRetailer(@RequestBody Retailer retailer)
		{
			retailerService.add(retailer);
			return "Retailer Added Seccessfully";
		}
		
		
		@PutMapping(value ="retailer/update", consumes= {"application/json"})
		public String updateRetailer(@RequestBody Retailer retailer)
		{
			retailerService.updateRetailer(retailer);
			return "Retailer Updated Successfully";
		}
		
		
		@DeleteMapping(value = "retailer/delete/{retailerId}")
		public String removeRetailer(@PathVariable String retailerId)
		{
			retailerService.removeRetailer(retailerId);
			return "Retailer removed Successfully";
		}
		
		
		@GetMapping(value="/retailer/{id}")
		public Retailer findRetailer(@PathVariable String id) {
			return retailerService.findRetailerById(id);
		}
		
		@GetMapping(value="/retailer")
		public List<Retailer> viewRetailers(){
			return retailerService.retrieve();
		}
		

}
