package com.godoy.rocket_gestao_vagas.modules.company.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.godoy.rocket_gestao_vagas.modules.company.entities.JobEntity;

@Repository
public interface JobRepository extends JpaRepository<JobEntity, UUID> {

}
