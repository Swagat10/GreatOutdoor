package com.capg.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

/*Annotation for the datatable */
@Table(name="Retailer10")

public class Retailer
{
	@Id 
	String Retailer_Id;/*Retailer_Id is the primary key*/
	@Column
	String Retailer_Name;
	@Column
	String BuildingNo;
	@Column
	String City;
	@Column
	String State;
	@Column
	String Field;
	@Column 
	String Zip;
	
	public Retailer() {	}
	
	//Creation of construction
	public Retailer(String retailer_Name, String retailer_Id, String buildingNo, String city, String state,String field, String zip) 
	{
		super();
		this.Retailer_Name = retailer_Name;
		this.Retailer_Id = retailer_Id;
		this.BuildingNo = buildingNo;
		this.City = city;
		this.State = state;
		this.Field = field;
		this.Zip = zip;
	}
	
	
	/*Getters and Setters*/
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

	public String getBuildingNo() 
	{
		return BuildingNo;
	}
	public void setBuildingNo(String buidingNo) 
	{
		BuildingNo = buidingNo;
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
