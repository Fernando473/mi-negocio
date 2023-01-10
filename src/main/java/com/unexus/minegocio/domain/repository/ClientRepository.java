package com.unexus.minegocio.domain.repository;

import com.unexus.minegocio.domain.Client;
import com.unexus.minegocio.persitence.entity.Cliente;

import java.util.List;
import java.util.Optional;
/*
 * Created by: Fernando Sangopanta
 */
public interface ClientRepository {
    Client save(Client client);
    Optional<Client> getByid(Long id);
    List<Client> getAll();
    void delete(Long id);

    Optional<Client> update(Client client, long id);
}
