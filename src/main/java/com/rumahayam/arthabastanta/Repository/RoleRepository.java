package com.rumahayam.arthabastanta.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rumahayam.arthabastanta.Entity.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

    RoleEntity findByName(String name);
}