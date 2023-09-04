package com.mycompany.shopononline;
import java.util.Scanner;
/**
 *
 * @author CS05
 */
public class Cliente {
    private int id; 
    private int DNI; 
    private String n; 
    private int p;
    private String e;
      
    Cliente( String name){
      
        this.n= name; 
    }   
    Cliente() {
    }
    public int getId() {
        return id;
    }
    public String getName(){
      return n; 
    }
   public int getPhone(){
      return p;
   }
   public String getEmail(){
      return e;
   }
}