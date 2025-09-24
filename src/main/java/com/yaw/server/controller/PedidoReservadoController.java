package com.yaw.server.controller;

import com.yaw.server.dto.pedidoReservado.RegistrarPedidoReservadoDTO;
import com.yaw.server.dto.pedidoReservado.RetornoPedidoReservadoDTO;
import com.yaw.server.model.PedidoReservado;
import com.yaw.server.service.PedidoReservadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("pedidos-reservados")
public class PedidoReservadoController {
    private final PedidoReservadoService service;

    @PostMapping
    public ResponseEntity<RetornoPedidoReservadoDTO> registrarPedidoReservado(@RequestBody RegistrarPedidoReservadoDTO dto) {
        PedidoReservado novoPedidoReservado = service.registrarPedidoReservado(dto);

        return ResponseEntity.ok(new RetornoPedidoReservadoDTO(novoPedidoReservado));
    }
}
