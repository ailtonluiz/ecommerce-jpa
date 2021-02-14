package com.ailtonluiz.ecommerce.mapeamentobasico;

import com.ailtonluiz.ecommerce.EntityManagerTest;
import com.ailtonluiz.ecommerce.model.Cliente;
import com.ailtonluiz.ecommerce.model.SexoCliente;
import org.junit.Assert;
import org.junit.Test;

public class MapeandoEnumeracoesTest extends EntityManagerTest {

    @Test
    public void testarEnum() {
        Cliente cliente = new Cliente();
        cliente.setId(4);
        cliente.setNome("Ailton Luiz");
        cliente.setSexo(SexoCliente.MASCULINO);

        entityManager.getTransaction().begin();
        entityManager.persist(cliente);
        entityManager.getTransaction().commit();

        entityManager.clear();


        Cliente clienteVerificacao = entityManager.find(Cliente.class, cliente.getId());
        Assert.assertNotNull(clienteVerificacao);


    }
}
