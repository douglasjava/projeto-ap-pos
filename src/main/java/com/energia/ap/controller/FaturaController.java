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

import com.energia.ap.api.openapi.FaturaControllerOpenApi;
import com.energia.ap.domain.model.Fatura;
import com.energia.ap.domain.service.FaturaService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/faturas", produces = MediaType.APPLICATION_JSON_VALUE)
public class FaturaController implements FaturaControllerOpenApi {

	private FaturaService service;
	
	@Override
	@GetMapping
	public List<Fatura> listar() {
		return service.buscarTodos();
	}

	@Override
	@GetMapping("/por-codigo/{codigoFatura}")
	public Fatura buscarPorCodigo(@PathVariable Integer codigoFatura) {
		return service.buscarFaturaPorCodigo(codigoFatura);
	}

	@Override
	@GetMapping("/por-cpf/{cpf}")
	public List<Fatura> buscarPorCpf(@PathVariable String cpf) {
		return service.buscarFaturaPorCliente(cpf);
	}

	@Override
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Fatura adicionar(@RequestBody @Valid Fatura faturaInput) {
		return service.save(faturaInput);
	}

}
