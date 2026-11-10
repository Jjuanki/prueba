package org.acme.negocio;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;

public class Main implements QuarkusApplication {


    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) {
        

        System.out.println("Hola mundo!");
        
        return 0;
    }


}
