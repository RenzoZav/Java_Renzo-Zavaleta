import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántas personas desea crear?");
        int numPersonas = sc.nextInt();

        ArrayList<Persona> personas = new ArrayList<>();

        for (int i = 0; i < numPersonas; i++) {
            System.out.println("¿Desea crear un ALUMNO o un DOCENTE?");
            System.out.println("1. ALUMNO");
            System.out.println("2. DOCENTE");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    {
                        System.out.println("Introduzca los datos del alumno:");
                        System.out.println("Nombre:");
                        String nombre = sc.next();
                        System.out.println("Edad:");
                        int edad = sc.nextInt();
                        System.out.println("DNI:");
                        int dni = sc.nextInt();
                        System.out.println("Calle:");
                        String calle = sc.next();
                        System.out.println("Nro calle:");
                        int numero = sc.nextInt();
                        System.out.println("Localidad:");
                        String localidad = sc.next();
                        System.out.println("Piso DTO:");
                        String pisoDTO = sc.next();
                        direccion dir = new direccion(calle, numero,localidad,pisoDTO);
                        System.out.println("Curso:");
                        String curso = sc.next();
                        Alumno alumno = new Alumno(curso, nombre, edad, dni, dir);
                        personas.add(alumno);
                        break;
                    }
                case 2:
                    {
                        System.out.println("Introduzca los datos del profesor:");
                        System.out.println("Nombre:");
                        String nombre = sc.next();
                        System.out.println("Edad:");
                        int edad = sc.nextInt();
                        System.out.println("DNI:");
                        int dni = sc.nextInt();
                        System.out.println("Calle:");
                        String calle = sc.next();
                        System.out.println("Nro calle:");
                        int numero = sc.nextInt();
                        System.out.println("Localidad:");
                        String localidad = sc.next();
                        System.out.println("Piso DTO:");
                        String pisoDTO = sc.next();
                        direccion dir = new direccion(calle, numero,localidad,pisoDTO);
                        System.out.println("Area:");
                        String area = sc.next();
                        System.out.println("Introduzca el número de asignaturas que da el docente:");
                        int numAsignaturas = sc.nextInt();
                        
                        String[] asignaturas = new String[numAsignaturas];
                        int contador=1;
                        for (int j = 0; j < numAsignaturas; j++) {
                            System.out.println("Ingrese la asignatura nro "+contador+": ");
                            asignaturas[j] = sc.next();
                            contador++;
                        }       Profesor docente = new Profesor(area, asignaturas, nombre, edad, dni, dir);
                        personas.add(docente);
                        break;
                    }
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }

        for (Persona persona : personas) {
            persona.mostrarSusDatos();
        }
    Persona[] personasArray = personas.toArray(new Persona[personas.size()]);
        mayores(personasArray);
        jubilados(personasArray);
        CABAresidentes(personasArray);
    }
    public static void mayores(Persona[] listaPersonas) {
        
        for (int i = 0; i < listaPersonas.length; i++) {
            if (listaPersonas[i].getEdad() >= 18) {
                System.out.println("Mayores de edad: ");
                System.out.println("Nombre: " + listaPersonas[i].getNombre());
            }
        }
    }

    public static void jubilados(Persona[] listaPersonas) {
        for (int i = 0; i < listaPersonas.length; i++) {
            if (listaPersonas[i].getEdad() >= 65) {
                System.out.println("En edad de jubilacion o mayores");
                System.out.println("Nombre: " + listaPersonas[i].getNombre());
            }
        }
    }

    public static void CABAresidentes(Persona[] listaPersonas) {
       for (int i = 0; i < listaPersonas.length; i++) {
            if (listaPersonas[i].getDir().getLocalidad().equals("CABA") ) {
                System.out.println("Los que viven en CABA:");
                System.out.println("Nombre: "+listaPersonas[i].getNombre() + "\n" +"DNI: "+listaPersonas[i].getDni());
            }
        }
    }  
}