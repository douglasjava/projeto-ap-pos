package com.energia.ap.api.openapi;

import java.util.List;

import com.energia.ap.api.exceptionhandler.Problem;
import com.energia.ap.domain.model.Cliente;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Clientes")
@ApiResponses({ @ApiResponse(code = 201, message = "Cliente Cadastrado/Atualizado com sucesso"),
		@ApiResponse(code = 400, message = "ID da Cliente inválido", response = Problem.class),
		@ApiResponse(code = 404, message = "Cliente não encontrada", response = Problem.class) 
})
public interface ClienteControllerOpenApi {

	@ApiOperation("Lista as cidades")
	List<Cliente> listar();
	
	@ApiOperation("Consultar cliente pelo CPF")
	Cliente buscarPorCpf(@ApiParam(value = "CPF do cliente", example = "54117676369", required = true) String cpf);
	
	@ApiOperation("Cadastra um cliente")
	Cliente adicionar(@ApiParam(name = "corpo", value = "Representação de um novo cliente", required = true) Cliente clienteInput);

}
