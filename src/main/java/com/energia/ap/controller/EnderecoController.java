package com.energia.ap.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.energia.ap.api.openapi.EnderecoControllerOpenApi;
import com.energia.ap.domain.model.Endereco;
import com.energia.ap.domain.service.EnderecoService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/enderecos", produces = MediaType.APPLICATION_JSON_VALUE)
public class EnderecoController implements EnderecoControllerOpenApi {

	private EnderecoService service;
	
	@Override
	@GetMapping
	public List<Endereco> listar() {
		return service.buscarTodos();
	}

	@Override
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Endereco adicionar(@RequestBody @Valid Endereco EnderecoInput) {
		return service.save(EnderecoInput);
	}

}
