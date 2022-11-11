package com.training.project.BookSpringProject.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.project.BookSpringProject.Entity.Books;
@Repository
public class BooksDAO {
	@Autowired
	private BookRepository repo;
	public Books getbook(int bookid){
    	Optional<Books> book = repo.findById(bookid);
    	Books doc=book.get();
		return doc;
    }
	public List<Books> getAllBooks(){
		List<Books> booklist = new ArrayList<Books>();
		booklist = repo.findAll();
		return booklist;
	} 
	public String addBook( Books b) 
    {
       repo.save(b); 	
       return "Book added Successfully with Id: " +b.getBookid();
    }
	
	public String removebook(Books b) {
		repo.deleteById(b.getBookid());
		return "Successfully Deleted by Id "+b.getBookid();
	}
	public String modifyBook(Books b) {
	    repo.save(b);
	    return "Book Successfully updated with id"+b.getBookid();
	}

}
