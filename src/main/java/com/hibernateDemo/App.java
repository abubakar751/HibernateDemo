package com.hibernateDemo;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Configuration cfg = new Configuration();

		cfg.configure("com/hibernateDemo/cong.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Student st = new Student();
		st.setId(101);
		st.setName("Abu Bakar");
		st.setCity("Up");
		System.out.println(st);
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(st);
		tr.commit();
		session.close();

	}
}
