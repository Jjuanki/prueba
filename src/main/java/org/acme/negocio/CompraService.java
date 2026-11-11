package org.acme.negocio;

import org.acme.negocio.extensiones.NotificacionExtension;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class CompraService {


    public void realizar(Compra compra, NotificacionExtension notificacionExtension) {
        System.out.println("Procesando compra...");
        System.out.println("Nombre: " + compra.getCliente());
        System.out.println("Producto: " + compra.getProducto());
        System.out.println("Total: " + compra.getTotal());
        System.out.println("Compra realizada con éxito.");

        notificacionExtension.enviar("Compra realizada con éxito", compra.getCliente());

    }
}
