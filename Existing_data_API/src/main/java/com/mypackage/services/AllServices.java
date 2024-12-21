package com.mypackage.services;

import java.awt.print.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypackage.dao.BooksRepository;
import com.mypackage.entity.Books;

@Service
public class AllServices {

	@Autowired
	BooksRepository booksRepository;
	
	public Iterable<Books> view(){
		
		Iterable<Books> it = booksRepository.findAll();
		return it;
	}
	
}
