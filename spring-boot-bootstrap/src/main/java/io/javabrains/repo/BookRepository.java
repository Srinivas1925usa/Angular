package io.javabrains.repo;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import io.javabrains.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

	    List<Book> findByTitle(String title);
	}

