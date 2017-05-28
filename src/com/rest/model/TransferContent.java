package com.rest.model;

import java.io.Serializable;

public class TransferContent implements Serializable {

	private static final long serialVersionUID = 1L;

	private String servidorId;
	
	private String data;
	
	private String servicoNome;
	
	private String conteudo;

	public String getServidorId() {
		return servidorId;
	}

	public void setServidorId(String servidorId) {
		this.servidorId = servidorId;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public String getServicoNome() {
		return servicoNome;
	}

	public void setServicoNome(String servicoNome) {
		this.servicoNome = servicoNome;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
}