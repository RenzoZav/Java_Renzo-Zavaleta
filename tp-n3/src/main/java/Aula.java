
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CS02
 */
public class Aula {
     private ArrayList<Persona> lista = new ArrayList();
     private Persona persona; 
     
     public Aula(){
         this.lista = lista;
         this.persona = persona;
     }
     
    public void agregarLista(Persona p1) {
        this.lista.add(p1);
    }

    public ArrayList<Persona> getLista() {
        return lista;
    }

    public Persona getPersona() {
        return persona;
    }
}
