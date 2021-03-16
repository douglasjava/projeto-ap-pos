package com.energia.ap.api.openapi;

import java.util.List;

import com.energia.ap.api.exceptionhandler.Problem;
import com.energia.ap.domain.model.Endereco;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Enderecos")
@ApiResponses({ @ApiResponse(code = 201, message = "Endereco Cadastrado com sucesso"),
		@ApiResponse(code = 400, message = "ID da Endereco inválido", response = Problem.class),
		@ApiResponse(code = 404, message = "Endereco não encontrado", response = Problem.class) 
})
public interface EnderecoControllerOpenApi {
	
	@ApiOperation("Lista os Enderecos")
	List<Endereco> listar();

	@ApiOperation("Cadastra um Endereco")
	Endereco adicionar(@ApiParam(name = "corpo", value = "Representação de um novo Endereço", required = true) Endereco EnderecoInput);
	
}
