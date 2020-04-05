package com.security2.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security2.demo.model.Role;
@Repository
public interface RoleRepo extends JpaRepository<Role, Integer>{

}
