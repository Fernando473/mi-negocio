package com.unexus.minegocio.persitence.entity;

import javax.persistence.*;
import java.io.Serializable;
/*
 * Created by: Fernando Sangopanta
 */
@Entity
public class Sucursal implements Serializable {

    public Sucursal(){}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long idSucursal;

    @Column
    private String provincia;

    @Column
    private String ciudad;

    @Column
    private String direccion;

    @Column(name = "id_cliente")
    private Integer clientId;

    public long getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente",insertable = false,updatable = false)
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Long getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Long idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

//Insetar una sucursal 
//INSERT INTO sucursal (id_sucursal,provincia,ciudad,direccion,id_cliente) VALUES (1,'San Jose','San Jose','Calle 1',1);