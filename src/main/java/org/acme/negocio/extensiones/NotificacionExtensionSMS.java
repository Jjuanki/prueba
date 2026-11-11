package org.acme.negocio.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class NotificacionExtensionSMS implements NotificacionExtension{

    @Override
    public void enviar(String mensaje, String destinatario) {
        
        System.out.println("Enviando mensaje a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Mensaje SMS enviado");
    
    }

}
