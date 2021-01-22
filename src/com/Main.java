package com;

import java.util.Date;

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
//		Author author2 = new Author("James", "james@gmail.com");
//		long id = (long) session.save(a1);
//		System.out.println(session.save(a1));

//		Author a1 = (Author) session.load(Author.class, 2L);
//		System.out.println(a1);

//		Book b1 = new Book("Java", "good", new Date());
//		long id = (long) session.save(b1);

		// delete one author
//		Author a3 = (Author) session.get(Author.class, 7L);
//		session.delete(a3);

		// update
//		Author a3 = (Author) session.get(Author.class, 5L);
//		a3.setName("John");
//		a3.setEmail("john@gmail.com");
//		session.update(a3);

		// fetch all authors
//		String hql = " from Author";// here Author is class name
//		Query query = session.createQuery(hql);
//		List<Author> listOfAuthors = query.list();
//		System.out.println(listOfAuthors);
//
//		for (Author author : listOfAuthors) {
//			System.out.println(author.getName());
//		}

		// search(select on basis of some conditions)

//		String hql = "from Author where name =:name"; // named parameter
//		Query query = session.createQuery(hql);
//		query.setParameter("name", "Adil"); // recommended
//		List<Author> listOfAuthors = query.list();
//
//		for (Author author : listOfAuthors) {
//			System.out.println(author.getName());
//		}

		// update

//		String hql = "update Author set email = :email where id = :id";
//		Query query = session.createQuery(hql);
//		query.setParameter("email", "j@gmail.com");
//		query.setParameter("id", 5L);
//
//		query.executeUpdate();

		Author author2 = new Author("James", "james@gmail.com");
		Book book2 = new Book("hibernate", "excellent", new Date(), author2);
		session.save(book2);

		session.getTransaction().commit();
		session.close();

	}

}
