package com.energia.ap.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.energia.ap.domain.model.Cliente;
import com.energia.ap.domain.model.Fatura;
import com.energia.ap.domain.repository.FaturaRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class FaturaService {

	private FaturaRepository repository;
	private ClienteService clienteService;

	public List<Fatura> buscarTodos() {
		log.info("Buscando todas as faturas");
		return repository.findAll();

	}

	public Fatura buscarFaturaPorCodigo(Integer codigoFatura) {
		log.info("Buscando fatura por código {} ", codigoFatura);
		return repository.findByCodigoFatura(codigoFatura);

	}

	public List<Fatura> buscarFaturaPorCliente(String cpf) {
		log.info("Buscando fatura por cpf {} ", cpf);
		
		Cliente cliente = clienteService.buscarClientePorCpf(cpf);
		
		return repository.findByCliente(cliente);

	}

	@Transactional
	public Fatura save(Fatura entity) {		
		log.info("Salvando fatura...");
		
		return repository.save(entity);

	}

}
