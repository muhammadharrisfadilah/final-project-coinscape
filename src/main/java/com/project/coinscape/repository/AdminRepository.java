package com.project.coinscape.repository;

import com.project.coinscape.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {
    Optional<Admin> findByPayCode(String noUserDestination);
    boolean existsByPayCode(String payCode);

    Optional<Admin> findByEmail(String email);

    Optional<Admin> findFirstByEmail(String email);
}
