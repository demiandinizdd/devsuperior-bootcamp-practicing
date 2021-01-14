package com.devsuperior.chapter130.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.chapter130.repositories.ClientRepository;
import com.devsuperior.chapter130.entities.Client;

@Service
public class ClientService {
	@Autowired
	private ClientRepository repository;
	
	public List<Client> findAll() {
		return repository.findAll();
	}
}
