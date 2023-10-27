package com.project.coinscape.repository;


import com.project.coinscape.entities.UpgradeRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpgradeRequestRepository extends JpaRepository<UpgradeRequest,String> {
}
