package com.library_Management.Library.Management.System.controller;


import com.library_Management.Library.Management.System.entity.Book;
import com.library_Management.Library.Management.System.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("books")

public class BookController {

    @Autowired
private BookService bookService;


    @GetMapping()
    public List<Book> getAllBooks()
    {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book>getBookById(@PathVariable Long id)
    {
       Optional<Book>book= bookService.getBookById(id);
       return book.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }

    @PostMapping()
    public ResponseEntity<Book>addBook(Book book)
    {
        Book savedBook= bookService.addBook(book);
        return ResponseEntity.ok(savedBook);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>deleteBook(@PathVariable Long id)
    {
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/borrowed")
    public List<Book>getBorrowedBooks()
    {
        return bookService.getBorrowedBooks();
    }
}
