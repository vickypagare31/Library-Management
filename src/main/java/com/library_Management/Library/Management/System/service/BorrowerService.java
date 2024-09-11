package com.library_Management.Library.Management.System.service;

import com.library_Management.Library.Management.System.entity.Borrower;
import com.library_Management.Library.Management.System.repository.BorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowerService {

    @Autowired
    private BorrowerRepository borrowerRepository;


    public List<Borrower>getAllBorrowers()
    {
        return borrowerRepository.findAll();
    }

    public Borrower addBorrower(Borrower borrower)
    {
        return borrowerRepository.save(borrower);
    }

}
