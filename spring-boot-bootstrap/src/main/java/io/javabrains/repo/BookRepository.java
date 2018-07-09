package io.javabrains.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.javabrains.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	    List<Book> findByTitle(String title);
	}

