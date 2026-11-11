package org.acme.negocio;

import java.time.LocalDate;

import jakarta.inject.Singleton;

@Singleton
public class EntradaService {   

    public void registrarEntrada() {
        System.out.println("Entrando al sistema a la fecha: "  + LocalDate.now());
    }
}
