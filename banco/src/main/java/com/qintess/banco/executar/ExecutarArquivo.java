package com.qintess.banco.executar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.qintess.banco.classes.Cliente;
import com.qintess.banco.classes.ContaCorrente;

public class ExecutarArquivo {
	public static void main(String[] args) throws NumberFormatException, FileNotFoundException {

		File arquivo = new File("C:\\Users\\re042534\\Desktop\\Projetos\\DesafioBanco\\banco\\contas.txt");
		Scanner cont = new Scanner(arquivo);

		while (cont.hasNextLine()) {
			String [] colunas = cont.nextLine().split(";");

			Cliente cliente = new Cliente();
			ContaCorrente cc = new ContaCorrente();
			
			String agencia = colunas[0];
			String numero = colunas[1];
			String digito = colunas[2];
			String saldo = colunas[3];
			String nome = colunas[4];
			String cpf = colunas[5];
			String tipodaconta = colunas[6];

			cc.setAgencia(Integer.parseInt(colunas[0]));
			cc.setNumero(Integer.parseInt(colunas[1]));
			cc.setDigito(Integer.parseInt(colunas[2]));
			cc.setSaldo(Double.parseDouble(colunas[3].replace(',', '.')));
			cliente.setNome(String.valueOf(colunas[4]));
			cliente.setCpf(String.valueOf(colunas[5]));
			cc.setCliente(cliente);

			System.out.println(cc);
		}
	}
}