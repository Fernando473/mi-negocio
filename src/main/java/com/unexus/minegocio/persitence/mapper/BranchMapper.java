package com.unexus.minegocio.persitence.mapper;

import com.unexus.minegocio.domain.Branch;
import com.unexus.minegocio.domain.Client;
import com.unexus.minegocio.persitence.entity.Sucursal;


import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import javax.print.attribute.standard.MediaSize;
import java.util.List;
/*
 * Created by: Fernando Sangopanta
 */
@Mapper(componentModel = "spring",uses = {ClientMapper.class})
public interface BranchMapper {

    @Mappings({
            @Mapping(source = "idSucursal",target = "idBranch"),
            @Mapping(source = "provincia",target = "province"),
            @Mapping(source = "ciudad",target = "city"),
            @Mapping(source = "direccion",target = "address"),
            @Mapping(source = "cliente",target = "client"),
            @Mapping(source = "clientId", target = "clientId")
    })

    Branch toBranch(Sucursal sucursal);
    @InheritInverseConfiguration
    Sucursal toSucursal(Branch branch);

    List<Branch> toBranchs(List<Sucursal> sucursals);
}
