package com.Dilly3.Security60.repository;

import com.Dilly3.Security60.models.AppUSer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<AppUSer, Integer> {

    Optional<AppUSer> findByUsername(String username);
}
