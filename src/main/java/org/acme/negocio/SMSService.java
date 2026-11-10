package org.acme.negocio;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
@Named("sms")
public class SMSService implements Notificacion{

    @Override
    public void enviar(String destinatario, String asunto, String cuerpo) {

        System.out.println("Construyendo SMS...");
        System.out.println("Enviando SMS a: " + destinatario);
        System.out.println("Asunto: " + asunto);
        System.out.println("Cuerpo: \n" + cuerpo);


    }

    @Override
    public Integer getCantidad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCantidad'");
    }

    @Override
    public void setCantidad(Integer cantidad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCantidad'");
    }


}
