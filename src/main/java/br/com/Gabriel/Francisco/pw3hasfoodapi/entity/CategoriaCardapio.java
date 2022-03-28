package br.com.Gabriel.Francisco.pw3hasfoodapi.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Column
public class CategoriaCardapio {
	//CREATE TABLE TBL_CATEGORIA_CARDAPIO (
			//ID_CATEGORIA_CARDAPIO BIGINT PRIMARY KEY IDENTITY,
			//TX_NOME VARCHAR(100),
			//ID_CARDAPIO BIGINT NOT NULL,
			//TX_STATUS VARCHAR(7) NOT NULL,
			//FOREIGN KEY (ID_CARDAPIO) REFERENCES TBL_CARDAPIO(ID_CARDAPIO)
			//);
}
