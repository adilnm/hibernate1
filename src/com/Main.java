package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
		registry.applySettings(configuration.getProperties());
		ServiceRegistry serviceRegistry = registry.buildServiceRegistry();

		// builds a session factory from the service registry
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		// obtains the session
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// creates a author entity
//		Author a1 = new Author();
//		a1.setName("David");
//		a1.setEmail("david@gmail.com");
//		long id = (long) session.save(a1);
//		System.out.println(session.save(a1));

		Author a1 = (Author) session.load(Author.class, 2L);
		System.out.println(a1);

		session.getTransaction().commit();
		session.close();

	}

}
