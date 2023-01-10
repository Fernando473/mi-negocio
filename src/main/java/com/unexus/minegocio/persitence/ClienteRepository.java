package com.unexus.minegocio.persitence;

import com.unexus.minegocio.domain.Client;
import com.unexus.minegocio.domain.repository.ClientRepository;
import com.unexus.minegocio.persitence.crud.ClienteCRUDRepository;
import com.unexus.minegocio.persitence.entity.Cliente;
import com.unexus.minegocio.persitence.mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
/*
 * Created by: Fernando Sangopanta
 */
@Repository
public class ClienteRepository implements  ClientRepository{
    //Inyeccion de dependencias
    @Autowired
    private ClienteCRUDRepository clienteCrudRepository;
    @Autowired
    private ClientMapper mapper;


    //Creamos o guardamos un Cliente en nuestra BD
    @Override
    public Client save(Client client){
        Cliente cliente = mapper.toCliente(client);
       return mapper.toClient(clienteCrudRepository.save(cliente));
    }

    //Retornamos un Cliente por su id
    @Override
    public Optional<Client> getByid(Long id) {
        return clienteCrudRepository.findById(id).map(client -> mapper.toClient(client));
    }

    //Obtenemos todos los clientes registrados en la BDD
    @Override
    public List<Client> getAll(){
        List<Cliente> clientes = (List<Cliente>)  clienteCrudRepository.findAll();
        return mapper.toClients(clientes);
    }

    //Elminamos un cliente
    @Override
    public void delete(Long id){
        clienteCrudRepository.deleteById(id);
    }

    @Override
    public Optional<Client> update(Client client, long id) {
        Optional<Client> cliente = getByid(id);
        return cliente.map(it -> {
            it.setClientId(client.getClientId());
            it.setEmail(client.getEmail());
            it.setName(client.getName());
            it.setTelephone(client.getTelephone());
            it.setNumberIdentificacion(client.getNumberIdentificacion());
            it.setTypeIdentificacion(client.getTypeIdentificacion());

            return it;
        });
    }


}
