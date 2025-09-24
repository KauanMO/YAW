package com.yaw.server.service.exceptions;

public class EntidadeNaoEncontradaException extends RuntimeException {
    public EntidadeNaoEncontradaException(Class<?> classe) {
        super(classe.getName() + " não encontrado(a)");
    }
}
