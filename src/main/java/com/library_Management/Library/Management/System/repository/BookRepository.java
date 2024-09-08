package com.library_Management.Library.Management.System.repository;

import com.library_Management.Library.Management.System.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByIsBorrowed(boolean isBorrowed);
}
