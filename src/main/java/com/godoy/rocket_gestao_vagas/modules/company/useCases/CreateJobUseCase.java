package com.godoy.rocket_gestao_vagas.modules.company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godoy.rocket_gestao_vagas.exceptions.CompanyNotFoundException;
import com.godoy.rocket_gestao_vagas.modules.company.entities.JobEntity;
import com.godoy.rocket_gestao_vagas.modules.company.repositories.CompanyRepository;
import com.godoy.rocket_gestao_vagas.modules.company.repositories.JobRepository;

@Service
public class CreateJobUseCase {

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private CompanyRepository companyRepository;

    public JobEntity execute(JobEntity jobEntity) {
        companyRepository.findById(jobEntity.getCompanyId()).orElseThrow(() -> {
            throw new CompanyNotFoundException();
        });

        return this.jobRepository.save(jobEntity);
    }

}
