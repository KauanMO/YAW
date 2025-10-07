package com.yaw.server.dto.pedido;

import com.yaw.server.model.Pedido;

public record RetornoPedidoDTO(
        Long id,
        String link,
        String foto,
        String titulo,
        Double preco,
        String descricao
) {
    public RetornoPedidoDTO(Pedido pedido) {
        this(pedido.getId(), pedido.getLink(), pedido.getFoto(), pedido.getTitulo(), pedido.getPreco(), pedido.getDescricao());
    }
}
