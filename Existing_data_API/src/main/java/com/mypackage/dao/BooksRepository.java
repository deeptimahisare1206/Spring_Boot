package com.mypackage.dao;

import org.springframework.data.repository.CrudRepository;

import com.mypackage.entity.Books;

public interface BooksRepository extends CrudRepository<Books, Integer> {

}
