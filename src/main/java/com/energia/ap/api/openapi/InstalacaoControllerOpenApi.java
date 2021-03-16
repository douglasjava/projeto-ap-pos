package com.energia.ap.api.openapi;

import java.util.List;

import com.energia.ap.api.exceptionhandler.Problem;
import com.energia.ap.domain.model.Instalacao;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Instalações")
@ApiResponses({ @ApiResponse(code = 201, message = "Fatura Cadastrada/Atualizada com sucesso"),
		@ApiResponse(code = 400, message = "ID da Fatura inválido", response = Problem.class),
		@ApiResponse(code = 404, message = "Fatura não encontrada", response = Problem.class) 
})
public interface InstalacaoControllerOpenApi {

	@ApiOperation("Lista as Instalações")
	List<Instalacao> listar();
	
	@ApiOperation("Consultar Instalação pelo código")
	Instalacao buscarPorCodigo(@ApiParam(value = "Código da Instalação", example = "5411769", required = true) Long id);
	
	@ApiOperation("Consultar Instalações pelo CPF do Cliente")
	List<Instalacao> buscarPorCpf(@ApiParam(value = "CPF do Cliente da Instação", example = "54117676369", required = true) String cpf);
	
	@ApiOperation("Cadastra uma Instalacao")
	Instalacao adicionar(@ApiParam(name = "corpo", value = "Representação de uma nova Instalacao", required = true) Instalacao instalacaoInput);
	
	
}
