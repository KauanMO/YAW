package com.yaw.server.service;

import com.yaw.server.dto.pedido.RegistrarPedidoDTO;
import com.yaw.server.model.Pedido;
import com.yaw.server.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PedidoService {
    private final PedidoRepository repository;

    public Pedido registrarPedido(RegistrarPedidoDTO dto) {
        Pedido novoPedido = Pedido.builder()
                .preco(dto.preco())
                .titulo(dto.titulo())
                .link(dto.link())
                .build();

        return repository.save(novoPedido);
    }
}
