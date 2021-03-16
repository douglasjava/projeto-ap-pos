package com.energia.ap.domain.exception;

public class NegocioException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NegocioException(String message, Throwable cause) {
		super(message, cause);
	}

	public NegocioException(String message) {
		super(message);
	}

	public NegocioException(Long clienteId) {
		this(String.format("Não existe um cadastro com código %d", clienteId));
	}

}
