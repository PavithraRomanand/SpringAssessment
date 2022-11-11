package com.training.project.BookSpringProject.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.project.BookSpringProject.Entity.Books;
import com.training.project.BookSpringProject.Repository.BooksDAO;

@Service
public class Bookservice {
	@Autowired
	private BooksDAO booksdao;
	public List<Books> getAllBookDetails(){
		List<Books> booklist = booksdao.getAllBooks();
		return booklist;
	}
	public void addbook(Books bk) {
		booksdao.addBook(bk);
	}

	public Books Buy(int bookid) {
		Books book = new Books();
		book = booksdao.getbook(bookid);
		if(book.isInstock() == true) 
			return book;
		else
			return null;	
		}
		
}


