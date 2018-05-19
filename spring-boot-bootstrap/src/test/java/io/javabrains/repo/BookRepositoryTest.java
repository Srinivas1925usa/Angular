package io.javabrains.repo;

import static org.junit.Assert.assertThat;
import static org.assertj.core.api.Assertions.*;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import io.javabrains.model.Book;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryTest {

	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private BookRepository bookRepository;
//Failed Test
	
	@Test
	public void testCreateBook() {
		
		Book book = getBook();
		
		Book saveInDB = entityManager.persist(book);
		entityManager.flush();
		
		Book  found = (Book) bookRepository.findByTitle(saveInDB.getTitle());
		
		assertThat(found).isEqualTo(saveInDB);
	}
	
	private Book getBook() {
		
		Book book = new Book();
		book.setId(15);
		book.setTitle("java");
		book.setAuthor("Srinivas");
		
		return book;
		
	}
}
