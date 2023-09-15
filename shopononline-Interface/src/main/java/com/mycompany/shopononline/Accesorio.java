package com.mycompany.shopononline;

public class Accesorio extends Producto implements Arancel{
    
    private double peso;
    private String metal;

    public Accesorio(String desc, int codigo, double peso, String metal, double precio) {
        super(desc, codigo, precio);
        this.peso = peso;
        this.metal = metal;
        this.getPrecio();
        this.arancelAduanero();
        this.arancelTransporte();
        
    }
    
    @Override
    public double getPrecio() {
        if (this.metal.equals("oro")) {
            this.precio = this.precio + this.peso * 10000;
        }
        if (this.metal.equals("plata")) {
            this.precio = this.precio + this.peso * 5000;
        }
        if (this.metal.equals("acero")) {
            this.precio = this.precio + this.peso * 1000;
        }
        return this.precio;
    }
 
      @Override
    public double arancelAduanero() {
        this.precio += this.precio * 0.10;
        return this.precio;
    }
    @Override
    public double arancelTransporte(){
        this.precio += this.precio * 0.02;
        return precio;
    }
    
    @Override
    public String toString() {
        return this.desc + "........ $ " + this.precio + "(Bijouterie)";
    }
    @Override
    public String getDesc() {
        return desc;
    }

    /**
     *
     * @return
     */
    @Override
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