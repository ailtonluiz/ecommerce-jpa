package com.ailtonluiz.ecommerce.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "cliente")
public class Cliente {

    @EqualsAndHashCode.Include
    @Id
    private Integer id;

    private String nome;

    private SexoCliente sexo;


}
