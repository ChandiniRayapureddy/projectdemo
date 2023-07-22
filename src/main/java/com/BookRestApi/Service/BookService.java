package com.BookRestApi.Service;

import java.util.List;

import com.BookRestApi.Entity.Book;

public interface BookService {

   public List<Book> getAllBook();
   
 //  public String getBook(Integer bookId);
	
	public String upSert(Book book);
	
	public String deleteBook(Integer bookId);

	
}
