package com.yaw.server.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@Table(name = "yaw_pedido")
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String link;
    private String foto;
    private String titulo;
    private Double preco;
    private String descricao;

    @OneToOne(mappedBy = "pedido")
    private PedidoReservado pedidoReservado;
}
