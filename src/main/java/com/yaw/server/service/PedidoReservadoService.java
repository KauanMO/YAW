package com.yaw.server.service;

import com.yaw.server.dto.pedidoReservado.RegistrarPedidoReservadoDTO;
import com.yaw.server.model.Convidado;
import com.yaw.server.model.Pedido;
import com.yaw.server.model.PedidoReservado;
import com.yaw.server.repository.PedidoReservadoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PedidoReservadoService {
    private final PedidoReservadoRepository repository;
    private final ConvidadoService convidadoService;
    private final PedidoService pedidoService;

    public PedidoReservado registrarPedidoReservado(RegistrarPedidoReservadoDTO dto) {
        Convidado convidadoEncontrado = convidadoService.buscarConvidadoPorId(dto.idConvidado());
        Pedido pedidoEncontrado = pedidoService.buscarPedidoPorId(dto.idPedido());

        PedidoReservado novoPedidoReservado = PedidoReservado.builder()
                .pedido(pedidoEncontrado)
                .convidado(convidadoEncontrado)
                .build();

        return repository.save(novoPedidoReservado);
    }
}
