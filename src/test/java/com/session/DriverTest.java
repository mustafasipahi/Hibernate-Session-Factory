package com.session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import com.session.config.HibernateConfiguration;

public class DriverTest {

	@Test
	public void initSessionFactory() {
		
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		
		
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
