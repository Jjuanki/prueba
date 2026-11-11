package org.acme.negocio.interceptors;

import org.acme.negocio.AuditoriaService;
import org.acme.negocio.Pedido;

import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Auditoria
@Interceptor
public class AuditoriaInterceptor {

    @Inject
    private AuditoriaService auditoriaService;

    @AroundInvoke 
    private Object interceptar(InvocationContext context) throws Exception {

        Object resultado = context.proceed();

        System.out.println("------------AQUÍ ENTRA EL MÉTODO interceptar------------");

        Object[] valores = context.getParameters();

        Pedido pedido = (Pedido) valores[0]; 

        this.auditoriaService.guardarEnBase(pedido.getCliente(), pedido.getTotal(), pedido.getCorreo());
        
        return resultado;

        
    }

}
