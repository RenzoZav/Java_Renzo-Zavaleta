package com.mycompany.shopononline;

public class Pantalon extends Producto{
    
    private int talle;
    private String modelo;

    public Pantalon(String desc, int codigo, int talle, String modelo, double precio) {
        super(desc, codigo, precio);
             this.talle = talle;
        this.modelo = modelo;
        if (this.modelo.equals("Recto")) {
            this.precio = this.precio + this.precio * 0.15;
        }
        if (this.modelo.equals("Oxford")) {
            this.precio = this.precio + this.precio * 0.15;
        }
        if (this.modelo.equals("Skinny")) {
            this.precio = this.precio + this.precio * 0.25;
        }
    }
    public String toString() {
        return this.desc + "........ $ " + this.precio + "("+ this.talle+")";
    }
    @Override
    public double getPrecio() {
        return precio;        
    }   
    public String getDesc() {
        return desc;
    }
    public int getCodigo() {
        return codigo;
    }
    public int getTalle() {
        return talle;
    }
}
