package com.library_Management.Library.Management.System.repository;

import com.library_Management.Library.Management.System.entity.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowerRepository extends JpaRepository<Borrower,Long> {

}
