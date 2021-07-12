package com.platzi.ereservation.business.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.ereservation.model.Client;



public interface ClientRepository extends JpaRepository<Client, String>{
	

	public List<Client> findByLastnameCli(String lastnameCli);
	
	public Client findByIdentification(String identificationCli);
	
}
