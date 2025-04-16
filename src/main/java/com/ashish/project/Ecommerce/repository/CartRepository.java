package com.ashish.project.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashish.project.Ecommerce.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{

}
