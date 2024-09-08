package com.library_Management.Library.Management.System.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "books")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String book_title;
    private String isbn;
    private String publisher;
    private int yearPublished;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)   //nullable = false (it means that every book must have an author, its mandatory so the author_id field can not be null)
    private Author author;

    @ManyToOne
    @JoinColumn(name = "borrower_id")
    private Borrower borrower;

    private boolean isBorrowed;
}
