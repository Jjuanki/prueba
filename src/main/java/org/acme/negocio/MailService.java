package org.acme.negocio;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Named;

@Dependent
@Named("correo")
public class MailService implements Notificacion{


    private Integer cantidad = 0;    
    
    @Override
    public void enviar(String destinatario, String asunto, String cuerpo) {

        System.out.println("Construyendo correo...");
        System.out.println("Enviando correo a: " + destinatario);
        System.out.println("Asunto: " + asunto  );
        System.out.println("Cuerpo: \n" + cuerpo);
        System.out.println("Correo enviado correctamente");
    
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    

}
