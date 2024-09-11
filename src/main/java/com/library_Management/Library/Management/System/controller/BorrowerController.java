package com.library_Management.Library.Management.System.controller;


import com.library_Management.Library.Management.System.entity.Book;
import com.library_Management.Library.Management.System.entity.Borrower;
import com.library_Management.Library.Management.System.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/borrowers")
public class BorrowerController {

    @Autowired
    private BorrowerService borrowerService;

     @GetMapping()
    public List<Borrower>getAllBorrowers()
    {
        return borrowerService.getAllBorrowers();
    }

    @PostMapping()
    public ResponseEntity<Borrower>addBorrower(Borrower borrower)
    {
        Borrower addedBorrower = borrowerService.addBorrower(borrower);
        return ResponseEntity.ok(addedBorrower);
    }


}
