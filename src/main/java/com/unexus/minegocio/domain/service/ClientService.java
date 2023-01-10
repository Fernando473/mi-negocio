package com.unexus.minegocio.domain.service;

import com.unexus.minegocio.domain.Client;
import com.unexus.minegocio.domain.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private  ClientRepository clientRepository;



    public List<Client> getAll(){
        return clientRepository.getAll();
    }

    public Optional<Client> getClient(long idClient){
        return clientRepository.getByid(idClient);
    }

    public Client save(Client client){
        return clientRepository.save(client);
    }

    public boolean delete(long id){
        return getClient(id).map(client -> {
            clientRepository.delete(id);
            return true;
        }).orElse(false);
    }

    public Optional<Client> update(long id, Client client){
        return clientRepository.update(client,id);
    }
}
