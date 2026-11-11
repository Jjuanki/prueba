package org.acme.negocio;

import org.acme.negocio.interceptors.Auditoria;
import org.acme.negocio.interceptors.Entrada;
import org.acme.negocio.interceptors.Timer;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped 
public class PedidoService {


    @Inject
    @Named("correo")
    private Notificacion notificacionCorreo;

    @Inject
    @Named("sms")
    private Notificacion notificacionSMS;


    @Entrada
    @Auditoria
    @Timer 
    public void realizar(Pedido pedido) {

        System.out.println("Realizando pedido...");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Pedido realizado con éxito");

        String asunto = "confirmación de pedido";
        String cuerpo = "Su pedido se ha realizado exitosamente";

        this.notificacionCorreo.enviar(pedido.getCliente(), asunto, cuerpo);
        
        this.notificacionCorreo.setCantidad(this.notificacionCorreo.getCantidad() + 1);
       
        System.out.println("Cantidad de correos enviados en pedido: " + this.notificacionCorreo.getCantidad());
    }
}
