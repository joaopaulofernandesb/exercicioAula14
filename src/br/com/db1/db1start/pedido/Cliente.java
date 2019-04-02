package br.com.db1.db1start.pedido;

import javax.net.ssl.SSLEngineResult.Status;


public class Cliente {
	
	private String nome;

	private String cpf;

	private ClienteStatus status;

	public Cliente(String nome, String cpf) {
		Verificador.naoNulo(nome, "nome do cliente");
		Verificador.naoNulo(cpf, "CPF do cliente");
		Verificador.cpf(cpf);
		
		this.nome = nome;
		this.cpf= cpf;
		this.status = ClienteStatus.ATIVO;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public ClienteStatus getStatus() {
		return status;
	}
	
	public boolean isAtivo() {
		return ClienteStatus.ATIVO.equals(this.status);
	}
}
