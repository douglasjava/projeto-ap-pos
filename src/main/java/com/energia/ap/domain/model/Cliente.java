package com.energia.ap.domain.model;

import java.time.LocalDate;

import javax.persistence.Column;
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
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@ApiModelProperty(example = "10146710606", required = true)
	private String cpf;

	@NotBlank
	@ApiModelProperty(example = "Douglas Marques Dias", required = true)
	private String nome;

	@ApiModelProperty(example = "2021-03-15", required = true)
	@Column(nullable = false, columnDefinition = "datetime", name = "data_nascimento")
	private LocalDate dataNascimento;

}
