package com.godoy.rocket_gestao_vagas.modules.candidate.useCases;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.godoy.rocket_gestao_vagas.modules.candidate.CandidateRepository;
import com.godoy.rocket_gestao_vagas.modules.candidate.dto.ProfileCandidateResponseDTO;

@Service
public class ProfileCandidateUseCase {

    @Autowired
    private CandidateRepository candidateRepository;

    public ProfileCandidateResponseDTO execute(UUID candidadteId) {
        var candidate = this.candidateRepository.findById(candidadteId).orElseThrow(() -> {
            throw new UsernameNotFoundException("User not found");
        });

        var candidateDTO = ProfileCandidateResponseDTO
                .builder()
                .description(candidate.getDescription())
                .email(candidate.getEmail())
                .name(candidate.getName())
                .username(candidate.getUsername())
                .id(candidate.getId())
                .build();

        return candidateDTO;
    }

}
