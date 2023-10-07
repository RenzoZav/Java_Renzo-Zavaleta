public class Profesor extends Persona {

    private String area;
    private String[] asignaturas;

    public Profesor(String area, String[] asignaturas, String nombre, int edad, int dni, direccion dir) {
        super(nombre, edad, dni, dir);
        this.area = area;
        this.asignaturas = asignaturas;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public void mostrarSusDatos() {
        super.mostrarSusDatos();
        System.out.println("Soy profesor de " + area);
        System.out.println("Imparto las siguientes asignaturas: ");
        for (String asignatura : asignaturas) {
            System.out.println("- " + asignatura);
        }
    }
}