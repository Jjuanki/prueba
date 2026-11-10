package org.acme.negocio;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped 
public class PedidoService {


    @Inject
    private MailService mailService;

    public void realizar(Pedido pedido) {

        System.out.println("Realizando pedido...");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Pedido realizado con éxito");

        String asunto = "confirmación de pedido";
        String cuerpo = "Su pedido se ha realizado exitosamente";

        this.mailService.enviar(pedido.getCorreo(), asunto, cuerpo);

    }
}
