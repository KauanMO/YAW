package com.yaw.server.controller;

import com.yaw.server.dto.administrador.LoginAdministradorDTO;
import com.yaw.server.service.AdministradorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
@RequiredArgsConstructor
public class AdministradorController {
    private final AdministradorService service;

    @PostMapping
    ResponseEntity<?> loginAdministrador(@RequestBody @Valid LoginAdministradorDTO dto) {
        service.loginAdministrador(dto);

        return ResponseEntity.ok().build();
    }
}
