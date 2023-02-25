package com.bookmanagement.bookmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmanagement.bookmanagement.dto.BookDto;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

	@GetMapping

	public ResponseEntity<List<BookDto>> getBooks() {
		BookDto book = BookDto.builder().title("my book").build();
		List<BookDto> books = new ArrayList<BookDto>();
		books.add(book);
		System.out.println("test");

		return ResponseEntity.ok(books);

	}

}
