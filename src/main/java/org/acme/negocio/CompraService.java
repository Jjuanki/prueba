package org.acme.negocio;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped 
public class CompraService {


    @Inject
    @Named("correo")
    private Notificacion notificacionCorreo;


    public void realizar(Compra compra) {
        System.out.println("Procesando compra...");
        System.out.println("Nombre: " + compra.getCliente());
        System.out.println("Producto: " + compra.getProducto());
        System.out.println("Total: " + compra.getTotal());
        System.out.println("Compra realizada con éxito.");

        String cuerpo = "Estimado " + compra.getCliente() + " su producto " + compra.getProducto()  +
        "se ha realizado exitosamente";

        this.notificacionCorreo.enviar(compra.getCliente(),"Confirmación de compra", cuerpo);

        this.notificacionCorreo.setCantidad(this.notificacionCorreo.getCantidad() +1);

        System.out.println("Cantidad de correos enviados: " + this.notificacionCorreo.getCantidad());
    }
}
