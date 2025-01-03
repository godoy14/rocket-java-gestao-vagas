package com.godoy.rocket_gestao_vagas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
	info = @Info(
		title = "Rocket - Java - Gestão de vagas",
		description = "Rocket - Java - Gestão de vagas",
		version = "1"
	)
)
public class RocketGestaoVagasApplication {

	public static void main(String[] args) {
		SpringApplication.run(RocketGestaoVagasApplication.class, args);
	}

}
