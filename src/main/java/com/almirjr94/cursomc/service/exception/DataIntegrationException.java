package com.almirjr94.cursomc.service.exception;

public class DataIntegrationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DataIntegrationException(String msg) {
		super(msg);
	}

	public DataIntegrationException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
