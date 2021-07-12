package com.platzi.ereservation.business.services;

import java.util.List;

import javax.websocket.ClientEndpoint;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.platzi.ereservation.business.repository.ClientRepository;
import com.platzi.ereservation.model.Client;

@Service
@Transactional(readOnly = true)
public class ClientService {
	private final ClientRepository clientRepository;
	
	public ClientService(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	
	@Transactional
	public Client create(Client client){
		return this.clientRepository.save(client);
	}
	
	@Transactional
	public Client update(Client client){
		return this.clientRepository.save(client);
	}
	
	@Transactional
	public void delete(Client client){
		this.clientRepository.delete(client);
	}
	
	public Client findByIdentification(String identificationCli) {
		return this.clientRepository.findByIdentification(identificationCli);
	}
	
	public List<Client> findAll() {
		return this.clientRepository.findAll();
	}
} 
