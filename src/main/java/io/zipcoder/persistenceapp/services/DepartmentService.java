package io.zipcoder.persistenceapp.services;

import io.zipcoder.persistenceapp.repositories.DepartmentRepo;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private DepartmentRepo repo;

    public DepartmentService(DepartmentRepo repo) {
        this.repo = repo;
    }
}
