
import java.util.ArrayList;


public class Persona {
    private String nombre;
    private int edad;
    
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarSusDatos(){
        System.out.println("Yo soy " + this.nombre + " y tengo "+ this.edad + " años");
    }
}
