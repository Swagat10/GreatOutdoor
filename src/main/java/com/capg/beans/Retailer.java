package com.capg.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Retailer10")

public class Retailer
{
	@Id
	String Retailer_Id;
	@Column
	String Retailer_Name;
	@Column
	String BuidingNo;
	@Column
	String City;
	@Column
	String State;
	@Column
	String Field;
	@Column 
	String Zip;
	
	public Retailer() {	}
	
	//creation of construction
	public Retailer(String retailer_Name, String retailer_Id, String buidingNo, String city, String state,String field, String zip) 
	{
		super();
		this.Retailer_Name = retailer_Name;
		this.Retailer_Id = retailer_Id;
		this.BuidingNo = buidingNo;
		this.City = city;
		this.State = state;
		this.Field = field;
		this.Zip = zip;
	}

	public String getRetailer_Id() 
	{
		return Retailer_Id;
	}
	public void setRetailer_Id(String retailer_Id)
	{
		Retailer_Id = retailer_Id;
	}

	public String getRetailer_Name() 
	{
		return Retailer_Name;
	}
	public void setRetailer_Name(String retailer_Name) 
	{
		Retailer_Name = retailer_Name;
	}

	public String getBuidingNo() 
	{
		return BuidingNo;
	}
	public void setBuidingNo(String buidingNo) 
	{
		BuidingNo = buidingNo;
	}

	public String getCity() 
	{
		return City;
	}
	public void setCity(String city) 
	{
		City = city;
	}

	public String getState() 
	{
		return State;
	}
	public void setState(String state) 
	{
		State = state;
	}
	
	public String getField() 
	{
		return Field;
	}
	public void setField(String field) 
	{
		Field = field;
	}

	public String getZip() 
	{
		return Zip;
	}
	public void setZip(String zip) 
	{
		Zip = zip;
	}

}
