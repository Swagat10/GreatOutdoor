package com.capg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.beans.Retailer;

@Transactional
@Repository
public class RetailerDAOImpl implements RetailerDAOI
{
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void add(Retailer r) 
	{
		em.persist(r);
	}
	
	@Override
	public Retailer findRetailerById(String id) 
	{
		return em.find(Retailer.class, id);
	}
	
	@Override
	public List retrieve()
	{
		Query q = em.createQuery("from Retailer r");
		return q.getResultList();
	}
	
	@Override
	public void updateRetailer(Retailer retailer) 
	{
		Retailer newRetailer = em.find(Retailer.class, retailer.getRetailer_Id());
		
		if(newRetailer != null)
		{
			newRetailer.setRetailer_Id(retailer.getRetailer_Id());
			newRetailer.setRetailer_Name(retailer.getRetailer_Name());
			newRetailer.setBuidingNo(retailer.getBuidingNo());
			newRetailer.setCity(retailer.getCity());
			newRetailer.setState(retailer.getState()); 
			newRetailer.setField(retailer.getField());
			newRetailer.setZip(retailer.getZip());
		}
		
	}

	@Override
	public void removeRetailer(String retailerId) 
	{
		Retailer retailer = em.find(Retailer.class, retailerId);
		em.remove(retailer);
		
	}

		
	
}
