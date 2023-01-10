package com.unexus.minegocio.domain;

import java.util.List;
/*
 * Created by: Fernando Sangopanta
 */
public class Client {
    private Long clientId;
    private String typeIdentificacion;
    private String numberIdentificacion;
    private String name;
    private String email;
    private Integer telephone;

    public Long getId() {
        return clientId;
    }

    public void setId(Long id) {
        this.clientId = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getTypeIdentificacion() {
        return typeIdentificacion;
    }

    public void setTypeIdentificacion(String typeIdentificacion) {
        this.typeIdentificacion = typeIdentificacion;
    }

    public String getNumberIdentificacion() {
        return numberIdentificacion;
    }

    public void setNumberIdentificacion(String numberIdentificacion) {
        this.numberIdentificacion = numberIdentificacion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }
}
