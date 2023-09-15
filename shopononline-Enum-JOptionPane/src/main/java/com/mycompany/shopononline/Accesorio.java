package com.mycompany.shopononline;

public class Accesorio extends Producto{
    
    private double peso;
    private String metal;

    public Accesorio(String desc, int codigo, double peso, String metal, double precio) {
        super(desc, codigo, precio);
        this.peso = peso;
        this.metal = metal;
        if (this.metal.equals("oro")) {
            this.precio = this.precio + this.peso * 10000;
        }
        if (this.metal.equals("plata")) {
            this.precio = this.precio + this.peso * 5000;
        }
        if (this.metal.equals("acero")) {
            this.precio = this.precio + this.peso * 1000;
        }
    }
    @Override
    public double getPrecio() {
        return precio;
    }
    public String toString() {
        return this.desc + "........ $ " + this.precio + "(Bijouterie)";
    }
    public String getDesc() {
        return desc;
    }
    public int getCodigo() {
        return codigo;
    }
    public double getPeso() {
        return peso;
    }
    public String getMetal() {
        return metal;
    }
}