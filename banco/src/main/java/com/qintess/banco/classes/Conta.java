package com.qintess.banco.classes;

public abstract class Conta {
	protected int agencia;
	protected int numero;
	protected int digito;


	protected double saldo;
	protected Cliente cliente;
	protected double limiteFixo = 300;
	protected double limite = limiteFixo;
	protected double taxaSaque = 0.3;
	protected double taxaLimite = 2;

	public Conta() {
	}

	public Conta(int agencia, int numero, double saldo, Cliente cliente) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getLimite() {
		return limite;
	}

	public double getTaxaLimite() {
		return taxaLimite;
	}

	public void setTaxaLimite(double taxaLimite) {
		this.taxaLimite = taxaLimite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getTaxaSaque() {
		return taxaSaque;
	}

	public void setTaxaSaque(double taxaSaque) {
		this.taxaSaque = taxaSaque;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Conta agencia = " + agencia + ", numero = " + numero + 
				", saldo = " + saldo + ", \ncliente = " + cliente+ ", limite = " + limite 
				+ ", taxaSaque = " + taxaSaque + ", taxaLimite = " + taxaLimite ;
	} 

	public double getLimiteFixo() {
		return limiteFixo;
	}

	public void setLimiteFixo(double limiteFixo) {
		this.limiteFixo = limiteFixo;
	}

	public abstract void deposita (double valor);
	public abstract void transfere (double valor, Conta conta);
	public abstract boolean saca (double valor);

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}
}