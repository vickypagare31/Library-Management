package com.library_Management.Library.Management.System.service;


import com.library_Management.Library.Management.System.entity.Author;
import com.library_Management.Library.Management.System.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author>getAllAuthors(){
        return authorRepository.findAll();
    }

    public Author addAuthor(Author author)
    {
        return authorRepository.save(author);
    }

}
