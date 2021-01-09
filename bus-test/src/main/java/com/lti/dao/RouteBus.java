package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component("route_comp")
public class RouteBus {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public List<Object[]> fetchBusForRoute(String source,String destination){
		
			Query q = entityManager.createQuery("select r.source,r.destination,to_char(r.dateOfDepature,'hh24:mi:ss'),r.fare,r.duration"
					+ "r.seatAvailable,b.busId,b.busName,b.busType from Route r"
					+ "join r.buses b where r.source=:source and r.destination=:destination");
			q.setParameter("source", source);
			q.setParameter("destination", destination);
			List<Object[]> list = q.getResultList();
			return list;
		
		
		
	}

}
