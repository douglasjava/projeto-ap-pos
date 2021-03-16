package com.energia.ap.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.energia.ap.domain.model.Cliente;
import com.energia.ap.domain.model.Instalacao;

@Repository
public interface InstalacaoRepository extends JpaRepository<Instalacao, Long> {

	List<Instalacao> findByCliente(Cliente cliente);

}
