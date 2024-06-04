package com.qintess.banco.classes;

public class Cliente {
	private String nome;
	private String cpf;
	private String rg;
	private String senha;
	private String email;

	public Cliente(String nome, String cpf, String rg, String senha, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.senha = senha;
		this.email = email;
	}

	public Cliente() {
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Cliente nome = " + nome + ", cpf = " + cpf + ", rg = " + rg 
				+ ", senha=" + senha + ", \nemail=" + email;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}