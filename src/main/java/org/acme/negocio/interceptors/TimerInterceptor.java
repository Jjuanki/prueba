package org.acme.negocio.interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@Timer
@Priority(Interceptor.Priority.APPLICATION + (2))
public class TimerInterceptor {

    @AroundInvoke 
    private Object interceptForTimer(InvocationContext context) throws Exception {
        
        long tiempoInicio = System.currentTimeMillis();

        Object resultado = context.proceed();

        long tiempoFinal = System.currentTimeMillis();
        long tiempoEjecucion = tiempoFinal-tiempoInicio;

        System.out.println("Tiempo de ejecución: " + tiempoEjecucion + " ms");
        return resultado;

    } 

}
