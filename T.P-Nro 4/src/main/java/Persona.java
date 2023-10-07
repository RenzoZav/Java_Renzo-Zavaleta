public class Persona {

    private String nombre;
    private int edad;
    private int dni;
    private direccion dir;

    public Persona(String nombre, int edad, int dni, direccion dir) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.dir = dir;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public direccion getDir() {
        return dir;
    }

    public void setDir(direccion dir) {
        this.dir = dir;
    }

    public void mostrarSusDatos() {
        System.out.println("Me llamo " + nombre + ", tengo " + edad + " años y mi DNI es " + dni);
        System.out.println("Vivo en " + dir.getCalle() + ", " + dir.getNum());
    }
}