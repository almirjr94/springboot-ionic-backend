package com.almirjr94.cursomc.resources.exception;

import java.io.Serializable;

@SuppressWarnings("serial")
public class FieldMessage implements Serializable {
	
	private String fieldName;
	private String message;
	
	public FieldMessage() {}
	
	
	public FieldMessage(String fildName, String message) {
		this.fieldName = fildName;
		this.message = message;
	}



	public String getFieldName() {
		return fieldName;
	}

	public void setFildName(String fildName) {
		this.fieldName = fildName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
