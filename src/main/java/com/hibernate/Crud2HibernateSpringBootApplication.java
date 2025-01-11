package com.hibernate;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hibernate.DAO.BookDAO;
import com.hibernate.entities.BookDetails;

@SpringBootApplication
public class Crud2HibernateSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Crud2HibernateSpringBootApplication.class, args);
		//BookDAO bdao = ctx.getBean(BookDAO.class);
		
	   /*	
		//*************CREATE/INSERT book***************
		BookDetails b = new BookDetails("A clockwork orange", "Anthony Burgess", "Fiction", "zoya");
		bdao.insertBookDetails(b);
		
		
		
		//**************READ/SELECT book*******************
		BookDetails book = bdao.getBookDetails(5L);
		System.out.println(book);
		
		
		
		//***********UPDATE/EDIT book***************
		BookDetails bk = new BookDetails("The Alice Network", "Kate Quinn", "Post-war fiction", "cloud");
		bdao.updateBookDetails(bk, 8L);
		
		
		
		//**********DELETE book************
		BookDetails deleteBookDetails = bdao.deleteBookDetails(9L);
		System.out.println("\n"+"Information of deleted book :");
		System.out.println(deleteBookDetails);
	  */
		
	}

}
