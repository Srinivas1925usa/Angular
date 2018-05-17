/*package io.javabrains;

import org.junit.runner.RunWith;
import org.springframework.boot.actuate.trace.http.HttpTrace.Response;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;

import io.javabrains.model.Book;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { Application.class }, webEnvironment = WebEnvironment.DEFINED_PORT)
public class LiveTest {
	
	private static final String API_ROOT
    = "http://localhost:8081/api/books";

	private Book createRandomBook() {
        Book book = new Book();
        book.setTitle(randomAlphabetic(10));
        book.setAuthor(randomAlphabetic(15));
        return book;
    }
 
    private String createBookAsUri(Book book) {
        Response response = RestAssured.given()
          .contentType(MediaType.APPLICATION_JSON_VALUE)
          .body(book)
          .post(API_ROOT);
        return API_ROOT + "/" + response.jsonPath().get("id");
    }
}*/