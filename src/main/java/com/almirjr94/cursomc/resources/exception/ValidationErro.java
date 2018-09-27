package com.almirjr94.cursomc.resources.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationErro extends StandardError{

	private List<FieldMessage> erros = new ArrayList<>();
	
	public ValidationErro(Integer status, String msg, Long timestamp) {
		super(status, msg, timestamp);
	}

	public List<FieldMessage> getErros() {
		return erros;
	}

	public void addError(String fieldName, String message) {
		erros.add(new FieldMessage(fieldName, message));
	}
	
	

}
