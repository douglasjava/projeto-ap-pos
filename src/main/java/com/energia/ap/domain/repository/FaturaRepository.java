package com.energia.ap.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.energia.ap.domain.model.Cliente;
import com.energia.ap.domain.model.Fatura;

@Repository
public interface FaturaRepository extends JpaRepository<Fatura, Long> {

	Fatura findByCodigoFatura(Integer codigoFatura);

	List<Fatura> findByCliente(Cliente cliente);

}
