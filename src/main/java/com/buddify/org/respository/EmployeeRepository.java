package com.buddify.org.respository;


import org.springframework.data.repository.CrudRepository;

import com.buddify.org.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
}
