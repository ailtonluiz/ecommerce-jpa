package com.ailtonluiz.ecommerce.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "estoque")
public class Estoque {

    @Id
    @EqualsAndHashCode.Include
    private Integer id;

    private Integer produtoId;

    private Integer quantidade;


}
