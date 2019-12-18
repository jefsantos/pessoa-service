package com.omelhordochile.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Vaga implements Serializable{

	private static final long serialVersionUID = 1L;

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id_Vaga;
	String nomeCliente;
	String Whatsapp;

	@OneToMany(targetEntity=Vaga.class, mappedBy="college")
	@JoinColumn(name="id_Carro")
	private Carro carro ;
//	
	
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
