package com.yaw.server.service;

import com.yaw.server.dto.convidado.RegistrarConvidadoDTO;
import com.yaw.server.model.Convidado;
import com.yaw.server.repository.ConvidadoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConvidadoService {
    private final ConvidadoRepository repository;

    public Convidado registrarConvidado(RegistrarConvidadoDTO dto) {
        Convidado novoConvidado = Convidado.builder()
                .nome(dto.nome())
                .numero(dto.numero())
                .build();

        return repository.save(novoConvidado);
    }
}
