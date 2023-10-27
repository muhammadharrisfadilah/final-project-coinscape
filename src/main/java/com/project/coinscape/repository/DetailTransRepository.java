package com.project.coinscape.repository;

import com.project.coinscape.entities.DetailTrans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailTransRepository extends JpaRepository<DetailTrans, String> {
}
