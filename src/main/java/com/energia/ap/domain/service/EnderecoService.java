package com.energia.ap.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.energia.ap.domain.model.Endereco;
import com.energia.ap.domain.repository.EnderecoRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class EnderecoService {

	private EnderecoRepository repository;

	public List<Endereco> buscarTodos() {
		log.info("Buscando todos os endereços");

		return repository.findAll();
	}

	@Transactional
	public Endereco save(Endereco entity) {
		log.info("Salvando endereço...");

		return repository.save(entity);
	}

}
