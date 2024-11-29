package com.trabalhoArquitetura.trabalho.Repository;

import com.trabalhoArquitetura.trabalho.Model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByIdUsuario(Long idUsuario); // Busca todos os pedidos de um usuário
}
