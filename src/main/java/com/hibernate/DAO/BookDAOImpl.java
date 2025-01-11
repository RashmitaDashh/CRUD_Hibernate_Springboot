package com.hibernate.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.hibernate.config.HibernateConfig;
import com.hibernate.entities.BookDetails;

@Repository
public class BookDAOImpl implements BookDAO{

	// GET LIST OF ALL BOOKS
	@Override
	public List<BookDetails> getBookList() {
		List<BookDetails> books= null;
		Transaction transaction = null;
		try(Session session = HibernateConfig.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			books = session.createQuery("from book_details", BookDetails.class).list();
			transaction.commit();
		} catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return books;
	}

	//INSERT A BOOK
	@Override
	public void insertBookDetails(BookDetails book) {
		Transaction transaction = null;
		System.out.println(book);
		try(Session session = HibernateConfig.getSessionFactory().openSession()) {
			System.out.println(book);
			transaction = session.beginTransaction();
			session.save(book);
			transaction.commit();
		} catch(Exception e) {
			//transaction.rollback();
			e.printStackTrace();
		}
	}

	//UPDATE A BOOK
	@Override
	public void updateBookDetails(BookDetails book, Long id) {
		Transaction transaction = null;
		String name = book.getName();
		String author = book.getAuthor();
		String genre = book.getGenre();
		String seller = book.getSeller();
		try(Session session = HibernateConfig.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			BookDetails bk = session.get(BookDetails.class, id);
			bk.setName(name);
			bk.setAuthor(author);
			bk.setGenre(genre);
			bk.setSeller(seller);
			session.update(bk);
			transaction.commit();
			
		} catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}
	
	//DELETE A BOOK
	@Override
	public BookDetails deleteBookDetails(long id) {
		Transaction transaction = null;
		BookDetails book = null;
		try(Session session = HibernateConfig.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			book = session.get(BookDetails.class, id); 
			session.delete(book);
			transaction.commit();
		} catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return book;
	}

}
