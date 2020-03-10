
//http://www.ciceroednilson.com.br/desenvolvendo-uma-aplicacao-web-com-angular-4-e-spring-boot-parte-5-criando-os-acessos-ao-servico-rest/
//https://blog.algaworks.com/4-conceitos-sobre-rest-que-qualquer-desenvolvedor-precisa-conhecer/
package com.omelhordochile.repository;




import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omelhordochile.model.CarroModel;
 
public interface CarroRepository extends JpaRepository<CarroModel, Integer> {

 
	List<CarroModel> findAll();


}