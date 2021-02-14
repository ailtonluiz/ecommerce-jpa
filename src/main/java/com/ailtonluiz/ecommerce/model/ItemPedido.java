package com.ailtonluiz.ecommerce.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "item_pedido")
public class ItemPedido {

    @Id
    @EqualsAndHashCode.Include
    private Integer id;

    private Integer pedidoId;
    private Integer produtoId;
    private BigDecimal precoProduto;
    private Integer quantidade;


}
