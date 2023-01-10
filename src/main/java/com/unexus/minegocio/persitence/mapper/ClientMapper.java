package com.unexus.minegocio.persitence.mapper;

import com.unexus.minegocio.domain.Client;
import com.unexus.minegocio.persitence.entity.Cliente;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
/*
 * Created by: Fernando Sangopanta
 */
@Mapper(componentModel = "spring")
public interface ClientMapper {
    @Mappings({
            @Mapping(source = "idCliente",target = "clientId"),
            @Mapping(source = "tipoIdentificacion",target = "typeIdentificacion"),
            @Mapping(source = "numeroIdentificacion",target = "numberIdentificacion"),
            @Mapping(source = "nombres",target = "name"),
            @Mapping(source = "correo",target = "email"),
            @Mapping(source = "celular",target = "telephone")
    })
    Client toClient(Cliente cliente);

    @InheritInverseConfiguration
    @Mapping(target = "sucursales", ignore = true)
    Cliente toCliente(Client client);
    List<Client> toClients(List<Cliente> clientes);


}
