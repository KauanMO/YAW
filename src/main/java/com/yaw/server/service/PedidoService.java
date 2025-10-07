package com.yaw.server.service;

import com.yaw.server.dto.pedido.RegistrarPedidoDTO;
import com.yaw.server.model.Pedido;
import com.yaw.server.repository.PedidoRepository;
import com.yaw.server.service.exceptions.EntidadeNaoEncontradaException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PedidoService {
    private final PedidoRepository repository;

    public Pedido registrarPedido(RegistrarPedidoDTO dto) {
        Pedido novoPedido = Pedido.builder()
                .preco(dto.preco())
                .titulo(dto.titulo())
                .link(dto.link())
                .foto(dto.foto())
                .descricao(dto.descricao())
                .build();

        return repository.save(novoPedido);
    }

    public Pedido buscarPedidoPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new EntidadeNaoEncontradaException(Pedido.class));
    }

    public List<Pedido> buscarPedidos() {
        return repository.findAll();
    }
}
