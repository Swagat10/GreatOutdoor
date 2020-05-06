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
		em.merge(retailer);
		
	}

	@Override
	public void removeRetailer(String retailerId) 
	{
		Retailer retailer = em.find(Retailer.class, retailerId);
		em.remove(retailer);
		
	}

		
	
}
