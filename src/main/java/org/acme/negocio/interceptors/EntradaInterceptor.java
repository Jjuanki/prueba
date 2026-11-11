package org.acme.negocio.interceptors;

import org.acme.negocio.EntradaService;

import jakarta.annotation.Priority;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Entrada
@Interceptor 
@Priority(Interceptor.Priority.APPLICATION)
public class EntradaInterceptor {

    @Inject
    private EntradaService entradaService;

    @AroundInvoke 
    public Object interceptar(InvocationContext context) throws Exception {
        
        this.entradaService.registrarEntrada();

        Object resultado = context.proceed();
        return resultado;
    }

}
