package com.Dilly3.Security60.repository;

import com.Dilly3.Security60.models.Role;
import com.Dilly3.Security60.models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface IRoleRepository extends JpaRepository<Roles,Integer> {

    Optional<Roles> findByRole(Role role);
}
