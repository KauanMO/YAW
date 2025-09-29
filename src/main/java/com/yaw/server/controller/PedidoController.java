package com.yaw.server.controller;

import com.yaw.server.dto.pedido.RegistrarPedidoDTO;
import com.yaw.server.dto.pedido.RetornoPedidoDTO;
import com.yaw.server.model.Pedido;
import com.yaw.server.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    ResponseEntity<List<RetornoPedidoDTO>> buscarPedidos() {
        List<Pedido> pedidos = service.buscarPedidos();

        return ResponseEntity.ok(
                pedidos.stream()
                        .map(RetornoPedidoDTO::new)
                        .toList()
        );
    }
}
