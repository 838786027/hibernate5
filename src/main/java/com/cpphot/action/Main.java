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
		save();
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
	
	public static void list(){
		Session session = sessionFactory.openSession();
		Query query=session.createSQLQuery("select * from car_data");
		List<CarData> list=query.list();
		System.out.println(list);
		List<CarData> list2=session.createQuery("from CarData").list();
		System.out.println(list2);
		session.close();
	}
	
	public static void save(){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		CarBelong carBelong=new CarBelong();
		carBelong.setId(2);
		carBelong.setIsLocalCity(0);
		carBelong.setIsLocalProvince(0);
		carBelong.setIsOuterProvince(0);
		carBelong.setCity("深圳");
		carBelong.setProvince("广东");
		carBelong.setCarNumPrefix("粤B");
		session.save(carBelong);
		session.getTransaction().commit();
		session.close();
	}
}
