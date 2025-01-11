package com.hibernate.DAO;

import java.util.List;

import com.hibernate.entities.BookDetails;

public interface BookDAO {
	public List<BookDetails> getBookList();
	public void insertBookDetails(BookDetails book);
	public void updateBookDetails(BookDetails book, Long id);
	public BookDetails deleteBookDetails(long id);
}
