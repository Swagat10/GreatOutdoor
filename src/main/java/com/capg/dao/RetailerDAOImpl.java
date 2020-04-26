package com.capg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import com.capg.beans.Retailer;

@Service
public class RetailerDAOImpl implements RetailerDAOI
{
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void add(Retailer r) 
	{
		em.persist(r);
	}
	
	public List retrieve()
	{
		Query q = em.createQuery("from Retailer r");
		return q.getResultList();
	}

	@Override
	public Retailer findRetailerById(int id) {
		return null;
	}
		
	
}
