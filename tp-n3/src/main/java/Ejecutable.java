
import java.util.ArrayList;
import java.util.Scanner;


public class Ejecutable {
    
    public static void main(String[] args) {
    menu();
    }
    public static void menu(){
        Scanner t = new Scanner(System.in);
        int contador = 0;
        Aula au = new Aula();
        String nombre;
        int edad;
        while(contador != 3){
            System.out.println("Ingrese su nombre: ");
            nombre = t.next();
            System.out.println("Ingrese su edad: ");
            edad = t.nextInt();
            Persona p1 = new Persona(nombre, edad);
            au.agregarLista(p1);
            contador ++;
        }
        for (int i = 0; i < au.getLista().size(); i++) {
            au.getLista().get(1).mostrarSusDatos();
        }

    } 
    
}