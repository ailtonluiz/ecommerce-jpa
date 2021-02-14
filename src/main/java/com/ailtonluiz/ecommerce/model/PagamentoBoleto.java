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
@Table(name = "pagamento_boleto")
public class PagamentoBoleto {

    @Id
    @EqualsAndHashCode.Include
    private Integer id;

    private StatusPagamento status;

    private Integer pedidoId;

    private String codigoBarras;


}
