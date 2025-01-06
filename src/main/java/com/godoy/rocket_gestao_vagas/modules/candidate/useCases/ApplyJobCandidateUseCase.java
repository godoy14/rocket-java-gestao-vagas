package com.godoy.rocket_gestao_vagas.modules.candidate.useCases;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godoy.rocket_gestao_vagas.exceptions.JobNotFoundException;
import com.godoy.rocket_gestao_vagas.exceptions.UserNotFoundException;
import com.godoy.rocket_gestao_vagas.modules.candidate.entities.ApplyJobEntity;
import com.godoy.rocket_gestao_vagas.modules.candidate.repositories.ApplyJobRepository;
import com.godoy.rocket_gestao_vagas.modules.candidate.repositories.CandidateRepository;
import com.godoy.rocket_gestao_vagas.modules.company.repositories.JobRepository;

@Service
public class ApplyJobCandidateUseCase {

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private ApplyJobRepository applyJobRepository;

    public ApplyJobEntity execute(UUID idCandidate, UUID idJob) {

        this.candidateRepository.findById(idCandidate)
                .orElseThrow(() -> {
                    throw new UserNotFoundException();
                });

        this.jobRepository.findById(idJob)
                .orElseThrow(() -> {
                    throw new JobNotFoundException();
                });

        var applyJob = ApplyJobEntity.builder()
                .candidateID(idCandidate)
                .jobId(idJob)
                .build();
        applyJob = applyJobRepository.save(applyJob);

        return applyJob;
    }

}
