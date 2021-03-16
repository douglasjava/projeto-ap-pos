package com.energia.ap.api.openapi;

import java.util.List;

import com.energia.ap.api.exceptionhandler.Problem;
import com.energia.ap.domain.model.Fatura;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Faturas")
@ApiResponses({ @ApiResponse(code = 201, message = "Fatura Cadastrada/Atualizada com sucesso"),
		@ApiResponse(code = 400, message = "ID da Fatura inválido", response = Problem.class),
		@ApiResponse(code = 404, message = "Fatura não encontrada", response = Problem.class) 
})
public interface FaturaControllerOpenApi {

	@ApiOperation("Lista as Faturas")
	List<Fatura> listar();
	
	@ApiOperation("Consultar Fatura pelo código")
	Fatura buscarPorCodigo(@ApiParam(value = "Código da Fatura", example = "5411769", required = true) Integer codigoFatura);
	
	@ApiOperation("Consultar Fatura pelo CPF do Cliente")
	List<Fatura> buscarPorCpf(@ApiParam(value = "CPF do Cliente da Fatura", example = "54117676369", required = true) String cpf);
	
	@ApiOperation("Cadastra uma Fatura")
	Fatura adicionar(@ApiParam(name = "corpo", value = "Representação de uma nova Fatura", required = true) Fatura faturaInput);
	
}
