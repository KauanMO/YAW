package com.yaw.server.controller;

import com.yaw.server.dto.convidado.RegistrarConvidadoDTO;
import com.yaw.server.dto.convidado.RetornoConvidadoDTO;
import com.yaw.server.model.Convidado;
import com.yaw.server.service.ConvidadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
