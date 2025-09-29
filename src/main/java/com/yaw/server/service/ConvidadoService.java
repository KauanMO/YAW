package com.yaw.server.service;

import com.yaw.server.dto.convidado.RegistrarConvidadoDTO;
import com.yaw.server.model.Convidado;
import com.yaw.server.repository.ConvidadoRepository;
import com.yaw.server.service.exceptions.EntidadeNaoEncontradaException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Convidado buscarConvidadoPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new EntidadeNaoEncontradaException(Convidado.class));
    }

    public List<Convidado> buscarConvidados() {
        return repository.findAll();
    }
}
