package com.yaw.server.controller;

import com.yaw.server.dto.convidado.RegistrarConvidadoDTO;
import com.yaw.server.dto.convidado.RetornoConvidadoDTO;
import com.yaw.server.model.Convidado;
import com.yaw.server.service.ConvidadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("convidados")
public class ConvidadoController {
    private final ConvidadoService service;

    @PostMapping
    ResponseEntity<RetornoConvidadoDTO> registrarConvidado(@RequestBody RegistrarConvidadoDTO dto) {
        Convidado novoConvidado = service.registrarConvidado(dto);

        return ResponseEntity.ok(new RetornoConvidadoDTO(novoConvidado));
    }

    @GetMapping
    ResponseEntity<List<RetornoConvidadoDTO>> buscarConvidados() {
        List<Convidado> convidados = service.buscarConvidados();

        return ResponseEntity.ok(
                convidados.stream()
                        .map(RetornoConvidadoDTO::new)
                        .toList()
        );
    }
}
