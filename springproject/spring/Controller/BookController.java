package com.training.project.BookSpringProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.project.BookSpringProject.Entity.Books;
import com.training.project.BookSpringProject.Service.Bookservice;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookController {
	@Autowired
	private Bookservice booksservice;
	
	@RequestMapping(value="/findbook", method=RequestMethod.GET)
	public List<Books> getbooks() {
			List<Books> booklist = booksservice.getAllBookDetails();
			return booklist;
	}
	@RequestMapping(value="/addbook", method=RequestMethod.POST)
	public int addbook(@RequestBody Books bk) {
		booksservice.addbook(bk);
		return 1;
	}
	
	
}
