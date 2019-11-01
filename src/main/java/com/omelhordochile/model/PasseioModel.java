package com.omelhordochile.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Table(name = "Tabela_Passeios")
@Entity
public class PasseioModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String nome;
	String valor;
	
	public PasseioModel() {
		
	}
	
	
	public PasseioModel(int id, String nome, String valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}


	@Override
	public String toString() {
		return "PasseioModel [id=" + id + ", nome=" + nome + ", valor=" + valor + "]";
	}
	
	
	
	
}