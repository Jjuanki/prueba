package org.acme.negocio;

public interface Notificacion {

    public void enviar(String destinatario, String asunto, String cuerpo);

    public Integer getCantidad();
    public void setCantidad(Integer cantidad);
}
