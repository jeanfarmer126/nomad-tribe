package com.example.nomadtribe.repository;

import com.example.nomadtribe.domain.Nomad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NomadRepository extends JpaRepository<Nomad, Long> {
}
