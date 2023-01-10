package com.unexus.minegocio.persitence.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
/*
 * Created by: Fernando Sangopanta
 */
@Entity
public class Cliente implements Serializable {

    public Cliente(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idCliente;

    @Column
    private String tipoIdentificacion;

    @Column
    private String numeroIdentificacion;

    @Column
    private String nombres;

    @Column
    private String correo;

    @Column
    private Integer celular;

    @OneToMany(mappedBy = "cliente")
    private List<Sucursal> sucursales;


    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(List<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public Long getId() {
        return idCliente;
    }

    public void setId(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }
}

// Insertar en cliente

//INSERT INTO CLIENTE (TIPO_IDENTIFICACION,NUMERO_IDENTIFICACION,NOMBRES,CORREO,CELULAR) VALUES ('CC','123456789','JUAN','juan',123456789);


