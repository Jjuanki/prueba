package org.acme.negocio;

import org.acme.negocio.extensiones.NotificacionExtension;
import org.acme.negocio.interceptors.Auditoria;
import org.acme.negocio.interceptors.Entrada;
import org.acme.negocio.interceptors.Timer;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class PedidoService {

    @Entrada
    @Auditoria
    @Timer 
    public void realizar(Pedido pedido, NotificacionExtension notificacionExtension) {

        System.out.println("Realizando pedido...");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Pedido realizado con éxito");

        notificacionExtension.enviar("Su pedido se ha realizado con éxito", pedido.getCliente());
        

    }
}
