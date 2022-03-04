package com.cba44.springboot.basics.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cba44.springboot.basics.library.Book;

@RestController
public class BooksController {
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return Arrays.asList(new Book(1l, "Mastering Spring Boot", "John Doe"));
	}
}
