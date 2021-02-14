package com.ailtonluiz.ecommerce.mapeamentobasico;

import com.ailtonluiz.ecommerce.EntityManagerTest;
import com.ailtonluiz.ecommerce.model.EnderecoEntregaPedido;
import com.ailtonluiz.ecommerce.model.Pedido;
import com.ailtonluiz.ecommerce.model.StatusPedido;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class MapeamentoObjetoEmbutidoTest extends EntityManagerTest {

    @Test
    public void analisarMapeamentoObjetoEmbutido() {

        EnderecoEntregaPedido endereco = new EnderecoEntregaPedido();
        endereco.setCep("74950-000");
        endereco.setLogradouro("Rua das Laranjeiras");
        endereco.setBairro("Centro");
        endereco.setNumero("123");
        endereco.setCidade("Goiânia");
        endereco.setEstado("GO");


        Pedido pedido = new Pedido();
        pedido.setId(1);
        pedido.setDataPedido(LocalDateTime.now());
        pedido.setStatus(StatusPedido.AGUARDANDO);
        pedido.setTotal(new BigDecimal(1000));

        pedido.setEnderecoEntregaPedido(endereco);


        entityManager.getTransaction().begin();
        entityManager.persist(pedido);
        entityManager.getTransaction().commit();

        entityManager.clear();

        Pedido pedidoVerificado = entityManager.find(Pedido.class, pedido.getId());
        Assert.assertNotNull(pedidoVerificado.getEnderecoEntregaPedido());
        Assert.assertNotNull(pedidoVerificado.getEnderecoEntregaPedido().getCep());


    }
}
