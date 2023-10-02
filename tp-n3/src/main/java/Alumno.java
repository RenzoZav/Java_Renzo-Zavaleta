/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CS02
 */
public class Alumno extends Persona{
    private String rol = "Alumno";
    public Alumno(String nombre, int edad, String rol){
        super(nombre, edad);
        this. rol = rol;
    }
    
}

