package com.qintess.banco.classes;
public class ContaCorrente extends Conta {

private double valorTaxa;

	public ContaCorrente(double saldo, int agencia, int numero, Cliente cliente, double valortaxa) {
		super(agencia, numero, saldo, cliente);
		this.valorTaxa = valortaxa;
	}

	public ContaCorrente() {
	}

	public double getValorTaxa() {
		return valorTaxa;
	}

	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		if (limite <= limiteFixo) {
			saldo += (valor + limite - limiteFixo);
			limite = limiteFixo;	
		} else {
			saldo += valor;
		}
	}

	@Override
	public void transfere(double valor, Conta conta) {
		// TODO Auto-generated method stub
		if (saca(valor)) {
			conta.deposita(valor);
			System.out.println("Transferencia realizada!!");
		} else {
			System.out.println("Impossivel realizar, saldo insuficiente!!!");
		}
	}

	@Override
	public boolean saca(double valor) {
		// TODO Auto-generated method stub
		if (saldo >= (valor + taxaSaque)) {
			this.saldo -= taxaSaque;
			this.saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado!!!");
			return true;

		} else if ((saldo + limite) >= (valor + taxaLimite)) {
			this.limite -= (valor + taxaLimite - saldo);
			this.saldo = 0;
			System.out.println("Saque de " + valor + " realizado utilizando seu limite!!");
			return true;

		} else {
			System.out.println("Saldo e limite insufientes, v� trabalhar!!!");
			return false;

		}
	}
}