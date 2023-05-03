package com.ezoqc.defijava.repository;

import com.ezoqc.defijava.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDAO extends CrudRepository<Client, Long> {
}
