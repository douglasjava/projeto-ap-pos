package com.energia.ap.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.energia.ap.domain.exception.NegocioException;
import com.energia.ap.domain.model.Cliente;
import com.energia.ap.domain.model.Instalacao;
import com.energia.ap.domain.repository.InstalacaoRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class InstalacaoService {

	private InstalacaoRepository repository;
	private ClienteService clienteService;

	public List<Instalacao> buscarTodos() {
		log.info("Buscando todas as Instalacao");

		return repository.findAll();

	}

	public Instalacao buscarInstalacaoPorCodigo(Long id) {
		log.info("Buscando Instalacao pelo id {}", id);

		return repository.findById(id).orElseThrow(() -> new NegocioException(id));

	}

	public List<Instalacao> buscarInstacoesPorCpf(String cpf) {
		log.info("Buscando Instalacao pelo cpf {}", cpf);
		
		Cliente cliente = clienteService.buscarClientePorCpf(cpf);

		return repository.findByCliente(cliente);

	}

	@Transactional
	public Instalacao save(Instalacao entity) {
		log.info("Salvando instalação");

		return repository.save(entity);

	}

}
