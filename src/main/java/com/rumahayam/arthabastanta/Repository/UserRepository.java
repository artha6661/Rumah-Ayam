package com.rumahayam.arthabastanta.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rumahayam.arthabastanta.Entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByEmail(String email);

}