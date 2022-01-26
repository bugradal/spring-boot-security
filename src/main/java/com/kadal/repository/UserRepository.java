package com.kadal.repository;

import com.kadal.entity.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<CustomUser,Long> {

    Optional<CustomUser> findByName(String username);
}
