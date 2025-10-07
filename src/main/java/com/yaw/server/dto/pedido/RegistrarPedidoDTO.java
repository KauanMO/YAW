package com.yaw.server.dto.pedido;

public record RegistrarPedidoDTO(
        String link,
        String titulo,
        Double preco,
        String foto,
        String descricao
) {
}
