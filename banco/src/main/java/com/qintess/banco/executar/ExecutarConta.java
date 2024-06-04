package com.qintess.banco.executar;

import com.qintess.banco.classes.Cliente;
import com.qintess.banco.classes.Conta;
import com.qintess.banco.classes.ContaCorrente;

public class ExecutarConta {
	public static void main(String[]args) {

		Conta cc = new ContaCorrente(0, 0, 0, null, 0);
		Cliente Cliente = new Cliente("Nathi", "07523453498", "675432345", "", "nafurigo@hotmail.com");
		System.out.println(Cliente);

		cc.setSaldo(100);

		System.out.println(cc.saca(50));
		System.out.println("Saldo = " + cc.getSaldo());
		System.out.println("Limite = " + cc.getLimite());

		System.out.println(cc.saca(250));
		System.out.println("Saldo = " + cc.getSaldo());
		System.out.println("Limite = " + cc.getLimite());

		System.out.println(cc.saca(100));
		System.out.println("Saldo = " + cc.getSaldo());
		System.out.println("Limite = " + cc.getLimite());

		double deposito = 500;
		cc.deposita(deposito);
		System.out.println("Deposito de = "  +  deposito);
		System.out.println("Saldo = " + cc.getSaldo());
		System.out.println("Limite = " + cc.getLimite());

		double deposito2 = 202.3;
		cc.deposita(deposito2);
		System.out.println("Deposito2 de = "  +  deposito2);
		System.out.println("Saldo = " + cc.getSaldo());
		System.out.println("Limite = " + cc.getLimite());
	}
}