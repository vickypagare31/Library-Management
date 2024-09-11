package com.library_Management.Library.Management.System.service;


import com.library_Management.Library.Management.System.entity.Book;
import com.library_Management.Library.Management.System.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id){
        return bookRepository.findById(id);
    }

    public Book addBook(Book book){
        return bookRepository.save(book);
    }

    public void deleteBook(Long id){
         bookRepository.deleteById(id);
    }

    public List<Book> getBorrowedBooks(){
        return bookRepository.findByIsBorrowed(true);
    }

}
