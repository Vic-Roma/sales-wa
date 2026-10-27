package com.victorhugo.saleswhastapp.dto;

public class VentaRegistradaResponseDTO {

    private String tipo;
    private int cantidad;
    private StringBuilder description;
    private double precio;

    public VentaRegistradaResponseDTO(){}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public StringBuilder getDescription() {
        return description;
    }

    public void setDescription(StringBuilder description) {
        this.description = description;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
