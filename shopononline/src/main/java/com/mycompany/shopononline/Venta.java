package com.mycompany.shopononline;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Venta {
  private ArrayList<Producto> listaProd=new ArrayList();
  private Cliente cliente; 
  private static int cantVentas=1091; 
  private int nroFact;
  private LocalDate fecha; 
  
  public Venta(LocalDate fecha, Cliente c){
      this.fecha = fecha;
      this.cliente = cliente;
      this.nroFact = Venta.cantVentas ++;
      this.cliente=c;
  }
  public void agregarProducto(Producto p){
      listaProd.add(p);

  }

    public ArrayList<Producto> getListaProd() {
        return listaProd;
    }
    public Cliente getCliente() {
        return cliente;
    }
  
    public static int getCantVentas() {
        return cantVentas;
    }
    public int getNroFact() {
        return nroFact;
    }
    public LocalDate getFecha() {
        return fecha;
    }
  public double calcularImporteTotal(){
      double total = 0;
      for (int i = 0; i < this.listaProd.size(); i++) {
          total += this.listaProd.get(i).precio;
      }
      return total;
  }
  public void imprimirFactura(){
      System.out.println("Factura N°: "+this.nroFact + " - " + this.fecha );
      for (int i = 0; i < this.listaProd.size(); i++) {
          System.out.println(this.listaProd.get(i).toString());;         
      }
      System.out.println(this.calcularImporteTotal());      
  }  
}