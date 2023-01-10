package com.unexus.minegocio.web.controller;

import com.unexus.minegocio.domain.Client;
import com.unexus.minegocio.domain.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
/*
 * Created by: Fernando Sangopanta
 */

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;


    //End point que devuelve todos los clientes registrados
    @GetMapping("/allClients")
    public ResponseEntity<List<Client>> getAllClients(){
        return new ResponseEntity<>(clientService.getAll(), HttpStatus.OK);
    }

    // End point que guarda un cliente
    @PostMapping("/save")
    public ResponseEntity<Client> save(@RequestBody Client client){
        return new ResponseEntity<>(clientService.save(client),HttpStatus.CREATED);
    }

    // End point que elimina un cliente dado su id
    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") long id){
        if(clientService.delete(id)){
            return new ResponseEntity(HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }


    // End point que devuelve un cliente dado su id
    @GetMapping("/{id}")
    public ResponseEntity<Client> getClient(@PathVariable("id") long id){
        return clientService.getClient(id)
                .map(product -> new ResponseEntity<>(product,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.OK));
    }

    // End point que actualiza un cliente dado su id y el cliente
    @PutMapping("/update/{id}")
    public ResponseEntity<Client>  update(@PathVariable long id, @RequestBody Client client){
        return clientService.update(id,client)
                .map(it -> new ResponseEntity<>(it,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
