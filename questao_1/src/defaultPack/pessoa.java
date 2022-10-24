package defaultPack;

import java.util.Scanner;

public class pessoa {
	String nome;
	int idade, cpf;
	
	public pessoa(String nome, int idade,int cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	public pessoa() {
		nome = "";
		idade = 0;
		cpf = 0;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	
}
