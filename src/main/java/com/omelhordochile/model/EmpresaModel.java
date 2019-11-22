package com.omelhordochile.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "tabela_empresa")
@Entity
public class EmpresaModel implements Serializable{

	private static final long serialVersionUID = 1L;

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id_empresa;
	String nome;
	String modeloCarro;
	int quantidadeTotal;
	int quantidadeLivre;
	String vaga;

	
//	Vaga vaga = new Vaga();
	
	
	public EmpresaModel() {
		
	}


	public EmpresaModel(int id_empresa, String nome, String modeloCarro, int quantidadeTotal, int quantidadeLivre, String vaga) {
		super();
		this.id_empresa = id_empresa;
		this.nome = nome;
		this.modeloCarro = modeloCarro;
		this.quantidadeTotal = quantidadeTotal;
		this.quantidadeLivre = quantidadeLivre;
		this.vaga = vaga;
	}

	public int getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModeloCarro() {
		return modeloCarro;
	}

	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}

	public int getQuantidadeTotal() {
		return quantidadeTotal;
	}

	public void setQuantidadeTotal(int quantidadeTotal) {
		this.quantidadeTotal = quantidadeTotal;
	}

	public int getQuantidadeLivre() {
		return quantidadeLivre;
	}

	public void setQuantidadeLivre(int quantidadeLivre) {
		this.quantidadeLivre = quantidadeLivre;
	}

	public String getVaga() {
		return vaga;
	}

	public void setVaga(String vaga) {
		this.vaga = vaga;
	}


	@Override
	public String toString() {
		return "EmpresaModel [id=" + id_empresa + ", nome=" + nome + ", modeloCarro=" + modeloCarro + ", quantidadeTotal="
				+ quantidadeTotal + ", quantidadeLivre=" + quantidadeLivre + ", vaga=" + vaga + "]";
	}
	
	
	
	
	
	
	

}
