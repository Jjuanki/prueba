package org.acme.negocio;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
@Named("correo")
public class MailService implements Notificacion{


    @Override
    public void enviar(String destinatario, String asunto, String cuerpo) {

        System.out.println("Construyendo correo...");
        System.out.println("Enviando correo a: " + destinatario);
        System.out.println("Asunto: " + asunto  );
        System.out.println("Cuerpo: \n" + cuerpo);
        System.out.println("Correo enviado correctamente");
    
    }

}
