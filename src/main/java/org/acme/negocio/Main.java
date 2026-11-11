package org.acme.negocio;

import org.acme.negocio.extensiones.NotificacionExtensionSMS;
import org.acme.negocio.extensiones.NotificacionExtensionWhatsApp;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private NotificacionExtensionSMS notificacionExtensionSMS;

    @Inject
    private PedidoService pedidoService;

    @Inject
    private CompraService compraService;
    @Inject
    NotificacionExtensionWhatsApp notificacionExtensionWhatsApp;

    
    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) {
        System.out.println("Mensaje guia ------------------------------------");

        Pedido pedido = new Pedido("María", "Steins;Gate tshirt", 18.80, "h123698745@gmail.com", "0995706128");
        this.pedidoService.realizar(pedido, this.notificacionExtensionWhatsApp);
    
        Compra compra = new Compra("Juan", "mueble", 60.8, "jfcaranqui@uce.edu.ec", "0995706128");
        this.compraService.realizar(compra, this.notificacionExtensionWhatsApp);
        
        Pedido pedido2 = new Pedido("Pedro", "laptop", 1500.00, "hola@uce.edu.ec", "0974412549");
        this.pedidoService.realizar(pedido2, notificacionExtensionSMS);     
        
        Compra compra2 = new Compra("Sofía", "camiseta Iron-man", 13.50, "so@uce.edu.ec", "54187485");

        this.compraService.realizar(compra2, notificacionExtensionSMS);
        
        return 0;

       }

}
