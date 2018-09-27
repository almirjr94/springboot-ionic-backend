package com.almirjr94.cursomc.resources.exception;

import java.io.Serializable;

@SuppressWarnings("serial")
public class FieldMessage implements Serializable {
	
	private String fildName;
	private String message;
	
	public FieldMessage() {}
	
	
	public FieldMessage(String fildName, String message) {
		this.fildName = fildName;
		this.message = message;
	}



	public String getFildName() {
		return fildName;
	}

	public void setFildName(String fildName) {
		this.fildName = fildName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
