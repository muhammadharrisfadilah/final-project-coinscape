package com.project.coinscape.repository;

import com.project.coinscape.entities.Role;
import com.project.coinscape.entities.constants.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
    Optional<Role> findByRole(ERole role);
}
