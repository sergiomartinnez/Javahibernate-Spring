package com.platzi.ereservation.view.resources;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platzi.ereservation.business.services.ClientService;
import com.platzi.ereservation.model.Client;
import com.platzi.ereservation.view.resources.vo.ClientVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping("/api/client")
@Api(tags = "client")
public class ClientResource {

	private final ClientService clientService;

	public ClientResource(ClientService clientService) {
		this.clientService = clientService;
	}

	@PostMapping
	@ApiOperation(value = "creates client", notes = "Service for creating new client")
	@ApiResponses(value = {@ApiResponse(code = 201, message = "Successful created client"),
			@ApiResponse(code = 400, message = "Invalid request")})
	public ResponseEntity<Client> createClient(@RequestBody ClientVO clientVO) {
		Client client = new Client();
		client.setNameCli(clientVO.getNameCli());
		client.setLastnameCli(clientVO.getLastnameCli());
		client.setDirectionCli(clientVO.getDirectionCli());
		client.setPhoneCli(clientVO.getPhoneCli());
		client.setEmailCli(clientVO.getPhoneCli());
		return new ResponseEntity<>(this.clientService.create(client), HttpStatus.CREATED);
	}

	@PutMapping("/{identification}")
	@ApiOperation(value = "update client", notes = "Service for updating client")
	@ApiResponses(value = {@ApiResponse(code = 201, message = "Successful updated client"),
			@ApiResponse(code = 404, message = "client not found")})
	public ResponseEntity<Client> updateClient(@PathVariable("identification") String identification, ClientVO clientVO) {
		
		
		Client client = this.clientService.findByIdentification(identification);
		if (client == null) {
			return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
		} else {
			client.setNameCli(clientVO.getNameCli());
			client.setLastnameCli(clientVO.getLastnameCli());
			client.setDirectionCli(clientVO.getDirectionCli());
			client.setPhoneCli(clientVO.getPhoneCli());
			client.setEmailCli(clientVO.getPhoneCli());
		}
		return new ResponseEntity<>(this.clientService.update(client), HttpStatus.OK);
	}
	
	@DeleteMapping("/{identification}")
	@ApiOperation(value = "delete client", notes = "Service for deleting client")
	@ApiResponses(value = {@ApiResponse(code = 201, message = "Successful deleted client"),
			@ApiResponse(code = 404, message = "client not found")})
	public void removeClient(@PathVariable("identification") String identification){
		Client client = this.clientService.findByIdentification(identification);
		if(client != null) {
			this.clientService.delete(client);
			
		}
	} 
	
	@GetMapping
	@ApiOperation(value = "List client", notes = "Service for list all clients")
	@ApiResponses(value = {@ApiResponse(code = 201, message = "Successful listed clients"),
			@ApiResponse(code = 404, message = "clients not found")})
	public ResponseEntity<List<Client>> findAll(){
		return ResponseEntity.ok(this.clientService.findAll());
			
	}
				
			

}












