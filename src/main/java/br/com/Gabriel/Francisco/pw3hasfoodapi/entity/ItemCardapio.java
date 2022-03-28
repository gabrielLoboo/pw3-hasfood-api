package br.com.Gabriel.Francisco.pw3hasfoodapi.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Column
public class ItemCardapio {
	//CREATE TABLE TBL_ITEM_CARDAPIO (
			//ID_ITEM_CARDAPIO BIGINT PRIMARY KEY IDENTITY,
			//TX_NOME VARCHAR(150),
			//TX_DESCRICAO VARCHAR(255),
			//TX_STATUS VARCHAR(7) NOT NULL,
			//ID_CATEGORIA_CARDAPIO BIGINT NOT NULL,
			//FOREIGN KEY (ID_CATEGORIA_CARDAPIO) REFERENCES TBL_CATEGORIA_CARDAPIO(ID_CATEGORIA_CARDAPIO)
			//);
}
