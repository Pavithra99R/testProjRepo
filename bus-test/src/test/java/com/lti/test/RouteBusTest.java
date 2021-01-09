package com.lti.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.dao.RouteBus;

public class RouteBusTest {
	
	@Test
	public void fetchBusForRoute() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		RouteBus dao = (RouteBus) ctx.getBean("route_comp");
		List<Object[]> buses = dao.fetchBusForRoute("Chennai", "Kerala");
		for(Object[] b:buses) {
			System.out.println(b[0]);
		}
	}
}
