package com.energia.ap.domain.model;

import java.math.BigDecimal;
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
public class Fatura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ApiModelProperty(example = "159", required = true)
	@Column(name = "codigo_fatura")
	private Integer codigoFatura;

	@ManyToOne
	@JoinColumn(nullable = false, name = "id_cliente")
	private Cliente cliente;

	@ApiModelProperty(example = "2019-12-01T20:34:04Z", required = true)
	@Column(nullable = false, columnDefinition = "datetime", name = "data_vencimento")
	private LocalDate dataVencimento;

	@ApiModelProperty(example = "2019-12-01T20:34:04Z", required = true)
	@Column(nullable = false, columnDefinition = "datetime", name = "data_leitura")
	private LocalDate dataLeitura;

	@ApiModelProperty(example = "159", required = true)
	@Column(name = "valor_leitura")
	private String valorLeitura;

	@ApiModelProperty(example = "159.0", required = true)
	@Column(name = "valor_conta")
	private BigDecimal valorConta;

	@ManyToOne
	@JoinColumn(nullable = false, name = "id_instalacao")
	private Instalacao instalacao;

}
