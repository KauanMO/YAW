package com.yaw.server.dto.pedidoReservado;

import com.yaw.server.dto.convidado.RetornoConvidadoDTO;
import com.yaw.server.dto.pedido.RetornoPedidoDTO;
import com.yaw.server.model.PedidoReservado;

public record RetornoPedidoReservadoDTO(
        Long id,
        RetornoPedidoDTO pedido,
        RetornoConvidadoDTO convidado
) {
    public RetornoPedidoReservadoDTO(PedidoReservado pedidoReservado) {
        this(pedidoReservado.getId(),
                new RetornoPedidoDTO(pedidoReservado.getPedido()),
                new RetornoConvidadoDTO(pedidoReservado.getConvidado()));
    }
}
