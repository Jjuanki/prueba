package org.acme.negocio;

import java.time.LocalDateTime;

import jakarta.inject.Singleton;

@Singleton
public class AuditoriaService {

    public void guardarEnBase(String cliente, double total, String correo) {

        System.out.println("Guardando en la base...");
        System.out.println("Cliente: " + cliente +" - total: " + total+ " - correo: " + correo );
        System.out.println("Fecha del registro: " + LocalDateTime.now());
    }

}
