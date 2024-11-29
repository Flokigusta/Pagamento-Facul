package com.trabalhoArquitetura.trabalho.Controller;

import com.trabalhoArquitetura.trabalho.Model.Pedido;
import com.trabalhoArquitetura.trabalho.Service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//Alteação
@RestController
@RequestMapping("/pedidos")
public class PedidoGatewayController {

    @Autowired
    private PedidoService pedidoService;

    // Endpoint para obter todos os pedidos de um usuário
    @GetMapping("/usuario/{idUsuario}")
    public List<Pedido> obterPedidosPorUsuario(@PathVariable Long idUsuario) {
        return pedidoService.obterPedidosPorUsuario(idUsuario);
    }

    // Endpoint para criar um novo pedido
    @PostMapping
    public Pedido criarPedido(@RequestBody Pedido pedido) {
        return pedidoService.criarPedido(pedido);
    }
}
