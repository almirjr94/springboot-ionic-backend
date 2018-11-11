package com.almirjr94.cursomc.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CredencialDTO implements Serializable {

	private String email;
	private String senha;

	public CredencialDTO() {}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
