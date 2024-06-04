package com.qintess.banco.classes;

public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
		super();

	}

	public ContaPoupanca(int agencia, int numero, double saldo, Cliente cliente) {
		super(agencia, numero, saldo, cliente);
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void transfere(double valor, Conta conta) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean saca(double valor) {
		// TODO Auto-generated method stub
		return true;
	}
}