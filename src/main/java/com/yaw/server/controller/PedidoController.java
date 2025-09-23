package com.yaw.server.controller;

import com.yaw.server.dto.pedido.RegistrarPedidoDTO;
import com.yaw.server.dto.pedido.RetornoPedidoDTO;
import com.yaw.server.model.Pedido;
import com.yaw.server.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("pedidos")
public class PedidoController {
    private final PedidoService service;

    @PostMapping
    ResponseEntity<RetornoPedidoDTO> registrarPedido(@RequestBody RegistrarPedidoDTO dto) {
        Pedido novoPedido = service.registrarPedido(dto);

        return ResponseEntity.ok(new RetornoPedidoDTO(novoPedido));
    }
}
