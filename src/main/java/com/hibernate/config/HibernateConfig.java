package com.hibernate.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.DAO.BookDAO;
import com.hibernate.DAO.BookDAOImpl;

public class HibernateConfig {
	public static SessionFactory getSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure("/com/hibernate/resources/hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		return sessionFactory;
	}
	
	public BookDAO getBookDAO() {
		BookDAO bookDAOImpl = new BookDAOImpl();
		return bookDAOImpl;
	}
}
