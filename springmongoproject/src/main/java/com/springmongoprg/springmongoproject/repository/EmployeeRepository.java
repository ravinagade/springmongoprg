package com.springmongoprg.springmongoproject.repository;

import com.springmongoprg.springmongoproject.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee,String> {

    @Query("{$text:{$search:?0}}")
    List<Employee> searchEmployee(String searchString);
}
