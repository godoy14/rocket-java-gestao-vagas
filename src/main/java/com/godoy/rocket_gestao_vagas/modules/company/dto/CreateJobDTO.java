package com.godoy.rocket_gestao_vagas.modules.company.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Data;

@Data
public class CreateJobDTO {

    @Schema(example = "Vaga para programador", requiredMode = RequiredMode.REQUIRED)
    private String description;
    private String benefits;
    private String level;

}
