package io.zipcoder.persistenceapp.services;

import io.zipcoder.persistenceapp.repositories.EmployeeRepo;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private EmployeeRepo repo;

     public EmployeeService(EmployeeRepo repo) {this.repo = repo;}

}
