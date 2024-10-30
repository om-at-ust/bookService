package com.demo.book_service.controller;

import java.util.List;

import com.demo.book_service.client.Author;
import com.demo.book_service.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.book_service.dao.BookRepository;
import com.demo.book_service.entity.Book;

@RestController
@RequestMapping("/api/book")
public class BookController {

	@Autowired
	BooksService booksService;
	
	@GetMapping("/getbook")
	public List<Book> getAllBooks() {
		return booksService.getAllBooks();
	}
	
	@GetMapping("/books/{bookName}")
	public Book getABooks(@PathVariable String bookName) {
		return booksService.getABooks(bookName);
	}
	
	@PostMapping("/addbook")
	public Book addBook(@RequestBody Book newBook) {
		return booksService.addBook(newBook);
	}

	@GetMapping
	public List<Author> getAllAuthors() {
		return booksService.getAllAuthors();
	}

	@GetMapping("/getauthor/{authorId}")
	public Author getAuthorById(@PathVariable String authorId) {
		return booksService.getAuthorById(authorId);
	}
}
