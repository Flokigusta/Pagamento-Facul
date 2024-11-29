package com.trabalhoArquitetura.trabalho.Service;

import com.trabalhoArquitetura.trabalho.Model.Pedido;
import com.trabalhoArquitetura.trabalho.Repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> obterPedidosPorUsuario(Long idUsuario) {
        return pedidoRepository.findByIdUsuario(idUsuario); // Retorna todos os pedidos de um usuário
    }

    public Pedido criarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido); // Cria um novo pedido
    }
}
