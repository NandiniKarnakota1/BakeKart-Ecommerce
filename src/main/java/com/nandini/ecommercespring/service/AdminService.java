package com.nandini.ecommercespring.service;

import com.nandini.ecommercespring.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nandini.ecommercespring.repository.AdminRepository;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepository arepo;

    public void save(Admin a) {
        arepo.save(a);
    }
    public List<Admin> fetchAll(){
        return arepo.findAll();
    }
}
