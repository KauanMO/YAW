package com.yaw.server.service.exceptions;

public class LoginOuSenhaIncorreta extends RuntimeException {
    public LoginOuSenhaIncorreta() {
        super("Login ou senha incorreta");
    }
}
