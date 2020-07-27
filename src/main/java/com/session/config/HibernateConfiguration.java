package com.session.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfiguration {

	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		
		Configuration configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;
	}
	
}
