package com.omelhordochile.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vaga {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id_Vaga;
	String nomeCliente;
	String Whatsapp;

	@ManyToOne
	private Carro carro = new Carro();
	
	
	public Vaga() {
			
	}
	
	
	public Vaga(int id_Vaga, String nomeCliente, String whatsapp) {
		super();
		this.id_Vaga = id_Vaga;
		this.nomeCliente = nomeCliente;
		Whatsapp = whatsapp;
	}

	public int getId_Vaga() {
		return id_Vaga;
	}

	public void setId_Vaga(int id_Vaga) {
		this.id_Vaga = id_Vaga;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getWhatsapp() {
		return Whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		Whatsapp = whatsapp;
	}

}
