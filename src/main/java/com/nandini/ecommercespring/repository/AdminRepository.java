package com.nandini.ecommercespring.repository;

import com.nandini.ecommercespring.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Integer> {
}
