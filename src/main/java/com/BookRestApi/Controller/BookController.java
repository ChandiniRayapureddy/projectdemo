package com.BookRestApi.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BookRestApi.Entity.Book;
import com.BookRestApi.Service.BookService;


@RestController
public class BookController {

private BookService bookService;
	
	public BookController(BookService bookService) {
	super();
	this.bookService = bookService;
}

	@GetMapping(value="/allBooks",
			produces= {"application/json","application/xml"})
	public ResponseEntity<List<Book>>   getAllBooks(){
		
		List<Book> allBooks=  bookService.getAllBook();
		return new ResponseEntity<List<Book>>(allBooks,HttpStatus.OK);
		
	}
	
	/*@GetMapping(value="/getBook/{bookId}",
			produces= {"application/json","application/xml"})
	public ResponseEntity<String>   getBook(@PathVariable Integer bookId){
		
		String msg=bookService.getBook(bookId);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	
	}*/
	
	
	@PutMapping(value="/upsertBook",
			produces= {"application/json","application/xml"},
			consumes= {"application/json","application/xml"})
	public ResponseEntity<String> upSertBook(@RequestBody Book book){
		
		String msg=bookService.upSert(book);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		
	}
	
	@DeleteMapping(value="/deleteBook/{bookId}",
			produces= {"application/json","application/xml"})
	public ResponseEntity<String> deleteBook(@PathVariable Integer bookId){
		
		String msg=bookService.deleteBook(bookId);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}

}

