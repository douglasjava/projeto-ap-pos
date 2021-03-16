package com.energia.ap.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.energia.ap.api.openapi.InstalacaoControllerOpenApi;
import com.energia.ap.domain.model.Instalacao;
import com.energia.ap.domain.service.InstalacaoService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/instalacoes", produces = MediaType.APPLICATION_JSON_VALUE)
public class InstalacaoController implements InstalacaoControllerOpenApi {

	private InstalacaoService service;
	
	@Override
	@GetMapping
	public List<Instalacao> listar() {
		return service.buscarTodos();
	}

	@Override
	@GetMapping("/por-codigo/{idInstalacao}")
	public Instalacao buscarPorCodigo(@PathVariable Long idInstalacao) {
		return service.buscarInstalacaoPorCodigo(idInstalacao);
	}

	@Override
	@GetMapping("/por-cpf/{cpf}")
	public List<Instalacao> buscarPorCpf(@PathVariable String cpf) {
		return service.buscarInstacoesPorCpf(cpf);
	}

	@Override
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Instalacao adicionar(@RequestBody @Valid Instalacao instalacaoInput) {
		return service.save(instalacaoInput);
	}

}
