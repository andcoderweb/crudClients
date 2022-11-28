package com.crudClients.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.crudClients.entities.Client;

public interface ClientRepository extends  JpaRepository<Client,Long> {

}
