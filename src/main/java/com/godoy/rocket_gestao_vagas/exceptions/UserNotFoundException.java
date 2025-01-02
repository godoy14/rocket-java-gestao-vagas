package com.godoy.rocket_gestao_vagas.exceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException() {
        super("Usuário já existe.");
    }

}
