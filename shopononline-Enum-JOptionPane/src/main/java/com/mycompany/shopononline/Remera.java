package com.mycompany.shopononline;

public class Remera extends Producto {
    private TalleRopa talle;

    public Remera(String desc, int codigo, TalleRopa talle, double precio) {
        super(desc, codigo, precio);
        this.talle = talle;
        if (this.talle == TalleRopa.S) {
            this.precio = this.precio + this.precio * 0.5;
        }
        if (this.talle == TalleRopa.M) {
            this.precio = this.precio + this.precio * 0.10;
        }
        if (this.talle == TalleRopa.L) {
            this.precio = this.precio + this.precio * 0.15;
        }
        if (this.talle == TalleRopa.XL) {
            this.precio = this.precio + this.precio * 0.20;
        }
    }

    public String toString() {
        return this.desc + "........ $ " + this.precio + "(" + this.talle + ")";
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

    public TalleRopa getTalle() {
        return talle;
    }
}