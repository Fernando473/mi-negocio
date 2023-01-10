package com.unexus.minegocio.web.controller;

import com.unexus.minegocio.domain.Branch;
import com.unexus.minegocio.domain.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*
 * Created by: Fernando Sangopanta
 */
@RestController
@RequestMapping("/branchs")
public class BranchController {

    @Autowired
    private BranchService branchService;

    //End point que devuelve todas las sucursales en formato JSON
    @GetMapping("/allBranchs")
    public ResponseEntity<List<Branch>> getAllBranchs(){
        return new ResponseEntity<>(branchService.getAll(), HttpStatus.OK);
    }

    //End pont que guarda una sucursal
    @GetMapping("/save")
    public ResponseEntity<Branch> save(@RequestBody Branch branch){
        return new ResponseEntity<>(branchService.save(branch),HttpStatus.OK);
    }

    //End point que devuelve una sucursal dada su id
    @GetMapping("/{id}")
    public ResponseEntity<Branch> getBranch(@PathVariable("id") long id){
        return branchService.getBranch(id)
                .map(branch -> new ResponseEntity<>(branch,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    //End point que guarda una sucursal dado el id del cliente 
    @PostMapping("/saveBranch/{id}")
    public ResponseEntity<Branch> saveAddress(@RequestBody Branch branch, @PathVariable("id") long id){
        return branchService.registerAddressByClient(id,branch)
                .map(save -> new ResponseEntity<>(branch,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    //End point que returna todas las sucursales que tiene un cliente dado su id
    @GetMapping("/branchsByClient/{id}")
    public ResponseEntity<Branch> getByClient(@PathVariable("id") long id){
        return branchService.getByClientId(id)
                .map(branch -> new ResponseEntity<>(branch,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
}
