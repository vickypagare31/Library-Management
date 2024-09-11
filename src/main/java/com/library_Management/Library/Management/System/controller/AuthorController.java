package com.library_Management.Library.Management.System.controller;

import com.library_Management.Library.Management.System.entity.Author;
import com.library_Management.Library.Management.System.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping()
    public List<Author>getAllAuthors()
    {
        return authorService.getAllAuthors();
    }

    @PostMapping()
    public ResponseEntity<Author>addAuthor(Author author)
    {
        Author addedAuthor=authorService.addAuthor(author);
        return ResponseEntity.ok(addedAuthor);
    }

}
