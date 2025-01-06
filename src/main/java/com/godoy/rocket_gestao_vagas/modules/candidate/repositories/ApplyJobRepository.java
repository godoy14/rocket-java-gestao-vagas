package com.godoy.rocket_gestao_vagas.modules.candidate.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.godoy.rocket_gestao_vagas.modules.candidate.entities.ApplyJobEntity;

@Repository
public interface ApplyJobRepository extends JpaRepository<ApplyJobEntity, UUID> {

}
