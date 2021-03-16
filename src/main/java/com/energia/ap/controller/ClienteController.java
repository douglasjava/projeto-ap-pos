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

import com.energia.ap.api.openapi.ClienteControllerOpenApi;
import com.energia.ap.domain.model.Cliente;
import com.energia.ap.domain.service.ClienteService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/clientes", produces = MediaType.APPLICATION_JSON_VALUE)
public class ClienteController implements ClienteControllerOpenApi {

	private ClienteService service;
	
	@Override
	@GetMapping
	public List<Cliente> listar() {
		return service.buscarTodos();
	}

	@Override
	@GetMapping("/{cpf}")
	public Cliente buscarPorCpf(@PathVariable String cpf) {
		return service.buscarClientePorCpf(cpf);
	}

	@Override
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente adicionar(@RequestBody @Valid Cliente clienteInput) {
		return service.save(clienteInput);
	}

}
