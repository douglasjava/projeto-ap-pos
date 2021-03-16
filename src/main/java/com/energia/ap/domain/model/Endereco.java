package com.energia.ap.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@ApiModelProperty(example = "38400-000", required = true)
	private String cep;

	@NotBlank
	@ApiModelProperty(example = "Rua Floriano Peixoto", required = true)
	private String logradouro;

	@NotBlank
	@ApiModelProperty(example = "\"1500\"", required = true)
	private String numero;

	@ApiModelProperty(example = "Apto 901")
	private String complemento;

	@NotBlank
	@ApiModelProperty(example = "Centro", required = true)
	private String bairro;

	@NotBlank
	@ApiModelProperty(example = "Contagem", required = true)
	private String cidade;

}
