package com.cpphot.action;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {

	private static SessionFactory sessionFactory;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setup();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
	
		Query query=session.createSQLQuery("select * from car_data");
		List list=query.list();
		System.out.println(list);
		List<CarData> list2=session.createQuery("from CarData").list();
		System.out.println(list2);
		
		session.getTransaction().commit();
		session.close();

	}

	public static void setup() {
		// A SessionFactory is set up once for an application!
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure() // configures settings from hibernate.cfg.xml
				.build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata()
					.buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

}
