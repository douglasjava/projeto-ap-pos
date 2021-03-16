package com.energia.ap.domain.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
public class Instalacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ApiModelProperty(example = "2019-12-01T20:34:04Z", required = true)
	@Column(nullable = false, columnDefinition = "datetime", name = "data_instalacao")
	private LocalDate dataInstalacao;

	@ManyToOne
	@JoinColumn(nullable = false, name = "id_endereco_cobranca")
	private Endereco enderecoCobranca;

	@ManyToOne
	@JoinColumn(nullable = false, name = "id_cliente")
	private Cliente cliente;

}
