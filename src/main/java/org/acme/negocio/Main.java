package org.acme.negocio;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private PedidoService pedidoService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) {
        System.out.println("Mensaje guia ------------------------------------");

        Pedido pedido = new Pedido("María", "Steins;Gate tshirt", 18.80, "h123698745@gmail.com", "0995706128");
        this.pedidoService.realizar(pedido);
        return 0;
    }

}
