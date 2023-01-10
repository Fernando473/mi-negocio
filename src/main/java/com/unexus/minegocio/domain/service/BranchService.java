package com.unexus.minegocio.domain.service;

import com.unexus.minegocio.domain.Branch;
import com.unexus.minegocio.domain.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/*
 * Created by: Fernando Sangopanta
 */
@Service
public class BranchService {
    @Autowired
    private BranchRepository branchRepository;


    public List<Branch> getAll(){
        return branchRepository.getAll();
    }

    public Branch save(Branch branch){
        return branchRepository.save(branch);
    }

    public Optional<Branch> getBranch(long id){
        return branchRepository.getBranch(id);
    }

    public boolean delete(long id){
        return getBranch(id).map(branch -> {
            branchRepository.delete(id);
            return true;
        }).orElse(false);
    }

    public Optional<Branch> registerAddressByClient(long idClient,Branch branch){
        return branchRepository.registerAddressForClient(idClient,branch);
    }

    public Optional<Branch> getByClientId(long idClient){
        return branchRepository.getByClientId(idClient);
    }
}
