package com.nandini.ecommercespring.repository;

import com.nandini.ecommercespring.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
