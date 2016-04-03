package com.industriousgnomes.dao.dataaccess;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

// SpringFramework creates the implementation on the fly

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);
}
