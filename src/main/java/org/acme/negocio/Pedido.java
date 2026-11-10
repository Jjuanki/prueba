package org.acme.negocio;

public class Pedido {

    private String cliente;
    private String Producto;
    private double total;
    private String correo;

    public Pedido() {

    }

    public Pedido(String cliente, String producto, double total, String correo) {
        this.cliente = cliente;
        Producto = producto;
        this.total = total;
        this.correo = correo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String producto) {
        Producto = producto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    

    


}
