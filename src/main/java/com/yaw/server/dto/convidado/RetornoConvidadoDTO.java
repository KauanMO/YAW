package com.yaw.server.dto.convidado;

import com.yaw.server.model.Convidado;

public record RetornoConvidadoDTO(
        Long id,
        String nome,
        String numero
) {
    public RetornoConvidadoDTO(Convidado convidado) {
        this(convidado.getId(), convidado.getNome(), convidado.getNumero());
    }
}
