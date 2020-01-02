package com.omelhordochile.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Table(name = "tabela_carro")
@Entity
public class CarroModel implements Serializable{

	private static final long serialVersionUID = 1L;

//	create table carro(
//
//			id_carro int not null AUTO_INCREMENT,
//			modelo varchar (50),
//			quantidade_Vagas varchar (50), 
//			quantidade_Livre varchar (50),
//		  empresa_id integer,
//		  PRIMARY KEY ( id_carro )  
//		  
//		  );
//

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id_Carro;
	String modelo;
	int quantidade_Vagas;
	int quantidade_Livre;
	
	
	@ManyToOne
	@JoinColumn(name="empresa_id")
	private EmpresaModel empresaModel;
	
		
	public CarroModel() {
		
	}
	
//	https://www.udemy.com/course/spring-boot-ionic/learn/lecture/8090550#overview
	public CarroModel(int id_Carro, String modelo, int quantidade_Vagas, int quantidade_Livre) {
		super();
		this.id_Carro = id_Carro;
		this.modelo = modelo;
		this.quantidade_Vagas = quantidade_Vagas;
		this.quantidade_Livre = quantidade_Livre;
	}

	public int getId_Carro() {
		return id_Carro;
	}

	public void setId_Carro(int id_Carro) {
		this.id_Carro = id_Carro;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQuantidade_Vagas() {
		return quantidade_Vagas;
	}

	public void setQuantidade_Vagas(int quantidade_Vagas) {
		this.quantidade_Vagas = quantidade_Vagas;
	}

	public int getQuantidade_Livre() {
		return quantidade_Livre;
	}

	public void setQuantidade_Livre(int quantidade_Livre) {
		this.quantidade_Livre = quantidade_Livre;
	}

	public EmpresaModel getEmpresaModel() {
		return empresaModel;
	}

	public void setEmpresaModel(EmpresaModel empresaModel) {
		this.empresaModel = empresaModel;
	}


	
	
}
