package Programa;

import javax.swing.text.Utilities;

import Utilitarios.Utils;

public class Conta {

	private static int cont = 1;

	private int numeroConta;
	private Pessoa pessoa;
	private Double saldo = 0.0;

	// construtor
	public Conta(Pessoa pessoa) {
		this.numeroConta = cont;
		this.pessoa = pessoa;
		cont += 1;
	}

	// get and setters
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String toString() {
		return "\nNúmero da conta: " + this.getNumeroConta() + "\nNome: " + this.pessoa.getNome() + "\nCPF: "
				+ this.pessoa.getCPF() + "\nEmail: " + this.pessoa.getEmail() + "\nSaldo: "
				+ Utils.doubleToString(this.getSaldo()) + "\n";
	}

	public void Depositar(double valor) {
		if (valor > 0) {
			setSaldo(getSaldo() + valor);
			System.out.println("Seu depósito foi realizado com sucesso!");
		} else {
			System.out.println("Não foi possível realizar o depósito.");
		}
	}

	public void Sacar(double valor) {
		if (valor > 0 && this.getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			System.out.println("Seu saque foi realizado com sucesso!");
		} else {
			System.out.println("Não foi possível realizar o depósito.");
		}
	}
	
	public void Transferir(Conta contaParaDeposito, Double valor) {
		if (valor > 0 && this.getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
			System.out.println("Sua transferência foi realizada com sucesso!");
		} else {
			System.out.println("Não foi possível realizar a transferência.");
		}
	}
}


