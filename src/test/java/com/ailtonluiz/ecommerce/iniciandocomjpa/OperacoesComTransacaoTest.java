package com.ailtonluiz.ecommerce.iniciandocomjpa;

import com.ailtonluiz.ecommerce.EntityManagerTest;
import com.ailtonluiz.ecommerce.model.Produto;
import org.junit.Test;

import java.math.BigDecimal;

public class OperacoesComTransacaoTest extends EntityManagerTest {

    @Test
    public void inserirOPrimeiroObjeto() {
        Produto produto = new Produto();

        produto.setId(2);
        produto.setNome("Câmera Canon");
        produto.setDescricao("A melhor definição para suas fotos.");
        produto.setPreco(new BigDecimal(5000));

        entityManager.getTransaction().begin();

        entityManager.persist(produto);

        entityManager.getTransaction().commit();

        entityManager.clear();

    }

    public void abrirEFecharATransacao() {

        entityManager.getTransaction().begin();

        entityManager.getTransaction().commit();
    }
}
