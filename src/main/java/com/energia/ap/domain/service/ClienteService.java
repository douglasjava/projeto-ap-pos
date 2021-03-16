package com.energia.ap.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.energia.ap.domain.exception.NegocioException;
import com.energia.ap.domain.model.Cliente;
import com.energia.ap.domain.repository.ClienteRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class ClienteService {

	private ClienteRepository repository;

	public List<Cliente> buscarTodos() {
		log.info("Buscando todos os clientes");
		return repository.findAll();

	}

	public Cliente buscarClientePorCpf(String cpf) {
		log.info("Buscando cliente pelo cpf {} ", cpf);
		
		return repository.findByCpf(cpf).orElseThrow(
				() -> new NegocioException(String.format("Não existe um cadastro de cliente com cpf %s", cpf)));

	}

	@Transactional
	public Cliente save(Cliente entity) {
		log.info("Salvando cliente...");
		
		return repository.save(entity);

	}

}
