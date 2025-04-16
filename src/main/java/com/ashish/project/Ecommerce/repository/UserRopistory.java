package com.ashish.project.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashish.project.Ecommerce.entity.User;

@Repository
public interface UserRopistory extends JpaRepository<User, Integer>  {

}
